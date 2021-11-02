package xg.controller;

import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xg.beans.AjaxResult;
import xg.beans.Role;
import xg.beans.UserManager;
import xg.service.UserService;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserCtrl {
    @Autowired
    UserService service;

    @GetMapping("/login")
    public UserManager doLogin(UserManager u, HttpSession session){
        UserManager us= service.login(u);
        if(us!=null){
            session.setAttribute("user",us);
        }
        return us;
    }

    @PostMapping("/role")
    public AjaxResult addRole(@RequestBody Role r){
        int rs=service.addRole(r);
        AjaxResult res=new AjaxResult();
        res.setSuccess(rs>0);
        return res;
    }

}
