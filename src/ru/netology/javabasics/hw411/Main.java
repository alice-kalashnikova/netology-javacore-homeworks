package ru.netology.javabasics.hw411;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> todoList = new ArrayList<>();

        while(true) {
            System.out.println("Введите название задачи (для завершения введите end)");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                print(todoList);
                break;
            }
            todoList.add(input);
        }

        while(true) {
            System.out.println("Введите номер задачи, которую хотите удалить (для завершения введите Finish)");
            String input = scanner.nextLine();
            if (input.equals("Finish")) {
                print(todoList);
                break;
            }
            todoList.remove(Integer.parseInt(input));
            print(todoList);
        }
    }

    private static void print(List<String> todoList) {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " " + todoList.get(i));
        }
    }
}
