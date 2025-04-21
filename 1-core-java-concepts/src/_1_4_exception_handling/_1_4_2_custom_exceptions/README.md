# 1.4.2 Custom Exceptions

<!-- TOC -->

* [1.4.2 Custom Exceptions](#142-custom-exceptions)
    * [Overview](#overview)
    * [🔹 Key Concepts](#-key-concepts)
    * [📦 Syntax: Creating Custom Exceptions](#-syntax-creating-custom-exceptions)
        * [Checked Exception](#checked-exception)

<!-- TOC -->

## Overview

Java allows you to create your own custom exceptions in addition to the standard exceptions provided by the language.
This is useful when you want to represent application-specific error conditions in a clear, descriptive, and reusable
way.

Custom exceptions improve code readability, promote consistent error handling, and make debugging easier.

---

## 🔹 Key Concepts

- **Custom Exception**: A user-defined class that extends `Exception` (checked) or `RuntimeException` (unchecked).
- **Checked Exceptions**: Must be declared in the method signature and handled using `try-catch` or `throws`.
- **Unchecked Exceptions**: Extend `RuntimeException`; they are not required to be declared or caught.
- **`throw` keyword**: Used to explicitly throw an exception.
- **`throws` clause**: Declares exceptions that a method might throw.

---

## 📦 Syntax: Creating Custom Exceptions

### Checked Exception

```java
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

### Unchecked Exception

```java
public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}
```

## ✅ Basic Example: Throwing a Checked Custom Exception

```java
public class VoterRegistration {

    public static void registerVoter(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 to vote.");
        }
        System.out.println("Registration successful.");
    }

    public static void main(String[] args) {
        try {
            registerVoter(16); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}
```

## 💡 Real-World Scenario: Bank Withdrawal

```java
public class BankAccount {
    private double balance = 500.00;

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
    }
}

class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.withdraw(1000); // Throws InsufficientFundsException
    }
}
```

## 💬 Best Practices

✅ Use meaningful exception names

- e.g., InvalidTransactionException, UserNotFoundException, OrderProcessingException.

✅ Extend Exception for checked exceptions only when necessary

- Use checked exceptions for recoverable situations (e.g., invalid input from a user).
- Prefer unchecked exceptions (RuntimeException) for programming errors (e.g., illegal state, configuration errors).

✅ Always provide constructors with a String message and optionally a Throwable cause

```java
public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message) {
        super(message);
    }

    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

✅ Include relevant contextual information in exception messages
✅ Don’t overuse custom exceptions

- Only create them when built-in exceptions don’t clearly describe the problem.

## 🧠 Interview Questions

1. **What is a custom exception in Java?**
   **Answer**: A custom exception is a user-defined class that extends Exception or RuntimeException. It allows
   developers
   to represent domain-specific error conditions more meaningfully.
2. **When should you create a custom exception?**
   **Answer**: When you want to represent a specific error in your domain that is not clearly described by existing
   exceptions (e.g., InvalidPasswordException, ProductOutOfStockException).
3. **What's the difference between checked and unchecked custom exceptions?**
   **Answer**:
    - **Checked**: Extend Exception, must be declared and caught (e.g., throws InvalidAgeException).
    - **Unchecked**: Extend RuntimeException, no need to declare or catch.
4. **Can a custom exception have multiple constructors?**
   **Answer**: Yes. It's a best practice to provide:
    - A default constructor
    - A constructor with a message
    - A constructor with a message and a cause
5. **Why is it not recommended to overuse custom exceptions?**
   **Answer**: Overusing them can lead to bloated code and unnecessary complexity. Only create them when they add real
   semantic meaning or differentiate a specific type of error.

## 🏁 Summary
- Custom exceptions improve clarity and domain-driven design. 
- Use Exception for checked and RuntimeException for unchecked types. 
- Always provide meaningful messages and constructors. 
- Use them to clearly represent domain-specific failure cases. 
- Don't overuse them—stick to built-in exceptions unless you have a strong reason.