package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<String> list = new ArrayList<>();

    public static void addTask() {
        System.out.println("Добавить задачу:");
        String str = scanner.nextLine();
        list.add(str);
    }

    public static void listTask() {
        System.out.println("Список задачь:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public static void remoweTask() {
        try {
            System.out.println("Вывести номер задачи для удоления:");
            String j = scanner.nextLine();
            int i = Integer.parseInt(j);
            list.remove(i - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Нет такой задачи!");
        }
    }

    public static void main(String[] args) {
        notbook();
    }

    public static void notbook() {
        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            System.out.print(">> ");
            try {

                String inputend = scanner.nextLine();
                int input = Integer.parseInt(inputend);
                if (input == 0) {
                    break;
                }

                switch (input) {
                    case 1:
                        addTask();
                        break;
                    case 2:
                        listTask();
                        break;
                    case 3:
                        remoweTask();
                        break;
                    default:
                        System.out.println("Такой оперций нет!");
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Водить тока цифры!");
                System.out.println();
            }
        }
    }
}
