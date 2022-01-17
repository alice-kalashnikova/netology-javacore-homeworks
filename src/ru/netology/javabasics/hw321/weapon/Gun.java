package ru.netology.javabasics.hw321.weapon;

import ru.netology.javabasics.hw321.Weapon;

public class Gun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Ружье стреляет");
    }
}
