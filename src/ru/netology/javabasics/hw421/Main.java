package ru.netology.javabasics.hw421;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        while(true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            String input = scanner.nextLine();
            int floor = Integer.parseInt(input);
            if (floor < 0 || floor > 25)  {
                System.out.println("Такого этажа нет в доме");
            } else {
                if (floor == 0) {
                    break;
                }
                queue.add(floor);
            }
        }
        System.out.println("Лифт проследовал по следующим этажам:");
        while(!queue.isEmpty()) {
            System.out.print("этаж " + queue.poll() + " -> ");
        }
        System.out.println("этаж 0");
    }
}
