package example4;

import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static int printResultOfLambda(Function<String, Integer> f) {
        System.out.println(f.apply(new java.util.Scanner(System.in).nextLine()));
        return 0;
    }
    public static void main(String[] args) {
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });

    }
}
