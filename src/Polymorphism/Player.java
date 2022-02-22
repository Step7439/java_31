package Polymorphism;

//import Polymorphism.weapon.BigGun;
import Polymorphism.weapon.*;

import java.util.Arrays;

public class Player {
    private Weapon[] weaponSlots = new Weapon[]{
        // TODO заполнить слоты оружием
         new BigGun(),
         new WaterPistol(),
         new Machine(),
         new RPG(),
         new Slingshot()
    };

    public int getSlotsCount(){
        return weaponSlots.length;
    }
    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if(slot >= getSlotsCount()) {
            System.out.println("Некорректно веден номер!");
            return;
        }

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }


}
