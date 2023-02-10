package closures;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;
        System.out.println(helloFunction.apply("Adele"));
        System.out.println(helloFunction.apply("Voldemar"));

        int constant = 100;
        Function<Integer, Integer> adder100 = x -> x + constant;

        System.out.println((adder100.apply(200)));
        System.out.println(adder100.apply(400));
    }
}
