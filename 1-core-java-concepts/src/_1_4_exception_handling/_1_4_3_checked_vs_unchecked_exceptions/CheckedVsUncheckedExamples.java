package _1_4_exception_handling._1_4_3_checked_vs_unchecked_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUncheckedExamples {

    public static void main(String[] args) {
        System.out.println("=== Checked Exception Example ===");
        handleCheckedException();

        System.out.println("\n=== Unchecked Exception Examples ===");
        triggerNullPointerException();
        triggerArithmeticException();
        triggerArrayIndexOutOfBoundsException();
    }

    // -----------------------------------------
    // CHECKED EXCEPTION EXAMPLE
    // -----------------------------------------
    public static void handleCheckedException() {
        try {
            readFile("nonexistent_file.txt"); // Will throw IOException
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }
    }

    // Method that throws a checked exception (IOException)
    public static void readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        System.out.println("First line: " + line);
        reader.close();
    }

    // -----------------------------------------
    // UNCHECKED EXCEPTION EXAMPLES
    // -----------------------------------------

    public static void triggerNullPointerException() {
        try {
            String name = null;
            System.out.println("Name length: " + name.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught Unchecked Exception (NullPointerException): " + e.getMessage());
        }
    }

    public static void triggerArithmeticException() {
        try {
            int result = 10 / 0; // ArithmeticException: division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception (ArithmeticException): " + e.getMessage());
        }
    }

    public static void triggerArrayIndexOutOfBoundsException() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing index 5: " + numbers[5]); // Out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Unchecked Exception (ArrayIndexOutOfBoundsException): " + e.getMessage());
        }
    }
}

