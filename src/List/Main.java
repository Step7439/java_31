package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<String> list =new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Выберите действие:\n" +
                "1. Добавить задачу\n" +
                "2. Вывести список задач\n" +
                "3. Удалить задачу\n" +
                "0. Выход");

    }
//    public static void notbook() {
//        String input = scanner.nextLine();
//        switch (input) {
//            case 1:
//                list = input;
//        }
//    }
}
