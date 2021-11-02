package xg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginCtrl {
    @RequestMapping("/login")
    public String login(HttpSession session, String username){
        System.out.println("session:"+session);
        session.setAttribute("username",username);
        System.out.println("name:"+username+",sessionID："+session.getId());
        return "success";
    }
    @RequestMapping("/getuserName")
    public String getName(HttpSession session){
        return (String)session.getAttribute("username");
    }
}
