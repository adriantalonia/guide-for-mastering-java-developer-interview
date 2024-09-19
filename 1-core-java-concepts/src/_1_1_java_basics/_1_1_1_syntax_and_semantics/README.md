## 1.1.1 Syntax and Semantics

### Basic Structure of a Java Program

A basic Java program consists of several elements including a class definition, a main method, and statements inside the
main method. Here's an example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- **Class Definition**: `public class HelloWorld` denotes a class named HelloWorld.
- **Main Method**: `public static void main(String[] args)` is the entry point of the program.
- **Method Call**: `System.out.println("Hello, World!");` prints text to the console.

### Java Naming Conventions

Java naming conventions enhance code readability and maintainability. Some key conventions include:

- **Class Names**: Should be nouns in PascalCase (e.g., HelloWorld, Employee).
- **Method Names**: Should be verbs in camelCase (e.g., calculateSalary, printHello).
- **Variable Names**: Should be in camelCase (e.g., employeeName, totalAmount).
- **Constant Names**: Should be in UPPERCASE with underscores separating words (e.g., PI, MAX_VALUE).