package ru.netology.javacore.lectures.lecture1.example1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int sum = calc.sum(1, 2);
        System.out.println(sum);

        //анонимный класс:
        ISum summer = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        int sum2 = summer.sum(1, 2);
        System.out.println(sum2);

        //лямбда выражение:
        ISum summer3 = (a, b) -> a + b;
        int sum3 = summer3.sum(1, 2);
        System.out.println(sum3);

        //пример вывода строки в консоль:
        final Consumer<String> consumer = (s) -> System.out.println(s);

        final ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.forEach(consumer);

        consumer.accept("test");
    }
}
