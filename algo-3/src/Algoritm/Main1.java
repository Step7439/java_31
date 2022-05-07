package Algoritm;

public class Main1 {
    public static void main(String[] args) {
        int[] array = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(binarimSerch(array, 32));
    }

    public static int binarimSerch(int[] array, int number) {
        //int low = 0;
        int haed = array.length;
        for(int i = 0; i < haed; i++) {
            if (array[i] == number) return array[i] - 1;

        }return -1;

    }
}
