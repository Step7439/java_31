package Numbers;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        int pley1 = scanner.nextInt();
        Games petay = new Games(pley1, "Petay");
        System.out.print(">>");
        int pley2 = scanner.nextInt();
        Games vasy = new Games(pley2, "Vasy");
        System.out.print(">>");
        int pley3 = scanner.nextInt();
        Games vova = new Games(pley3, "Vovka");

        petay.logikGames();
        vasy.logikGames();
        vova.logikGames();
    }
}
