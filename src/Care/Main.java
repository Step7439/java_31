package Care;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Волга", "синяя", 170);
        Car car2 = new Car("Жигули", "белая", 40);
        Car car3 = new Car("Ока", "желтая", 3);

        car1.go();
        car2.go();
        car3.go();

        System.out.println("Наибольшее кол-во топлива: " + Car.fuelMax + " литров в автомобиле " + Car.fuelMaxCar);

    }
}
