package SumArrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {-2.398};
        System.out.println(sum(numbers));
    }
    public static double sum(double[] numbers) {
        double x = 0;
        for (int i = 0; i < numbers.length; i++){
            x += numbers[i];
        }
        return x;
    }
}
