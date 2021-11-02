package xg.service;

import org.apache.catalina.User;
import xg.beans.Role;
import xg.beans.UserManager;

public interface UserService {
    UserManager login(UserManager u);

    int addRole(Role r);
}
