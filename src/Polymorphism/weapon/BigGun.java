package Polymorphism.weapon;

public class BigGun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Большой пистолет");
        System.out.println("Паф-паф-паф");
    }
}
