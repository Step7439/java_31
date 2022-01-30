package PrimitiveTypes;
import java.util.Scanner;

public class Primitive {
    public static Scanner scanner = new Scanner(System.in);
    public static void compare(){
        System.out.println("Введите первое число:");
            float oneNumber = scanner.nextFloat();
            System.out.println("Введите второе число:");
            float twoNumber = scanner.nextFloat();

            if (Math.abs(oneNumber - twoNumber) < 0.001) {
                System.out.println("Результат: числа ровны");
            } else if (oneNumber < twoNumber) {
                System.out.println("Результат: " + twoNumber + " Больше чем " + oneNumber);
            } else {
                System.out.println("Результат: " + oneNumber + " Больше чем " + twoNumber);
            }

    }
    public static void roundUP(){
        System.out.println("Ведите не целое чесло: ");
        double oneDouble = scanner.nextDouble();
        double result = Math.round(oneDouble);
        System.out.println("Результат: " + result);

    }
    public static void fraction(){
        System.out.println("Ведите число: ");
        double oneDouble = scanner.nextDouble();
        int result = (int) oneDouble;
        System.out.println("Результат: " + result);
    }
    public static void main(String[] args) {


        while (true){
            System.out.println("Операции над double/float");
            System.out.println("1. Сравнить");
            System.out.println("2. Округлить");
            System.out.println("3. Отбросить дробную часть");

            System.out.print(">>");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    compare();
                    break;
                case 2:
                    roundUP();
                    break;
                case 3:
                    fraction();
                    break;
                default:
                    System.out.println("Не коректное число");
                    continue;
            }
        }
    }
}

