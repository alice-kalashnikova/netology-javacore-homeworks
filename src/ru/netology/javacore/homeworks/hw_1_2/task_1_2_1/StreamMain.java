package ru.netology.javacore.homeworks.hw_1_2.task_1_2_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0)                           //1. Отфильтруйте положительные числа.
                .filter(x -> x % 2 == 0)                    //2. Найдите среди этих положительных чисел четные.
                .sorted(Comparator.naturalOrder())          //3. Отсортируйте отфильтрованные числа в порядке возрастания.
                .forEach(x -> System.out.print(x + " "));   //4. Выведите результат на экран.
    }
}
