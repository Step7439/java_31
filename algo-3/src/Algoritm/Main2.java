package Algoritm;

public class Main2 {
    public static void main(String[] args) {
        int[] array = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(binarimSerch(array, 69));
    }
    public static int binarimSerch(int[] array, int number) {
        int low = 0;
        int haed = array.length - 1;
        while (low <= haed) {
            int min = (haed + low) / 2;
            if (array[min] <= number && number < array[min + 1]) return array.length - (min + 1);
            else if (array[min] <= number) low = min + 1;
            else if (array[min] >= number) haed = min - 1;


        }
        return - 1;
    }
}
