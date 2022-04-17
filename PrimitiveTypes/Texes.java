package PrimitiveTypes;
import java.util.Scanner;

public class Texes {
    public static Scanner scanner = new Scanner(System.in);
    public static int income(int earnings) {
        int tax = (int )(earnings * 0.06);
        if (tax >= 0) {
            return tax;
        } else {
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
        int earnings = 0;
        int spendings = 0;

        while(true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать ситему налогооблажения\n");
            String exit = scanner.nextLine();
            if ("end".equals(exit)) {
                System.out.println("Программа завершена!");
                break;
            }

            int operation = Integer.parseInt(exit);
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
                    int earningsResult = income(earnings);
                    int earningsSpendingsResult = incomeAndExpense(earnings, spendings);
                    if(earningsResult <= earningsSpendingsResult){
                        System.out.println("Мы советуем вам УСН доходы:\n" +
                                "Ваш налог составит: " + earningsResult + " рублей\n" +
                                "Налог на другой системе: " + earningsSpendingsResult + " рублей\n" +
                                "Экономия: " + (earningsSpendingsResult - earningsResult) + " рублей");
                    }else {
                        System.out.println("Мы советуем вам УСН доходы и расходы:\n" +
                                "Ваш налог составит: " + earningsSpendingsResult + " рублей\n" +
                                "Налог на другой системе: " + earningsResult + " рублей\n" +
                                "Экономия: " + (earningsSpendingsResult - earningsResult) + " рублей");
                        }
                    System.out.println();
                    break;
                default:
                    System.out.println("Такой оперций нет!");
            }
        }

    }
}
