package Queue;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Deque<Integer> list = new LinkedList<>();
    public static int num;

    public static void arrow() {
        System.out.print(" -> ");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int input = scanner.nextInt();
            if (input >= 0 && input <= 25) {
                if (input != num) {
                    num = input;
                    list.offer(num);
                }
            } else {
                System.out.println("Такого этажа нет в доме");
            }

            if (input == 0) {
                System.out.println("Лифт проследовал по следующим этажам:");

                for (int s : list.stream().toList()) {
                    System.out.print("этаж " + list.poll());
                    if (s != list.size()) {
                        arrow();
                    }
                } break;
            }
        }
    }
}