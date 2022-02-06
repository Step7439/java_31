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

    public void go() {
        if (fuel > 10) {
            System.out.println("Наибольшее кол-во топлива: " + Car.fuelMax + " литров в автомобиле " + name);
            System.out.println("Можно ехать " + name);
        } else if (fuel > 0 && fuel <= 10) {
            System.out.println("Топливо скоро закончится " + name);
            fuelMaxCar = name;
        } else {
            System.out.println("Пустой бак " + name);
        }
    }
//    public void str(){
//        System.out.println("Наибольшее кол-во топлива: " + Car.fuelMax + " литров в автомобиле " + fuelMaxCar);
//    }
}
