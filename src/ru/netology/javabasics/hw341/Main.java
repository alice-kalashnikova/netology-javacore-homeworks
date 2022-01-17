package ru.netology.javabasics.hw341;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Доступ предоставлен");
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("Vasya", "vasya.pupkin@ya.ru", "12345", 15);
        return new User[]{user1, user2};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException  {
        if (user.age < 18)
            throw new AccessDeniedException("Access Denied");
    }
}
