package Care;

public class Car {
    public String name;
    public String colour;
    public int fuel;
    public static int fuelMax;
    public static String fuelMaxCar;

    public Car (String name, String colour, int fuel) {
        this.name = name;
        this.colour = colour;
        this.fuel = fuel;
        fuelMax = Math.max(fuelMax, fuel);
    }
    public String toString() {
        return colour + " " + name;
    }

    public void go() {
        if (fuel > 10) {
            System.out.println("Можно ехать " + name);
            fuelMaxCar = name;
        } else if (fuel > 0 && fuel <= 10) {
            System.out.println("Топливо скоро закончится " + name);
        } else {
            System.out.println("Пустой бак " + name);
        }
    }
}
