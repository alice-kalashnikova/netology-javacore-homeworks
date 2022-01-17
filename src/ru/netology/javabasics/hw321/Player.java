package ru.netology.javabasics.hw321;

import ru.netology.javabasics.hw321.weapon.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                // TODO заполнить слоты оружием
                new Gun(),
                new WaterGun(),
                new Pistol(),
                new RPG(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        boolean isSlotCorrect = false;
        if (slot >= 0 && slot < weaponSlots.length) isSlotCorrect = true;

        if (isSlotCorrect == false && slot != -1) {
            System.out.println("Введен неверный номер слота");
            return;
        }

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }


}


