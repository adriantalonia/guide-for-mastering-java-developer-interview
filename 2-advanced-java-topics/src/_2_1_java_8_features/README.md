# 2.1 Java 8+ Features

<!-- TOC -->
* [2.1 Java 8+ Features](#21-java-8-features)
  * [2.1.1 Introduction to Lambda Expressions](#211-introduction-to-lambda-expressions)
    * [💡 What is a Lambda Expression?](#-what-is-a-lambda-expression)
      * [📌 Key Characteristics:](#-key-characteristics)
      * [✅ Basic Syntax:](#-basic-syntax)
      * [✅ Examples:](#-examples)
    * [🚀 Why Use Lambdas in Java?](#-why-use-lambdas-in-java)
      * [✨ Advantages:](#-advantages)
      * [🔍 Before and After Example](#-before-and-after-example)
        * [👎 Before (Anonymous Inner Class):](#-before-anonymous-inner-class)
        * [👍 After (Lambda Expression):](#-after-lambda-expression)
    * [🕰️ History and Java Version Context](#-history-and-java-version-context)
      * [📅 Timeline:](#-timeline)
    * [📌 Summary](#-summary)
    * [❓ Interview Questions (Q&A)](#-interview-questions-qa)
      * [✅ Basic](#-basic)
      * [✅ Intermediate](#-intermediate)
      * [✅ Advanced](#-advanced)
  * [2.1.2 Lambda Syntax and Structure](#212-lambda-syntax-and-structure)
    * [🧩 Basic Syntax](#-basic-syntax-1)
      * [Examples:](#examples)
    * [📥 Parameters and Return Types](#-parameters-and-return-types)
      * [Examples:](#examples-1)
    * [🧱 Expression Body vs Block Body](#-expression-body-vs-block-body)
      * [Example:](#example)
    * [📌 Summary](#-summary-1)
    * [❓ Interview Questions (Q&A)](#-interview-questions-qa-1)
      * [✅ Basic](#-basic-1)
      * [✅ Intermediate](#-intermediate-1)
      * [✅ Advanced](#-advanced-1)
<!-- TOC -->

## 2.1.1 Introduction to Lambda Expressions

### 💡 What is a Lambda Expression?

A **Lambda Expression** is a concise way to represent an **anonymous function** (a function without a name) that can be
passed around as a parameter or stored in a variable. It enables **functional programming** capabilities in Java by
treating behavior as data.

#### 📌 Key Characteristics:

- No need to define an entire method or class.
- Works with **functional interfaces** (interfaces with a single abstract method).
- Adds more readable and expressive code.

#### ✅ Basic Syntax:

```
(parameters) -> expression
(parameters) -> {statements}
```

#### ✅ Examples:

```java
// Lambda with no parameters
Runnable r = () -> System.out.println("Running!");

// Lambda with one parameter
Consumer<String> greet = name -> System.out.println("Hello, " + name);

// Lambda with two parameters
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
```

---

### 🚀 Why Use Lambdas in Java?

Lambda expressions bring several benefits that improve both productivity and code quality:

#### ✨ Advantages:

- **Conciseness:** Reduces boilerplate code (no need for anonymous inner classes).
- **Readability:** Clearer intent when performing actions like filtering, mapping, etc.
- **Functional Style:** Enables use of Streams API and encourages immutability and declarative code.
- **Improved APIs:** Makes Java APIs like collections and concurrency more powerful.

#### 🔍 Before and After Example

##### 👎 Before (Anonymous Inner Class):

```java
new Thread(new Runnable() {
    @Override
    public void run () {
        System.out.println("Hello from thread");
    }
}).

start();
```

##### 👍 After (Lambda Expression):

```java
new Thread(() ->System.out.

println("Hello from thread")).

start();
```

---

### 🕰️ History and Java Version Context

Lambda Expressions were introduced in **Java 8 (2014)**, one of the most significant upgrades in the language’s history.
They are part of the movement to make Java more modern and functional.

#### 📅 Timeline:

| Java Version  | Feature                                                                   |
|---------------|---------------------------------------------------------------------------|
| Java 8        | Introduced Lambda Expressions and Streams                                 |
| Java 9+       | Enhanced APIs using lambdas                                               |
| Java 17 (LTS) | Improved pattern matching and type inference                              |
| Java 21+      | Continuation of functional features, better inference, better performance |

---

### 📌 Summary

| Feature       | Lambda Expression                          |
|---------------|--------------------------------------------|
| Introduced in | Java 8                                     |
| Works with    | Functional Interfaces                      |
| Use cases     | Functional programming, Streams, Callbacks |
| Benefits      | Concise, readable, expressive code         |

---

### ❓ Interview Questions (Q&A)

Here are some common **interview questions** related to Lambda Expressions:

#### ✅ Basic

- **What is a lambda expression in Java?**
  > A concise way to implement a method of a functional interface without writing a full class or anonymous inner class.

- **What are functional interfaces? Can you name a few from Java's standard library?**
  > Interfaces with only one abstract method. Examples: `Runnable`, `Callable`, `Predicate<T>`, `Function<T,R>`,
  `Consumer<T>`, `Supplier<T>`.

- **What is the syntax of a lambda expression?**
  > `(params) -> expression` or `(params) -> { statements }`

#### ✅ Intermediate

- **How does a lambda differ from an anonymous inner class?**
  > Lambdas are more concise, do not introduce a new scope, and `this` refers to the enclosing class, unlike anonymous
  inner classes.

- **Can a lambda access local variables?**
  > Yes, but only if the variables are *effectively final* (not modified after initialization).

- **What is the target type for a lambda?**
  > The type of the functional interface the lambda is assigned to.

#### ✅ Advanced

- **How are lambdas implemented internally in Java?**
  > Lambdas are translated to invokedynamic bytecode instructions and implemented using the `LambdaMetafactory`.

- **How does Java handle serialization of lambdas?**
  > Lambdas are not serializable by default unless the target functional interface extends `Serializable`.

- **Can you chain or compose lambdas?**
  > Yes, especially using utility methods from interfaces like `Function.andThen()`, `Predicate.and()`, etc.

---

## 2.1.2 Lambda Syntax and Structure

### 🧩 Basic Syntax

A lambda expression in Java has the following syntax:

```
(parameters) -> expression
(parameters) -> {statements}
```

This allows you to define short, inline implementations of functional interfaces.

#### Examples:

```java
// No parameters
Runnable noArgs = () -> System.out.println("No arguments");

// One parameter
Consumer<String> greet = name -> System.out.println("Hello " + name);

// Multiple parameters
BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
```

---

### 📥 Parameters and Return Types

- **Type Inference:** Java often infers the types from the context.
- **Optional Parentheses:** When there's a single parameter and its type is inferred, parentheses are optional.
- **Return Types:** If the lambda has a single expression, the result is returned implicitly.

#### Examples:

```java
// With type inference and return
Function<String, Integer> strLength = s -> s.length();

// Explicit types
BiFunction<Integer, Integer, Integer> multiply = (Integer x, Integer y) -> x * y;

// With code block (must use return)
Function<Integer, String> evenOdd = (num) -> {
    if (num % 2 == 0) return "Even";
    else return "Odd";
};
```

---

### 🧱 Expression Body vs Block Body

- **Expression Body:** Ideal for short, single-line expressions. Return is implicit.
- **Block Body:** Used when multiple statements are needed. Must explicitly use `return` if returning a value.

#### Example:

```java
// Expression body
Predicate<Integer> isPositive = x -> x > 0;

// Block body
Predicate<Integer> isNonNegative = x -> {
    System.out.println("Checking number: " + x);
    return x >= 0;
};
```

---

### 📌 Summary

| Aspect   | Expression Body          | Block Body                             |
|----------|--------------------------|----------------------------------------|
| Syntax   | `(params) -> expression` | `(params) -> { statements; }`          |
| Return   | Implicit                 | Explicit with `return` keyword         |
| Use case | Simple logic             | Complex logic requiring multiple steps |

---

### ❓ Interview Questions (Q&A)

#### ✅ Basic

- **What is the basic syntax of a lambda expression?**
  > `(parameters) -> expression` or `(parameters) -> { statements }`

- **When do you use parentheses for parameters?**
  > When there are no parameters or more than one. For a single parameter with inferred type, they are optional.

#### ✅ Intermediate

- **What is the difference between expression and block bodies?**
  > Expression bodies return values implicitly and are suitable for simple logic. Block bodies allow multiple statements
  and require an explicit `return` if a value is returned.

- **Can lambda expressions have generic parameters?**
  > Yes, when used in generic functional interfaces like `Function<T, R>`.

#### ✅ Advanced

- **How does Java infer types in lambda parameters?**
  > Through the target type, which is derived from the context in which the lambda is used (e.g., assigned functional
  interface).

- **Why is it important that lambdas don't introduce a new scope?**
  > It simplifies variable access, as `this` refers to the enclosing class, not a new anonymous class instance.