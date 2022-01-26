package PrimitiveTypes;
import java.util.Scanner;

public class Texes {
    public static Scanner scanner = new Scanner(System.in);
    public static int earnings = 0;
    public static int spendings = 0;
    public static String input;

    public static int income(int earnings){
        int tax = earnings * 8 / 100;
        if(tax >= 0){
            return tax;
        }else {
            return 0;
        }
    }
    public static int incomeAndExpense(int earnings, int spendings) {
        int tax1 = ((earnings - spendings) * 15 / 100);
        if(tax1 >= 0){
            return tax1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {


        while(true) {
            int operation = Integer.parseInt(input);
            input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расходов: ");
                    String money1Str = scanner.nextLine();
                    int money1 = Integer.parseInt(money1Str);
                    spendings += money1;
                    break;
                case 3:
                    //Показывает методы и сравневает значения
                    break;
                default:
                    System.out.println("Такой оперций нет!");

            }System.out.println("Программа завершена!");
        }
    }
}
