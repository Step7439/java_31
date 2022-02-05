package Numbers;
import java.util.Scanner;

public class Games {


    public void logikGames(int user){
        System.out.println("Ведите любое число!");
        double number = (Math.random() * 10);
        int numberInt = (int) Math.round(number);
        if(numberInt == user){
            System.out.println("Поздровляю вы угодали число - " + numberInt);
        }else {
            System.out.println("Вы не угодали это чесло - " + numberInt);
            }

    }
}
