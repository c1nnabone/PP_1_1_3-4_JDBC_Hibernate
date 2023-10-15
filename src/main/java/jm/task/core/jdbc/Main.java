package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Semen", "Petrov", (byte) 25);
        service.saveUser("Igor", "Krabov", (byte) 25);
        service.saveUser("Petr", "Glinin", (byte) 25);
        service.saveUser("Arkadiy", "Parovozov", (byte) 25);
        System.out.println(service.getAllUsers());
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}