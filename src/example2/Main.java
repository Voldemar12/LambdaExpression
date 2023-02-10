package example2;
import java.util.function.Function;

public class Main {

    Function<Integer, Integer> adder1 = x -> x + 1;

    Function<Integer, Integer> mult2 = (Integer x) -> x * 2;

    Function<Integer, Integer> adder5 = (x) -> {
        x += 2;
        x += 3;
        return x;
    };


    public static void main(String[] args) {

    }
}
