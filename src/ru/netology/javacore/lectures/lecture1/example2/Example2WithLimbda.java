package ru.netology.javacore.lectures.lecture1.example2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example2WithLimbda {
    public static void main(String[] args) {
        //()->{}

        List<String> cities = Arrays.asList("Madrid", "Paris", "Moscow", "Tokio");

        Collections.sort(cities, (a, b) -> b.compareTo(a));

//        for (String city: cities) {
//            System.out.println(city);
//        }

//        final Consumer<String> consumer = (s) -> System.out.println(s);
//        cities.forEach(consumer);

        cities.forEach(System.out::println);
    }

    //лямбда выражение - короткая запись анонимного класса

}
