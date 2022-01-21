import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате \"yyyy\"");
        int yaar = scanner.nextInt();

        if(yaar % 400 == 0 || yaar % 4 == 0){
            System.out.println("Количество дней 365");
        }else if (yaar % 100 != 0){
            System.out.println("Количество дней 366");
        }System.out.println(yaar);
    }
}
