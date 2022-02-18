package MultidimensionalArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static final int SIZE = 8;
    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(255);
            }
        }
        System.out.println("Поворот матрицы на 90/180/270 градусов:");
        toMatrix(colors);
        System.out.print(">> ");

        int input = scanner.nextInt();
        switch (input){
            case 90:
                System.out.println("Вывод на 90 радусов");
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE - 1 - j][i];
                    }
                }
                toMatrix(rotatedColors);
                break;
            case 180:
                System.out.println("Вывод на 180 радусов");
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[(SIZE - 1) - i][(SIZE - 1) - j];
                    }
                }
                toMatrix(rotatedColors);
                break;
            case 270:
                System.out.println("Вывод на 270 радусов");
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                    }
                }
                toMatrix(rotatedColors);
                break;
            default:
                System.out.println("Не корректное число !!!");
        }
    }

    public static void toMatrix(int[][] colors){
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.format("%4d", colors[i][j]);
                }
                System.out.println();
            }
    }
}

