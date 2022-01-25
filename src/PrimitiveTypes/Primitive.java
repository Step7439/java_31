package PrimitiveTypes;
import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float x = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float c = scanner.nextFloat();

        if(Math.abs(x - c) < 0.001){
            System.out.println("числа ровны");
        }else if(x < c){
            System.out.println("числа не ровны " + Math.round(c));
        }else {
            System.out.println("числа не ровны " + Math.round(x));
        }
    }
}

