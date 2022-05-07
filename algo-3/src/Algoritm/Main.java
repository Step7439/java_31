package Algoritm;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(binarimSerch(array, 32));
    }

    public static int binarimSerch(int[] array, int number) {
        int low = 0;
        int haed = array.length - 1;
        while (low <= haed) {
            int min = low + (haed - low) / 2;
            if (array[min] == number) return min;
            if (array[min] <= number) low = min + 1;
            if(array[min] >= number)haed = min - 1;

        }return -1;

    }

}

