package Numbers;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Games petay = new Games(4, "Petay");
        Games vasy = new Games(7, "Vasy");
        Games vova = new Games(0, "Vovka");

        petay.logikGames();
        vasy.logikGames();
        vova.logikGames();
    }
}
