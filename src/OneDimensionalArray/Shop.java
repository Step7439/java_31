package OneDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    public static String[] products = {"Хлеб", "Яблоки", "Молоко"};
    public static int[] prices = {100, 200, 300};
    public static int[] product1 = new int[prices.length];
    public static int[] product2 = new int[prices.length];
    public static String[] product3 = new String[products.length];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Список возможных товаров для покупки");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + "." + " " + products[i] + " " + prices[i] + " руб/шт");

            }
            System.out.print(">> ");
            String inputString = scanner.nextLine();

            if(inputString.equals("end")){
                break;
            }

            String[] input = inputString.split(" ");
            int productNumber = Integer.parseInt(input[0]) -1;
            int productCount = Integer.parseInt(input[1]);

            int currentPrice = prices[productNumber];
            product1[productNumber] = currentPrice * productCount;
            product2[productNumber] = productCount;
            product3[productNumber] = products[productNumber];
                System.out.println(Arrays.toString(product3));

        }
    }
    }

