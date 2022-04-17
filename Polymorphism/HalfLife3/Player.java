package Polymorphism.HalfLife3;

import Polymorphism.weapon.*;

public class Player {
    private Weapon[] weaponSlots = new Weapon[]{
            // TODO заполнить слоты оружием
            new BigGun(),
            new WaterPistol(),
            new Machine(),
            new RPG(),
            new Slingshot()
    };

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if (slot <= 0 || slot > getSlotsCount()) {
            System.out.println("Некорректно веден номер!");
            return;
        }

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot - 1];
        // Огонь!
        weapon.shot();
    }
}
