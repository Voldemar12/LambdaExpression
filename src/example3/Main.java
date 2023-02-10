package example3;

import java.util.function.Function;

public class Main {
    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("Happy new Year"));
    }
    private static void printResultOfLambda(){
        System.out.println("Happy new Year");
    }
    public static void oneMoreMethod(Function<String, Integer> f) {
        System.out.println(f.apply("string"));
    }
    public static void oneMoreMethod2(Function<String, Integer> f) {
        System.out.println(f.apply("yes"));
    }


    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        Function<Integer, Integer> function2 = i -> i++;
        printResultOfLambda();
        printResultOfLambda(f);
       // oneMoreMethod(function);
        //oneMoreMethod2(function2);
        }
    }
