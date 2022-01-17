package ru.netology.javabasics.hw211;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Молоко", "Хлеб", "Гречневая крупа", "Помидоры", "Сгущенка"};
        int[] prices = {50, 20, 30, 5, 15};
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i].toString() + " - " + prices[i] + " руб.");
        }
//        System.out.println(Arrays.toString(products));
//        System.out.println(Arrays.toString(prices));

        int productNumber = 0;
        int productCount = 0;

        int currentPrice = prices[productNumber];
        int sumProducts = 0;

        Scanner scanner = new Scanner(System.in);
        int[] cart = new int[products.length];
        while (true) {
            System.out.println("Выберите товар и количество через пробел или введите `end`");
            String input = scanner.nextLine();
            String inputArray[] = input.split(" ");

            if (input.equals("end")) {
                break;
            }
            productNumber = Integer.parseInt(inputArray[0]) - 1;
            productCount = Integer.parseInt(inputArray[1]);

            currentPrice = prices[productNumber];

            cart[productNumber] = cart[productNumber] + productCount;
            sumProducts += currentPrice * productCount;
        }
        System.out.println("Ваша корзина:");
        System.out.println("-------------------------------------------------------");
//        System.out.printf("%s %9s %6s %s\n", "Наименование товара | ", "Количество | ", "Цена | ", "Стоимость");
        System.out.printf("%20s %10s %6s %s\n", "Наименование товара | ", "Количество | ", "Цена | ", "Стоимость");

        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] >0 ) {
//                System.out.printf("%10s %19s %13s %8s\n", products[i], cart[i], prices[i], cart[i] * prices[i]);
                System.out.printf("%20s %8s %10s %10s\n", products[i], cart[i], prices[i], cart[i] * prices[i]);

            }
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Итоговая сумма: " + sumProducts);
        System.out.println("-------------------------------------------------------");
    }
}
