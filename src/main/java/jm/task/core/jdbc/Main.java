package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.event.spi.SaveOrUpdateEvent;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        System.out.println("User с именем Ivan добавлен в базу данных");

        userService.saveUser("Petr", "Petrov", (byte) 30);
        System.out.println("User с именем Petr добавлен в базу данных");

        userService.saveUser("Sergey", "Sidorov", (byte) 35);
        System.out.println("User с именем Sergey добавлен в базу данных");

        userService.saveUser("Vladimir", "Kojemiaka", (byte) 45);
        System.out.println("User с именем Vladimir добавлен в базу данных");

        System.out.println("Все пользователи в базе:");
        userService.getAllUsers().forEach(System.out::println);


        userService.cleanUsersTable();
        System.out.println("ЧИСТКА ТАБЛИЦЫ");

        userService.dropUsersTable();
        System.out.println("Удаление таблицы");
    }
}
