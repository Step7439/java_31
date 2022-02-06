package Care;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Волга", "синяя", 11);
        Car car2 = new Car("Жигули", "белая", 30);
        Car car3 = new Car("Ока", "желтая", 10);

        car1.setgo();
        car2.setgo();
        car3.setgo();

        System.out.println("Наибольшее кол-во топлива: " + Car.fuelMax + " литров в автомобиле " + Car.fuelMaxCar);

    }
}
