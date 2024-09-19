package _1_1_java_basics._1_1_3_operatiors_and_expressions;

public class OperatorExamples {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int bitA = 5; // 0101 in binary
        int bitB = 3; // 0011 in binary
        System.out.println("bitA: " + bitA + ", 0101 in binary");
        System.out.println("bitB: " + bitB + ", 0011 in binary");
        System.out.println("bitA & bitB: " + (bitA & bitB)); // Bitwise AND (1)
        System.out.println("bitA | bitB: " + (bitA | bitB)); // Bitwise OR (7)
        System.out.println("bitA ^ bitB: " + (bitA ^ bitB)); // Bitwise XOR (6)
        System.out.println("~bitA: " + (~bitA)); // Bitwise NOT (-6)
        System.out.println("bitA << 1: " + (bitA << 1)); // Left shift (10)
        System.out.println("bitA >> 1: " + (bitA >> 1)); // Right shift (2)
        System.out.println("bitA >>> 1: " + (bitA >>> 1)); // Unsigned right shift (2)

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5; // Add and assign
        System.out.println("c += 5: " + c); // 15
        c -= 3; // Subtract and assign
        System.out.println("c -= 3: " + c); // 12

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("++d: " + (++d)); // Pre-increment (6)
        System.out.println("d++: " + (d++)); // Post-increment (6, then d is 7)
        System.out.println("--d: " + (--d)); // Pre-decrement (6)
        System.out.println("d--: " + (d--)); // Post-decrement (6, then d is 5)

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b; // Returns a if true, otherwise b
        System.out.println("Max of a and b: " + max); // 10

        // Example for short-circuit evaluation
        System.out.println("\nShort-Circuit Evaluation:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("(b > a) && (5 / 0 == 1) Second part is not evaluated");
        boolean condition = (b > a) && (5 / 0 == 1); // Second part is not evaluated
        System.out.println("Condition: " + condition); // true
    }
}
