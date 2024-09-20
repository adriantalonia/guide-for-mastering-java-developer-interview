package _1_1_java_basics._1_1_4_control_flow_statements;

import java.util.Arrays;
import java.util.List;

public class ControlFlowStatementsExamples {
    public static void main(String[] args) {
        // --------- 1.1.4.1 Conditional Statements ---------

        // if Statement
        System.out.println("1. Conditional Statements - if Statement:");
        int a = 10;
        if (a > 5) {
            System.out.println("a is greater than 5");
        }

        // if-else Statement
        System.out.println("\n2. Conditional Statements - if-else Statement:");
        if (a < 5) {
            System.out.println("a is less than 5");
        } else {
            System.out.println("a is 5 or greater");
        }

        // Enhanced instanceof Operator
        System.out.println("\n3. Conditional Statements - Enhanced instanceof:");
        Object obj = "Hello, World!";
        if (obj instanceof String s) {
            System.out.println("String value: " + s);
        }

        // switch Statement
        System.out.println("\n4. Conditional Statements - switch Statement:");
        int day = 4;
        String dayName;
        switch (day) {
            case 1 -> dayName = "Monday";
            case 2 -> dayName = "Tuesday";
            case 3 -> dayName = "Wednesday";
            case 4 -> dayName = "Thursday";
            case 5 -> dayName = "Friday";
            default -> dayName = "Unknown";
        }
        System.out.println("Day " + day + " is " + dayName);

        // New Features in Java 21
        System.out.println("\n5. New Features in Java 21 - Pattern Matching for switch:");
        String result = switch (day) {
            case 1 -> "First day";
            case 2 -> "Second day";
            case 3 -> "Third day";
            case 4 -> "Fourth day";
            case 5 -> "Fifth day";
            default -> "Not a valid day";
        };
        System.out.println("Result: " + result);

        // Record Patterns
        System.out.println("\n6. New Features in Java 21 - Record Patterns:");
        record Point(int x, int y) {
        }
        Point p = new Point(1, 2);
        switch (p) {
            case Point(int x, int y) -> System.out.println("Point at (" + x + ", " + y + ")");
            default -> System.out.println("Not a point");
        }

        // switch Expressions with yield
        System.out.println("\n7. New Features in Java 21 - switch Expressions with yield:");
        String dayType = switch (day) {
            case 6, 7 -> "Weekend";
            default -> "Weekday";
        };
        System.out.println("Day " + day + " is a " + dayType);

        // --------- 1.1.4.2 Looping Statements ---------

        // for Loop
        System.out.println("\n8. Looping Statements - for Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Enhanced for Loop (For-Each Loop)
        System.out.println("\n9. Looping Statements - Enhanced for Loop:");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Labeled for Loop
        System.out.println("\n10. Looping Statements - Labeled for Loop:");
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer; // Exits the outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        // Pattern Matching in for Loops
        System.out.println("\n11. Looping Statements - Pattern Matching in for Loops:");
        Object[] objects = {1, "Hello", 2.5};
        for (Object obj2 : objects) {
            if (obj2 instanceof Integer i) {
                System.out.println("Integer value: " + i);
            }
        }

        // while Loop
        System.out.println("\n12. Looping Statements - while Loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // do-while Loop
        System.out.println("\n13. Looping Statements - do-while Loop:");
        count = 0;
        do {
            System.out.println("Count in do-while: " + count);
            count++;
        } while (count < 5);

        // --------- 1.1.4.3 Break and Continue Statements ---------

        // break Statement
        System.out.println("\n14. Break and Continue Statements - break Statement:");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // Exits the loop when i equals 3
            }
            System.out.println("Breaking at i: " + i);
        }

        // continue Statement
        System.out.println("\n15. Break and Continue Statements - continue Statement:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // Skips the iteration when i equals 2
            }
            System.out.println("Continuing at i: " + i);
        }
    }
}
