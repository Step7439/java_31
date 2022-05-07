package CountOfPositivesSumOfNegatives;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sum = new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
        System.out.println(Arrays.toString(sumaMas(sum)));
    }
    public static int[] sumaMas(int[] input) {
        int[] suma = new int[2];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0 && input[i] != 0 ) suma[0] += 1;
            if (input[i] < 0 && input[i] != 0) suma[1] += input[i];
        }
        return suma;
    }
}


