package xg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xg.beans.Perm;
import xg.beans.Role;
import xg.beans.UserManager;
import xg.dao.UserDao;
import xg.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;
    @Override
    public UserManager login(UserManager u) {
        u=dao.selectUser(u);
        return u;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addRole(Role r) {
        System.out.println("插入前："+r);
        int rs=dao.insertRole(r);
        System.out.println("插入后："+r);
        if(rs<=0){
            return rs;
        }
        List<Perm> perms = r.getPerms();
//        for (Perm perm : perms) {
//            dao.insertPermsForRole(perm.getId(),r.getId());
//        }
        perms.forEach(p -> {
            int res=dao.insertPermsForRole(p.getId(),r.getId());
            if(res<=0){
                throw new RuntimeException("添加权限失败");
            }
        });
        return rs;

    }
}
