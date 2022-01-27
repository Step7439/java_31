package ConditionalStatementsCycles;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате \"yyyy\"");
        int x1 = scanner.nextInt();
        yaer(x1);
    }
    public static void yaer( int x){

        if (x % 400 == 0 || x % 4 == 0) {
            System.out.println("Количество дней 366");
        } else if (x % 100 != 0) {
            System.out.println("Количество дней 365");
        }
    }
}
