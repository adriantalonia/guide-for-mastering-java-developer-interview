# 1.1.4 Control Flow Statements

Control flow statements are essential for controlling the execution flow of a program based on certain conditions or
through iterative processes. In Java, there are several types of control flow statements, including conditional
statements and looping statements.

<!-- TOC -->
* [1.1.4 Control Flow Statements](#114-control-flow-statements)
  * [1.1.4.1 Conditional Statements](#1141-conditional-statements)
    * [if Statement](#if-statement)
    * [if-else Statement](#if-else-statement)
      * [Enhanced instanceof Operator](#enhanced-instanceof-operator)
    * [switch Statement](#switch-statement)
      * [New Features in Java 21](#new-features-in-java-21)
        * [Pattern Matching for switch](#pattern-matching-for-switch)
        * [Record Patterns](#record-patterns)
        * [switch Expressions with yield](#switch-expressions-with-yield)
  * [1.1.4.2 Looping Statements](#1142-looping-statements)
      * [for Loop](#for-loop)
        * [Enhanced for Loop (For-Each Loop)](#enhanced-for-loop-for-each-loop)
        * [Labeled for Loop](#labeled-for-loop)
        * [Pattern Matching in for Loops](#pattern-matching-in-for-loops)
    * [while Loop](#while-loop)
    * [do-while Loop](#do-while-loop)
  * [1.1.4.3 Break and Continue Statements](#1143-break-and-continue-statements)
    * [break Statement](#break-statement)
    * [continue Statement](#continue-statement)
  * [Control Flow Statements - FAQs](#control-flow-statements---faqs)
<!-- TOC -->

## 1.1.4.1 Conditional Statements

Conditional statements allow you to execute certain blocks of code based on whether a specified condition evaluates to
true or false.

### if Statement

The if statement is used to test a condition. If the condition is true, the block of code within the if statement is
executed.

**Syntax:**

```
if (condition) {
    // code to be executed if condition is true
}
```

**Example:**

```java
class Example {
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        }
    }
}
```

### if-else Statement

The if-else statement provides an alternative block of code to be executed if the condition is false.

**Syntax:**

```
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

**Example:**

```java
class Example {
    public static void main(String[] args) {
        int number = -5;
        if (number > 0) {
            System.out.

                    println("The number is positive.");
        } else {
            System.out.

                    println("The number is not positive.");
        }
    }
}
```

#### Enhanced instanceof Operator

Java 21 continues to enhance the instanceof operator with pattern matching, allowing type checks and variable
declaration in a single expression.

**Example:**

```java
class Example {
    public static void main(String[] args) {
        Object obj = "A string";
        if (obj instanceof String s) {
            System.out.println("String value: " + s);
        } else {
            System.out.println("Not a string");
        }
    }
}
```

### switch Statement

The switch statement allows you to execute one block of code among many choices based on the value of a variable.

**Syntax:**

```
switch (expression) {
    case value1:
        // code to be executed if expression equals value1
        break;
    case value2:
        // code to be executed if expression equals value2
        break;
    default:
        // code to be executed if expression does not match any case
}
```

**Example:**

```java
class Example {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.

                        println("Monday");
                break;
            case 2:
                System.out.

                        println("Tuesday");
                break;
            case 3:
                System.out.

                        println("Wednesday");
                break;
            default:
                System.out.

                        println("Invalid day");
        }
    }
}
```

#### New Features in Java 21

##### Pattern Matching for switch

Java 21 enhances the switch statement with pattern matching, allowing developers to match against specific types and
conditions directly within a switch case. This reduces the need for explicit type checks and casting.

**Example:**

```java
class Example {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        switch (obj) {
            case String s -> System.out.println("String of length " + s.length());
            case Integer i -> System.out.println("Integer: " + i);
            case null -> System.out.println("Null value");
            default -> System.out.println("Unknown type");
        }
    }
}
```

##### Record Patterns

Record patterns allow for destructuring of records directly within switch cases or if statements, enabling developers to
extract components of a record in a more readable way.

**Example:**

```java
class Example {
    public static void main(String[] args) {
        record Point(int x, int y) {
        }

        Point p = new Point(1, 2);
        switch (p) {
            case Point(int x, int y) -> System.out.println("Point at (" + x + ", " + y + ")");
            default -> System.out.println("Not a point");
        }
    }
}
```

##### switch Expressions with yield

Java 21 allows for enhanced switch expressions, enabling the use of yield to return values from switch blocks, which can
be particularly useful in functional programming styles.

**Example:**

```java
class Example {
    public static void main(String[] args) {
        int day = 2;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown day";
        };
        System.out.println(dayName);
    }
}
```

## 1.1.4.2 Looping Statements

Looping statements allow you to execute a block of code repeatedly based on a condition.

#### for Loop

The for loop is used when you know in advance how many times you want to execute a statement or a block of statements.

**Syntax:**

```
for (initialization; condition; update) {
    // code to be executed
}
```

**Example:**

```java
class Example {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```

##### Enhanced for Loop (For-Each Loop)

The enhanced for loop is used to iterate over arrays and collections. It simplifies the syntax and eliminates the need
for an explicit iterator.

**Syntax:**

```
for (dataType item : arrayOrCollection) {
    // code to be executed
}
```

**Example:**

```java
class Example {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

##### Labeled for Loop

Labeled loops allow you to define a label for a loop and use it with break or continue statements to control the flow
more explicitly, especially in nested loops.

**Syntax:**

```
label: for (initialization; condition; update) {
    // code
}
```

**Example:**

```java
class Example {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer; // Exits the outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
```

##### Pattern Matching in for Loops

Java 21 enhances the for loop capabilities using pattern matching, allowing for more concise iteration over collections
with conditional checks.

**Example:**

```java
class Example {
    public static void main(String[] args) {
        List<Object> items = List.of("Apple", 2, "Banana", 3);
        for (var item : items) {
            if (item instanceof String s) {
                System.out.println("Found a string: " + s);
            }
        }
    }
}
```

### while Loop

The while loop continues to execute a block of code as long as the specified condition is true.

**Syntax:**

```
while (condition) {
    // code to be executed
}
```

**Example:**

```java
class Example {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

### do-while Loop

The do-while loop is similar to the while loop, but it guarantees that the block of code will be executed at least once.

**Syntax:**

```
do {
    // code to be executed
} while (condition);
```

**Example:**

```java
class Example {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
```

## 1.1.4.3 Break and Continue Statements

### break Statement

The break statement is used to exit a loop or a switch statement prematurely.

```java
class Example {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i equals 3
            }
            System.out.println(i);
        }
    }
}
```

### continue Statement

The continue statement skips the current iteration of the loop and proceeds to the next iteration.

```java
class Example {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the current iteration when i equals 3
            }
            System.out.println(i);
        }
    }
}
```

## Control Flow Statements - FAQs

1. **What is the difference between a traditional `for` loop and an enhanced `for` loop in Java? Provide examples of
   when you would use each.**

    - A traditional `for` loop is used when you need to perform a set number of iterations using a counter. It consists
      of initialization, condition, and update statements.
      ```java
      for (int i = 0; i < 5; i++) {
          System.out.println(i);
      }
      ```
    - An enhanced `for` loop (for-each loop) simplifies iteration over arrays and collections by eliminating the need
      for an index. It is used when you want to access each element without needing the index.
      ```java
      List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
      for (String fruit : fruits) {
          System.out.println(fruit);
      }
      ```
    - Use a traditional `for` loop when you need to know the index or manipulate it, and an enhanced `for` loop when you
      are simply accessing elements.


2. **Explain how the `break` and `continue` statements work in loops. Can you provide an example of each?**

    - The `break` statement is used to exit a loop immediately, regardless of the loop condition.
      ```java
      for (int i = 0; i < 5; i++) {
          if (i == 3) {
              break; // Exits the loop when i equals 3
          }
          System.out.println(i);
      }
      // Output: 0, 1, 2
      ```

    - The `continue` statement skips the current iteration and moves to the next iteration of the loop.
      ```java
      for (int i = 0; i < 5; i++) {
          if (i == 2) {
              continue; // Skips the iteration when i equals 2
          }
          System.out.println(i);
      }
      // Output: 0, 1, 3, 4
      ```

3. **What is a labeled loop in Java, and why would you use it? Can you provide a code example demonstrating its use?**

    - A labeled loop allows you to specify a label for a loop, which can be used to break or continue from outer loops.
      This is useful in nested loops where you need to control the flow of the outer loop based on a condition in the
      inner loop.
      ```java
      outer: for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              if (i == 1 && j == 1) {
                  break outer; // Exits the outer loop when i=1 and j=1
              }
              System.out.println("i=" + i + ", j=" + j);
          }
      }
      // Output: i=0, j=0
      // Output: i=0, j=1
      // Output: i=0, j=2
      // Output: i=1, j=0
      ```

4. **Describe the new features of pattern matching introduced in Java 21. How does it improve the way we
   use `instanceof` and `switch` statements?**

    - Pattern matching allows you to check the type of an object and cast it in a single operation. This reduces
      boilerplate code and improves readability.
    - For `instanceof`, you can now use the following syntax:
      ```java
      Object obj = "Hello";
      if (obj instanceof String s) {
          System.out.println("String value: " + s);
      }
      ```
    - For `switch` statements, pattern matching allows you to match types directly:
      ```java
      Object obj = 5;
      switch (obj) {
          case Integer i -> System.out.println("Integer: " + i);
          case String s -> System.out.println("String: " + s);
          default -> System.out.println("Unknown type");
      }
      ```
    - This makes control flow statements more concise and expressive.


5. **What is the purpose of the `yield` statement in a `switch` expression in Java 21? How does it differ from a
   traditional `switch` statement?**

    - The `yield` statement is used to return a value from a `switch` expression, allowing you to assign the result of
      the switch directly to a variable.
    - Unlike traditional `switch` statements, which do not return a value, a `switch` expression with `yield` can be
      used in expressions:
      ```java
      int day = 2;
      String dayName = switch (day) {
          case 1 -> "Monday";
          case 2 -> "Tuesday";
          default -> "Unknown";
      };
      System.out.println(dayName); // Output: Tuesday
      ```
    - This enhances the expressiveness of `switch` by allowing it to be used in more contexts.


6. **Can you explain how to iterate over a collection using the enhanced `for` loop? What are the benefits of using this
   type of loop?**

    - You can use the enhanced `for` loop to iterate over collections like lists and sets. The loop implicitly handles
      the iterator, making the code simpler and less error-prone.
      ```java
      List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
      for (String name : names) {
          System.out.println(name);
      }
      ```
    - Benefits of using the enhanced `for` loop include:
        - Reduced boilerplate code.
        - Improved readability.
        - Elimination of off-by-one errors and the need for index management.


7. **In Java 21, how can you use record patterns in a `switch` statement?
   Provide an example to illustrate your answer.**

    - Record patterns allow you to destructure record types directly in `switch` statements, making it easier to work
      with data classes.
    - For example, if you have a record called `Point`:
      ```java
      record Point(int x, int y) {}
 
      Point p = new Point(1, 2);
      switch (p) {
          case Point(int x, int y) -> System.out.println("Point at (" + x + ", " + y + ")");
          default -> System.out.println("Not a point");
      }
      // Output: Point at (1, 2)
      ```


8. **What are some common pitfalls or mistakes developers might encounter when using loops in Java? How can these be
   avoided?**

    - Common pitfalls include:
        - **Off-by-one errors:** These occur when the loop condition is incorrectly set (e.g., using `<` instead of
          `<=`).
        - **Infinite loops:** Forgetting to update the loop variable can lead to loops that never terminate.
        - **Modifying the collection during iteration:** This can lead to `ConcurrentModificationException`.
    - To avoid these issues:
        - Carefully review loop conditions and boundaries.
        - Use debugging tools to step through loops.
        - Prefer enhanced `for` loops when iterating over collections to avoid modification issues.


9. **How does the performance of loops change with the introduction of new features in Java 21? Are there specific
   optimizations that developers should be aware of?**

    - Java 21 includes performance optimizations for handling collections and iterables, which can improve the
      efficiency of loops.
    - Features like pattern matching and enhanced `switch` expressions allow for more concise code, which can lead to
      fewer mistakes and potentially better performance due to reduced overhead.
    - Developers should focus on using enhanced loops and pattern matching to leverage these optimizations while
      ensuring that they are aware of how to handle larger datasets efficiently.


10. **Given the following code snippet, what will be the output? Explain the flow of execution:**
    ```java
    int count = 0;
    for (int i = 0; i < 5; i++) {
        if (i == 2) {
            continue;
        }
        count++;
    }
    System.out.println(count);
    ```


- The output of this code will be `4`.
- Flow of execution:
    - The loop runs with `i` taking values from `0` to `4`.
    - When `i = 2`, the `continue` statement skips the increment of `count`, so `count` remains `2`.
    - For `i = 0`, `1`, `3`, and `4`, the `count` is incremented, resulting in a final value of `4`.
- Thus, the loop counts `0`, `1`, `3`, and `4`, skipping `2`.