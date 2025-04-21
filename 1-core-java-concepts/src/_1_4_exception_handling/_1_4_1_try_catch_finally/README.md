# 1.4.1 Try-Catch-Finally

<!-- TOC -->
* [1.4.1 Try-Catch-Finally](#141-try-catch-finally)
  * [Overview](#overview)
  * [🔹 Key Concepts](#-key-concepts)
  * [🔧 Syntax](#-syntax)
  * [✅ Basic Example](#-basic-example)
  * [🧠 Real-World Scenario](#-real-world-scenario)
  * [✨ Try-With-Resources (Java 7+)](#-try-with-resources-java-7)
  * [🧑‍🏫 Best Practices](#-best-practices)
  * [💬 Interview Questions](#-interview-questions)
  * [🏁 Summary](#-summary)
<!-- TOC -->

## Overview

Exception handling in Java is a robust mechanism to handle runtime errors, allowing the normal flow of the application
to continue. The `try-catch-finally` block is the most fundamental construct in Java for handling exceptions.

## 🔹 Key Concepts

- **`try` block**: Code that might throw an exception is placed here.
- **`catch` block**: Used to handle the exception. You can have multiple catch blocks to handle different exception
  types.
- **`finally` block**: Always executed after try/catch, regardless of whether an exception occurred. Typically used for
  resource cleanup (e.g., closing files, releasing connections).

## 🔧 Syntax

```java
try{
        // Code that may throw an exception
        }catch(ExceptionType e){
        // Handling the exception
        }finally{
        // Cleanup code
        }
```

## ✅ Basic Example

```java
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
```

**Output:**

```
Error: Division by zero.
This block always executes.
```

**💡 Notes**

Multiple catch blocks can be used to handle different exceptions:

```java
try{
        // risky code
        }catch(IOException e){
        // handle IO issues
        }catch(
NullPointerException e){
        // handle null pointer access
        }finally{
        // always executes
        }
```

> finally will always execute, even if a return statement is called inside the try or catch.

## 🧠 Real-World Scenario

Imagine you’re reading a file from disk:

```java
BufferedReader reader = null;
try{
reader =new

BufferedReader(new FileReader("data.txt"));
String line = reader.readLine();
    System.out.

println("First line: "+line);
}catch(
IOException e){
        System.out.

println("File error: "+e.getMessage());
        }finally{
        try{
        if(reader !=null)reader.

close();
    }catch(
IOException e){
        System.out.

println("Failed to close the reader.");
    }
            }
```

> **finally** ensures that the reader is closed even if reading the file fails.

## ✨ Try-With-Resources (Java 7+)

Java introduced the try-with-resources statement to simplify resource management. It automatically closes resources that
implement AutoCloseable.

```java
try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
    String line = reader.readLine();
    System.out.println(line);
} catch (IOException e) {
    e.printStackTrace();
}
```

## 🧑‍🏫 Best Practices

✅ Catch the most specific exceptions first

```java
try {
    // code
} catch (FileNotFoundException e) {
    // Specific
} catch (IOException e) {
        // More general
}
```

✅ Avoid catching Exception or Throwable unless absolutely necessary

- Catching everything can hide bugs and make debugging harder.

✅ Always release resources in finally or use try-with-resources

- Avoid resource leaks (file handles, DB connections, etc.).

✅ Log exceptions with enough detail

``` java
catch (IOException e) {
    logger.error("File operation failed: ", e);
}
```

✅ Avoid empty catch blocks

- Silently ignoring exceptions can lead to unpredictable behavior.

❌ Bad:

```java
catch (IOException e) {
    // do nothing
}
```

✅ Throw meaningful custom exceptions when needed

- We'll dive into this in the next section 1.4.2 Custom Exceptions.

✅ Use finally only when necessary

- If using try-with-resources, you may not need it at all.

✅ Do not use exceptions for flow control

- Exceptions are expensive; use them for exceptional situations only.

## 💬 Interview Questions
1. **What is the purpose of the finally block in Java?**
   **Answer**: The finally block is used to execute important cleanup code such as closing resources. It always executes, whether or not an exception is thrown.
2. **Can a finally block override a return statement in try or catch?**
   **Answer**: Yes. If a finally block contains a return statement, it will override any return statements from the try or catch.
```java
public int test() {
    try {
        return 1;
    } finally {
        return 2; // This will override the return from try
    }
}
```
3. **Is it mandatory to use catch with try?**
   **Answer**: No, a catch is not mandatory if finally is present. You can use try-finally.
```java
try {
    // code
} finally {
    // cleanup
}
```
4. **Can try-catch-finally blocks be nested?**
   **Answer**: Yes. You can nest them to handle exceptions in more granular ways.
```java
try {
    try {
        int[] arr = new int[2];
        arr[5] = 100; // Throws ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Inner catch: " + e.getMessage());
    }
} finally {
    System.out.println("Outer finally executed.");
}
```

## 🏁 Summary
* Use try for risky code.
* Use catch to handle specific exceptions meaningfully.
* Use finally for guaranteed cleanup.
* Prefer try-with-resources for auto-closing resources.
* Follow best practices to write clean, maintainable, and bug-free exception handling logic.


