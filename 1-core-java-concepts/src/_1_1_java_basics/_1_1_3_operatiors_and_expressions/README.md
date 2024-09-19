# 1.1.3 Operators and Expressions

<!-- TOC -->
* [1.1.3 Operators and Expressions](#113-operators-and-expressions)
    * [1.3.1 Arithmetic operators (+, -, *, /, %)](#131-arithmetic-operators------)
    * [1.3.2 Relational operators (==, !=, >, <, >=, <=)](#132-relational-operators------)
    * [1.3.3 Logical operators (&&, ||, !)](#133-logical-operators---)
    * [1.3.4 Bitwise operators (&, |, ^, ~, <<, >>, >>>)](#134-bitwise-operators-------)
      * [Bitwise Operators Explained](#bitwise-operators-explained)
        * [Bitwise AND (&)](#bitwise-and-)
        * [Bitwise OR (|)](#bitwise-or-)
        * [Bitwise XOR (^)](#bitwise-xor-)
        * [Bitwise NOT (~)](#bitwise-not-)
        * [Left Shift (<<)](#left-shift-)
        * [Right Shift (>>)](#right-shift-)
        * [Unsigned Right Shift (>>>)](#unsigned-right-shift-)
    * [1.3.5 Assignment operators (=, +=, -=, *=, /=, %=)](#135-assignment-operators-------)
    * [1.3.6 Unary Operators (+, -, ++, --)](#136-unary-operators-------)
    * [1.3.7 Ternary Operator (? : )](#137-ternary-operator---)
    * [1.3.8 Instanceof operator](#138-instanceof-operator)
    * [Expressions](#expressions)
    * [Operators and Expressions – FAQs](#operators-and-expressions--faqs)
<!-- TOC -->

In Java, operators are special symbols that perform operations on variables and values. Expressions are combinations of
variables, literals, operators, and method calls that evaluate to a single value. Understanding operators and
expressions is fundamental for programming in Java, as they form the basis of calculations and logic in the code.

**Types of Operators in Java**

Java operators can be categorized into several types:

1. Arithmetic Operators
2. Relational operators
3. Logical operators
4. Bitwise operators
5. Assignment operators
6. Unary Operators
7. Ternary Operator
8. instance of operator

### 1.3.1 Arithmetic operators (+, -, *, /, %)

These operators are used to perform basic mathematical operations.

| Operator | Description         | Example |
|----------|---------------------|---------|
| +        | Addition            | a + b   |
| -        | Subtraction         | a - b   |
| *        | Multiplication      | a * b   |
| /        | Division            | a / b   |
| %        | Modulus (remainder) | a % b   |

**Example:**

```java
int a = 10;
int b = 5;
int sum = a + b; // 15
int difference = a - b; // 5
int product = a * b; // 50
int quotient = a / b; // 2
int remainder = a % b; // 0
```

### 1.3.2 Relational operators (==, !=, >, <, >=, <=)

These operators compare two values and return a boolean result.

**Example:**

| Operator | Description           | Example |
|----------|-----------------------|---------|
| ==       | Equal to              | a == b  |
| !=       | Not equal to          | a != b  |
| >        | Greater than          | a > b   |
| <        | Less than             | a < b   |
| >=       | Greater than or equal | a >= b  |
| <=       | Less than or equal    | a <= b  |

**Example:**

```java
int a = 10;
int b = 5;
boolean isEqual = (a == b); // false
boolean isGreater = (a > b); // true
```

### 1.3.3 Logical operators (&&, ||, !)

These operators are used to combine multiple boolean expressions.

| Operator | Description | Example |
|----------|-------------|---------|
| &&       | Logical AND | a && b  |
| !        | Logical NOT | !a      |

**Example:**

```java
boolean a = true;
boolean b = false;
boolean resultAnd = a && b; // false
boolean resultOr = a || b; // true
boolean resultNot = !a; // false
```

### 1.3.4 Bitwise operators (&, |, ^, ~, <<, >>, >>>)

These operators perform operations on individual bits of integer types.

| Operator | Description          | Example |
|----------|----------------------|---------|
| &        | Bitwise AND          | a & b   |
| or       | Bitwise OR           | a or b  |
| ^        | Bitwise XOR          | a ^ b   |
| ~        | Bitwise NOT          | ~a      |
| <<       | Left shift           | a << 2  |
| `>>`     | Right shift          | a >> 2  |
| `>>>`    | Unsigned right shift | a >>> 2 |

**Example:**

```java
int a = 5; // 0101 in binary
int b = 3; // 0011 in binary
int resultAnd = a & b; // 0001 (1 in decimal)
int resultOr = a | b; // 0111 (7 in decimal)
int resultXor = a ^ b; // 0110 (6 in decimal)
```

#### Bitwise Operators Explained

##### Bitwise AND (&)

**Operation**: Compares each bit of two integers and returns a new integer where each bit is set to 1 if both
corresponding
bits of the operands are 1; otherwise, it is set to 0.

Example:

```
bitA = 5 (in binary: 0101)
bitB = 3 (in binary: 0011)
```

Bitwise AND operation:

```
0101
0011
-----
0001 (which is 1 in decimal)
```

##### Bitwise OR (|)

**Operation**: Compares each bit of two integers and returns a new integer where each bit is set to 1 if at least one of
the corresponding bits is 1.

Example:

```
bitA = 5 (in binary: 0101)
bitB = 3 (in binary: 0011)
```

Bitwise OR operation:

```
0101
0011
-----
0111 (which is 7 in decimal)
```

##### Bitwise XOR (^)

**Operation**: Compares each bit of two integers and returns a new integer where each bit is set to 1 if the
corresponding bits are different (i.e., one is 1 and the other is 0).

Example:

```
bitA = 5 (in binary: 0101)
bitB = 3 (in binary: 0011)
```

Bitwise XOR operation:

```
0101
0011
-----
0110 (which is 6 in decimal)
```

##### Bitwise NOT (~)

**Operation**: Inverts each bit of the integer. Each 0 becomes 1 and each 1 becomes 0. Note that it also affects the
sign due to two's complement representation in Java.

Example:

```
bitA = 5 (in binary: 0101)
```

Bitwise NOT operation:

```
~0101 = 1010 (in a 4-bit representation, this equals -6 in decimal)
```

> In Java, int is a 32-bit signed integer, so the result is actually -6 due to the way numbers are represented in
> binary.

##### Left Shift (<<)

**Operation**: Shifts the bits of the integer to the left by the specified number of positions. Each left shift
effectively multiplies the number by 2.

Example:

```
bitA = 5 (in binary: 0101)
```

Left shift by 1 position:

```
0101 << 1 = 1010 (which is 10 in decimal)
```

##### Right Shift (>>)

**Operation**: Shifts the bits of the integer to the right by the specified number of positions. For signed integers,
this operator preserves the sign bit (the leftmost bit).

Example:

```
bitA = 5 (in binary: 0101)
```

Right shift by 1 position:

```
0101 >> 1 = 0010 (which is 2 in decimal)
```

##### Unsigned Right Shift (>>>)

**Operation**: Shifts the bits of the integer to the right by the specified number of positions, filling in zeros from
the left regardless of the sign.

Example:

```
bitA = 5 (in binary: 0101)
```

Unsigned right shift by 1 position:

```
0101 >>> 1 = 0010 (which is 2 in decimal)
```

### 1.3.5 Assignment operators (=, +=, -=, *=, /=, %=)

These operators are used to assign values to variables.

| Operator | Description         | Example |
|----------|---------------------|---------|
| =        | Simple assignment   | a = b   |
| +=       | Add and assign      | a += b  |
| -=       | Subtract and assign | a -= b  |
| *=       | Multiply and assign | a *= b  |
| /=       | Divide and assign   | a /= b  |
| %=       | Modulus and assign  | a %= b  |

**Example:**

```java
int a = 10;
a +=5; // a is now 15
a -=3; // a is now 12
```

### 1.3.6 Unary Operators (+, -, ++, --)

These operators operate on a single operand.

| Operator | Description | Example    |
|----------|-------------|------------|
| +        | Unary plus  | +a         |
| -        | Unary minus | -a         |
| ++       | Increment   | ++a or a++ |
| --       | Decrement   | --a or a-- |

**Example:**

```java
int a = 5;
a++; // a is now 6
        ++a; // a is now 7
a--; // a is now 6
        --a; // a is now 5
```

### 1.3.7 Ternary Operator (? : )

This is a shorthand form of the if-else statement.

**Syntax**

```
condition ? expression1 : expression2
```

**Example:**

```java
int a = 10;
int b = 5;
int max = (a > b) ? a : b; // max is 10
```

### 1.3.8 Instanceof operator

The instance of the operator is used for type checking. It can be used to test if an object is an instance of a class, a
subclass, or an interface. General format:

**Syntax**

```
object instance of class/subclass/interface
```

```java
class operators {
    public static void main(String[] args) {

        Person obj1 = new Person();
        Person obj2 = new Boy();

        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: "
                + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));

        // Since obj2 is of type boy,
        // whose parent class is person
        // and it implements the interface Myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Person: "
                + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
    }
}

class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}
```

**Output:**

```
obj1 instanceof Person: true
obj1 instanceof Boy: false
obj1 instanceof MyInterface: false
obj2 instanceof Person: true
obj2 instanceof Boy: true
obj2 instanceof MyInterface: true
```

### Expressions

An expression is a combination of variables, operators, and values that produces a result. Expressions can be of various
types:

* **Arithmetic Expressions**: Involve arithmetic operators.
* **Relational Expressions**: Result in boolean values.
* **Logical Expressions**: Combine boolean values.

```java
int a = 10;
int b = 20;
int sum = a + b; // Arithmetic expression
boolean isEqual = (a == b); // Relational expression
boolean result = (a < b) && (b > 0); // Logical expression
```

### Operators and Expressions – FAQs

1. **What are operators in Java?**

Operators in Java are special symbols that perform operations on variables and values. They can be categorized into
several types, including arithmetic, relational, logical, bitwise, assignment, and unary operators.

2. **What is the difference between == and = in Java?**

* **==** is a relational operator used to compare two values for equality.
* **=** is an assignment operator used to assign a value to a variable.

```java
int a = 5; // Assignment
boolean isEqual = (a == 5); // Comparison
```

3. **What is the purpose of the ternary operator?**

The ternary operator is a shorthand for an if-else statement. It allows you to evaluate a condition and return one of
two values based on whether the condition is true or false.

**Syntax**

```
condition ? expression1 : expression2;
```

```java
int max = (a > b) ? a : b; // Returns a if true, otherwise b
```

4. **What is the difference between ++a and a++?**

* **++a** is a **pre**-increment operator; it increments the value of a before it is used in an expression.
* **a++** is a **post**-increment operator; it increments the value of a after it is used in an expression.

```java
int a = 5;
int b = ++a; // b = 6, a = 6
int c = a++; // c = 6, a = 7
```

5. **What are bitwise operators?**

Bitwise operators perform operations on individual bits of integer types. Common bitwise operators include AND (&),
OR (|), XOR (^), NOT (~), and shift operators (<<, >>, >>>).

6. **How do shift operators work?**

* **Left Shift** (<<): Shifts bits to the left, filling in with zeros, effectively multiplying by 2 for each shift.
* **Right Shift** (>>): Shifts bits to the right, preserving the sign bit (arithmetic shift), effectively dividing by 2.
* **Unsigned Right Shift** (>>>): Shifts bits to the right, filling in with zeros, regardless of the sign.

7. **Can operators be overloaded in Java?**

No, Java does not support operator overloading. Each operator has a predefined meaning and behavior, and cannot be
changed or overloaded.

8. **What is short-circuit evaluation in Java?**

Logical operators && (AND) and || (OR) use short-circuit evaluation. This means that if the first operand of && is
false, the second operand is not evaluated, and if the first operand of || is true, the second operand is not evaluated.
This can prevent unnecessary computations and avoid potential errors.

```java
boolean a = false;
boolean b = (a && (5 / 0 == 1)); // Second operand is not evaluated, no division by zero occurs.
```

9. **What is the difference between == and equals() in Java?**

* **==** compares the reference (memory address) of two objects.
* **equals()** compares the actual content (state) of the objects.

```java
String str1 = new String("Hello");
String str2 = new String("Hello");

boolean isEqualReference = (str1 == str2); // false
boolean isEqualContent = str1.equals(str2); // true
```

10. **What are relational operators used for?**

Relational operators are used to compare two values or expressions. They return a boolean result (true or false) based
on the comparison.

* **a < b** returns true if a is less than b.
* **a >= b** returns true if a is greater than or equal to b.