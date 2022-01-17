package ru.netology.javabasics.hw321;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        while(true) {
            // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти%n",
                    player.getSlotsCount()
            );
            int slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot);
        }
        System.out.println("Game over!");
    }
}
