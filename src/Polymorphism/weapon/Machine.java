package Polymorphism.weapon;

public class Machine extends Weapon {
    @Override
    public void shot() {
        System.out.println("Автомат");
        System.out.println("Та-та-та");

    }
}
