package ConditionalStatementsCycles;

import java.util.Scanner;

public class leapYear {
    public static int yaer(int x) {
        if (x % 400 == 0 || x % 4 == 0) {
            x = 366;
        } else if (x % 100 != 0) {
            x = 365;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате \"yyyy\"");
        int x1 = scanner.nextInt();
        int sum = yaer(x1);
        System.out.println("Количество дней " + sum);
    }
}
