package ru.netology.javacore.lectures.lecture1.example1;

public class Calc implements ISum {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
