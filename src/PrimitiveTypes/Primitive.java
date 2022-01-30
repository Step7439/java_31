package PrimitiveTypes;
import java.util.Scanner;

public class Primitive {
    public static Scanner scanner = new Scanner(System.in);
    public static void compare(){
        System.out.println("Введите первое число:");
            float x = scanner.nextFloat();
            System.out.println("Введите второе число:");
            float c = scanner.nextFloat();

            if (Math.abs(x - c) < 0.001) {
                System.out.println("Результат: числа ровны");
            } else if (x < c) {
                System.out.println("Результат: " + c + " Больше чем " + x);
            } else {
                System.out.println("Результат: " + x + " Больше чем " + c);
            }

    }
    public static void roundUP(){
        System.out.println("Ведите не целое чесло: ");
        double x = scanner.nextDouble();
        double c = Math.round(x);
        System.out.println("Результат: " + c);

    }
    public static void fraction(){
        System.out.println("Ведите число: ");
        double x = scanner.nextDouble();
        int c = (int) x;
        System.out.println("Результат: " + c);
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

