package MultidimensionalArray;
import java.util.Scanner;

public class GamesCross {
        public static final int SIZE = 3;
        public static final char EMPTY = '-';
        public static final char CROSS = 'X';
        public static final char ZERO = 'O';

        // Заполняет игравое поле '-'
        public static void main(String[] args) {
            char[][] field = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    field[i][j] = EMPTY;
                }
            }

            Scanner scanner = new Scanner(System.in);
            //
            boolean isCrossTurn = true;

            while (true) {
                printField(field);
                System.out.println("Ходят " + (isCrossTurn ? "крестики" : "нолики") + "!");
                //Ход и разбиваем по пробелу
                String input = scanner.nextLine(); // "2 3"
                String[] parts = input.split(" "); // ["2" , "3"]
                int r = Integer.parseInt(parts[0]) - 1; // 2-1 = 1
                int c = Integer.parseInt(parts[1]) - 1; // 3-1 = 2

                //Проверка на занятность клетки
                if (field[r][c] != EMPTY) {
                    System.out.println("Сюда ходить нельзя");
                    continue;
                }
                //Ход игрока
                field[r][c] = isCrossTurn ? CROSS : ZERO;
                //Проверяем на выеграш
                if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                    printField(field);
                    System.out.println("Победили " + (isCrossTurn ? "крестики" : "нолики"));
                    break;
                } else {
                    //Переключаем игрока
                    if (isCrossTurn) {
                        isCrossTurn = false;
                    } else {
                        isCrossTurn = true;
                    }
                    //isCrossTurn = !isCrossTurn;
                }
            }

            System.out.println("Игра закончена!");
        }

        // !!ВНИМАНИЕ!!
        // Работает только для 3x3
        // Этот метод вам и надо переписать

        public static boolean isWin(char[][] field, int player) {
            int sum = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if(field[i][j] == player){
                        sum++;
                        if(sum == SIZE){
                    return true;
                        }
                    }
                }
            }
           return false;
        }
        //Выводит поле
        public static void printField(char[][] field) {
                for (char[] row : field) {
                    for (char cell : row) {
                        System.out.print(cell + " ");
                    }
                    System.out.println();
                }
        }
}


