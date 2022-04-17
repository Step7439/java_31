package Numbers;
import java.util.Scanner;

public class Games {
    public int user;
    public String name;

    public Games(int user, String name){
       this.user = user;
       this.name = name;
    }

    public void logikGames() {
        System.out.println("Ведите любое число!");
        double number = (Math.random() * 10);
        int numberInt = (int) Math.round(number);
        if (numberInt == user) {
            System.out.println("Поздровляю вы угодали число - " + numberInt);
            System.out.println("Побидитель - " + name);
        } else {
            System.out.println("Вы не угодали это чесло - " + numberInt);
        }
        System.out.println();

    }
}
