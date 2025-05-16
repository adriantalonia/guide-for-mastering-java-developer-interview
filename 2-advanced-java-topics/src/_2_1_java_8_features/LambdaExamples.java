package _2_1_java_8_features;

import java.util.function.*;

public class LambdaExamples {

    public static void main(String[] args) {
        exampleNoParameters();
        exampleOneParameter();
        exampleTwoParameters();
        threadExampleBefore();
        threadExampleAfter();
        syntaxExamples();
    }

    // ✅ 2.1.1 - Lambda with no parameters
    public static void exampleNoParameters() {
        Runnable r = () -> System.out.println("Running!");
        r.run();
    }

    // ✅ 2.1.1 - Lambda with one parameter
    public static void exampleOneParameter() {
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        greet.accept("Alice");
    }

    // ✅ 2.1.1 - Lambda with two parameters
    public static void exampleTwoParameters() {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(5, 3));
    }

    // 👎 Before Lambda (Anonymous Inner Class)
    public static void threadExampleBefore() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread (before)");
            }
        }).start();
    }

    // 👍 After Lambda
    public static void threadExampleAfter() {
        new Thread(() -> System.out.println("Hello from thread (after)")).start();
    }

    // ✅ 2.1.2 - Basic Syntax, Parameters, Return, Expression vs Block Body
    public static void syntaxExamples() {

        // Lambda with no parameters and expression body
        Runnable noParam = () -> System.out.println("Lambda: No parameters");
        noParam.run();

        // Lambda with single parameter and expression body
        Consumer<String> singleParam = x -> System.out.println("Hello, " + x);
        singleParam.accept("World");

        // Lambda with two parameters and expression body
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.apply(4, 5));

        // Lambda with two parameters and block body
        BiFunction<Integer, Integer, Integer> multiplyVerbose = (a, b) -> {
            System.out.println("Multiplying " + a + " * " + b);
            return a * b;
        };
        System.out.println("Verbose multiplication: " + multiplyVerbose.apply(3, 6));

        // Lambda with inferred return (no return keyword)
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

        // Lambda with explicit return
        Function<Integer, Boolean> isEven = x -> {
            return x % 2 == 0;
        };
        System.out.println("Is 10 even? " + isEven.apply(10));
    }
}

