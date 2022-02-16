package MultidimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static final int SIZE = 8;
    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void toMatrix(int[][] colors) {
        System.out.println("Дана следующая матрица:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println("Вывод:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - i -1][j];
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(255);
                rotatedColors = colors;
            }
        }
        toMatrix(colors);
    }
}