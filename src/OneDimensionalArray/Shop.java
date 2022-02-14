package OneDimensionalArray;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        String[] products1 = new String[];
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + "." + " " + products[i] + " " + prices[i] + " руб/шт");
        }
        while (true){
            System.out.print(">> ");
            String inputString = scanner.nextLine();
            if(inputString.equals("end")){
                break;
            }
            String[] input = inputString.split(" ");
            int productNumber = Integer.parseInt(input[0]) -1;
            int productCount = Integer.parseInt(input[1]) -1;
//            System.out.println(products[productNumber]);
//            System.out.println(prices[productCount]);
            for(String name: products)

        }
    }
}
