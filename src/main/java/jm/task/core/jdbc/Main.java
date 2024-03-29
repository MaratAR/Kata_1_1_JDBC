package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("AAA", "AA", (byte) 11);
        userService.saveUser("BBB", "BB", (byte) 22);
        userService.saveUser("CCC", "CC", (byte) 33);
        userService.saveUser("DDD", "DD", (byte) 44);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
