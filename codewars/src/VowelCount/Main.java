package VowelCount;

public class Main {
    public static void main(String[] args) {
        String str = "abracadabra";
        System.out.println(getCount(str));
    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char x : str.toCharArray()){
            if (x == 'a') vowelsCount++;
            if (x == 'e') vowelsCount++;
            if (x == 'i') vowelsCount++;
            if (x == 'o') vowelsCount++;
            if (x == 'u') vowelsCount++;
        }
        return vowelsCount;
    }
}
