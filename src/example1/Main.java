package example1;

import java.util.function.BiFunction;

public class Main {

    public boolean isDivisible(int x, int y) {
        return x % y == 0;
    }
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;
        //System.out.println("Java method: " + Divisible.apply);
       // System.out.println(isDivisible.apply("Лямбда функция: " + isDivisible.apply(3, 4));
    }
}