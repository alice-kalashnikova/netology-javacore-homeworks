package ru.netology.javacore.lectures.lecture1.example2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2WithComparator {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Madrid", "Paris", "Moscow", "Tokio");
        Collections.sort(cities, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        for (String city: cities) {
            System.out.println(city);
        }
    }
}
