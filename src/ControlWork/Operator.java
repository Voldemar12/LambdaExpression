package ControlWork;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Operator {
    public static IntBinaryOperator binaryOperator = (x, y) -> {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    };
}
