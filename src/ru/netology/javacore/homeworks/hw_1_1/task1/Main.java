package ru.netology.javacore.homeworks.hw_1_1.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); //3
        int b = calc.minus.apply(1,1); //0
        int c = calc.devide.apply(a, b); // 3 / 0
        int d = calc.abs.apply(a);
        int e = calc.abs.apply(-3);

        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
    }
}
