package book;

import java.util.Arrays;

public class bookPages {
    public static int pages(int a, int b, int c){
        int t = a + b + c;
        return t;
    }
    public static void about(){
        String[] book1 = new String[] {"Лермонтов", "Толстой", "Есенин"};

            System.out.println(Arrays.toString(book1));

    }
}
