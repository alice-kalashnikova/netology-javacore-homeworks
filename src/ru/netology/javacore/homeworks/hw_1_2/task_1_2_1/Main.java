package ru.netology.javacore.homeworks.hw_1_2.task_1_2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> positiveNumbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        //1. Отфильтруйте положительные числа.
        for (int i: intList) {
            if (i > 0) {
                positiveNumbers.add(i);
            }
        };

        //2. Найдите среди этих положительных чисел четные.
        for(int i: positiveNumbers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        //3. Отсортируйте отфильтрованные числа в порядке возрастания.
        Collections.sort(evenNumbers);

        //4. Выведите результат на экран.
        for(int i: evenNumbers) {
            System.out.print(i + " ");
        }

    }
}
