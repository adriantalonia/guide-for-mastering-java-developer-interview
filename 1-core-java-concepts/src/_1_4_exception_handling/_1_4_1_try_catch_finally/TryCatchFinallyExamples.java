package _1_4_exception_handling._1_4_1_try_catch_finally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class TryCatchFinallyExamples {
    public static void main(String[] args) {
        basicTryCatch();
        multipleCatchBlocks();
        finallyAlwaysExecutes();
        nestedTryCatch();
        tryFinallyWithoutCatch();
        tryWithResourcesExample();
        finallyOverridesReturn();
        realWorldFileExample();
    }

    // 1. Basic try-catch-finally usage
    public static void basicTryCatch() {
        System.out.println("== Basic Try-Catch ==");
        try {
            int result = 10 / 0; // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("This block always executes.\n");
        }
    }

    // 2. Multiple catch blocks
    public static void multipleCatchBlocks() {
        System.out.println("== Multiple Catch Blocks ==");
        try {
            String text = null;
            System.out.println(text.length()); // NullPointerException
        } /*catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }*/ catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred.");
        } finally {
            System.out.println("Cleanup done.\n");
        }
    }

    // 3. finally overrides return
    public static void finallyOverridesReturn() {
        System.out.println("== Finally Overrides Return ==");
        int result = methodWithReturnInTryAndFinally();
        System.out.println("Returned: " + result + "\n");
    }

    private static int methodWithReturnInTryAndFinally() {
        try {
            return 1;
        } finally {
            return 2; // Overrides try's return
        }
    }

    // 4. finally always executes
    public static void finallyAlwaysExecutes() {
        System.out.println("== Finally Always Executes ==");
        try {
            int[] arr = new int[2];
            arr[5] = 100; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }
    }

    // 5. Try without catch, using finally
    public static void tryFinallyWithoutCatch() {
        System.out.println("== Try-Finally Without Catch ==");
        try {
            System.out.println("Doing something...");
        } finally {
            System.out.println("Always do this!\n");
        }
    }

    // 6. Nested try-catch-finally
    public static void nestedTryCatch() {
        System.out.println("== Nested Try-Catch ==");
        try {
            try {
                String[] words = new String[2];
                System.out.println(words[5]); // Throws ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }
        } finally {
            System.out.println("Outer finally executed.\n");
        }
    }

    // 7. Try-With-Resources (Java 7+)
    public static void tryWithResourcesExample() {
        System.out.println("== Try-With-Resources ==");
        try (BufferedReader reader = new BufferedReader(new StringReader("Hello\nWorld"))) {
            String line = reader.readLine();
            System.out.println("Read: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    // 8. Real-world file reading with finally
    public static void realWorldFileExample() {
        System.out.println("== Real-World File Handling ==");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt")); // Provide a real file for actual use
            String line = reader.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing reader.");
            }
        }
        System.out.println();
    }
}
