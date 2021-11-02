package xg.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xg.beans.Role;
import xg.beans.UserManager;
@Mapper
@Repository
public interface UserDao {
    UserManager selectUser(UserManager u);

    int insertRole(Role r);

    int insertPermsForRole(@Param("permid") Integer perm_id, @Param("roleid") Integer role_id);
}
