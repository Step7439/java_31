package ConditionalStatementsCycles;

import java.util.Scanner;


public class leapYear2 {
        public static Scanner scanner = new Scanner(System.in);
        public static int c = 0;
        public static void main(String[] args) {
            logicOfTheGame();
        }
            public static void logicOfTheGame() {
                while (true) {
                    System.out.println("Введите год в формате: yyyy количество-дней");
                    int yaar = scanner.nextInt();
                    int day = scanner.nextInt();


                    if (yaar % 400 == 0 || yaar % 4 == 0 && day == 366) {
                        //System.out.println("Error");
                        c++;

                    } else if (yaar % 400 != 0 && yaar % 4 != 0 && day == 365) {
                        //System.out.println("Error2");
                        c++;

                    } else if (yaar % 100 != 0 && day != 365) {
                        System.out.println("Неправильно! В этом году 365 дней!");
                        System.out.println("Набрано очков:" + c);
                        break;
                    } else {
                        System.out.println("Неправильно! В этом году 366 дней!");
                        System.out.println("Набрано очков:" + c);
                        break;
                }
            }
        }
}
