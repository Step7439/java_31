package ProgramStructure;

import java.util.Scanner;

public class SumThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int value2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int value3 = scanner.nextInt();
        int result  = sum(value1, value2, value3);
        System.out.println("Сумма чисел = " + result);

    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}
