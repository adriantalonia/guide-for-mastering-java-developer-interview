# 1.4.3 Checked vs Unchecked Exceptions

<!-- TOC -->
* [1.4.3 Checked vs Unchecked Exceptions](#143-checked-vs-unchecked-exceptions)
  * [📘 Overview](#-overview)
  * [📊 Comparison Table](#-comparison-table)
  * [🧠 Key Concepts](#-key-concepts)
    * [✅ Checked Exceptions](#-checked-exceptions)
    * [❌ Unchecked Exceptions](#-unchecked-exceptions)
  * [🔧 Code Examples](#-code-examples)
    * [✔️ Checked Exception Example](#-checked-exception-example)
  * [❗ Unchecked Exception Example](#-unchecked-exception-example)
  * [🌐 Real-World Scenarios](#-real-world-scenarios)
  * [✅ Best Practices](#-best-practices)
  * [💬 Interview Questions and Answers](#-interview-questions-and-answers)
  * [📝 Summary](#-summary)
<!-- TOC -->

## 📘 Overview

In Java, exceptions are broadly classified into:

- **Checked Exceptions**: Checked at **compile-time**.
- **Unchecked Exceptions**: Checked at **runtime**.

Understanding this distinction is crucial for robust Java applications, especially when handling error-prone operations
like file access or user input.

---

## 📊 Comparison Table

| Feature                  | Checked Exception                                                   | Unchecked Exception                                                             |
|--------------------------|---------------------------------------------------------------------|---------------------------------------------------------------------------------|
| **Behaviour**            | Checked at **compile time**                                         | Checked at **runtime**                                                          |
| **Base class**           | Derived from `Exception`                                            | Derived from `RuntimeException`                                                 |
| **Cause**                | External factors like file I/O, database access, or network issues  | Programming bugs like null references, logic errors, or bad indexing            |
| **Handling Requirement** | Must be handled using a `try-catch` block or declared with `throws` | Optional handling (no compiler requirement)                                     |
| **Examples**             | `IOException`, `SQLException`, `FileNotFoundException`              | `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException` |

---

## 🧠 Key Concepts

### ✅ Checked Exceptions

- Represent recoverable conditions.
- Must be caught or declared in method signature.
- Common in external operations like:
    - Reading files
    - Network communication
    - Database queries

### ❌ Unchecked Exceptions

- Indicate bugs in the program logic.
- Not enforced by the compiler.
- Can be avoided with defensive programming and validation.

---

## 🔧 Code Examples

### ✔️ Checked Exception Example

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        System.out.println(reader.readLine());
        reader.close();
    }
}
```

> Explanation: File operations can throw IOException, a checked exception. You must either handle it with try-catch or declare it with throws.

## ❗ Unchecked Exception Example
```java
public class UncheckedExample {
    public static void main(String[] args) {
        String name = null;
        // This will throw NullPointerException at runtime
        System.out.println(name.length());
    }
}
```

> Explanation: No compile-time error occurs here. At runtime, a NullPointerException will be thrown.

## 🌐 Real-World Scenarios

| Scenario                         | Exception Type | Description                                |
|----------------------------------|----------------|--------------------------------------------|
| Reading a file from disk         | Checked        | File might be missing                      |
| Making an HTTP request           | Checked        | Network might be unavailable               |
| Accessing a null object          | Unchecked      | Might throw NullPointerException           |
| Dividing by zero                 | Unchecked      | Might throw ArithmeticException            |
| Accessing an invalid array index | Unchecked      | Might throw ArrayIndexOutOfBoundsException |

## ✅ Best Practices

* ✅ Handle checked exceptions as close to the source as possible.
* ✅ Use specific exception types instead of catching Exception or Throwable.
* ✅ Avoid empty catch blocks.
* ✅ For unchecked exceptions, validate inputs and use assertions.
* ❌ Avoid using exceptions for control flow.
* ❌ Don't overuse throws declarations if handling is more appropriate.

## 💬 Interview Questions and Answers

1. **What is the difference between checked and unchecked exceptions?**

   **Answer**: Checked exceptions are checked at compile-time and require explicit handling. Unchecked exceptions occur at runtime and are not enforced by the compiler.

2. **Why does Java distinguish between them?**
   
   **Answer**: To force the developer to handle potential failures (e.g., I/O, database access) while leaving flexibility for unchecked issues (e.g., nulls) that can be avoided with better coding.

3. **Can we create custom checked and unchecked exceptions?**
   
   **Answer**: Yes. Extend Exception to create a checked exception, or extend RuntimeException to create an unchecked exception.
    ```
    class MyCheckedException extends Exception {}
    class MyUncheckedException extends RuntimeException {}
    ```
4. **Should we catch RuntimeException?**
   
   **Answer**: Only when there’s a valid reason (e.g., logging or recovering from a known issue). Prefer avoiding the situation altogether through defensive coding.

## 📝 Summary

| Aspect               | Checked Exceptions    | Unchecked Exceptions      |
|----------------------|-----------------------|---------------------------|
| Compiler Enforcement | ✅ Yes                 | ❌ No                      |
| Handling Required    | ✅ Yes                 | ❌ Optional                |
| Base Class           | Exception             | RuntimeException          |
| Common Usage         | File I/O, DB, Network | Nulls, Logic bugs, Arrays |

