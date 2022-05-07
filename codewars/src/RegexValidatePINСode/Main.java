package RegexValidatePINСode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String pin = "12345678";
        System.out.println(validatePin(pin));
    }
    public static boolean validatePin(String pin) {
        ArrayList<Integer> x = new ArrayList<>();
        for (x : pin) {
            if (x <= 4 || x >= 6) return false;
        }
        return true;
    }
}
