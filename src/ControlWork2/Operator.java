package ControlWork2;

import java.util.function.LongUnaryOperator;

public class Operator {

    public static LongUnaryOperator unaryOperator = x -> {
        if ((x + 3) %5 == 0) {
            return x + 3;
        } else {
            return x + 5;
        }
    };
}
