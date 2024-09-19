# Operators and Expressions

<!-- TOC -->

* [Operators and Expressions](#operators-and-expressions)
    * [3.1 Arithmetic operators (+, -, *, /, %)](#31-arithmetic-operators------)
    * [3.2 Relational operators (==, !=, >, <, >=, <=)](#32-relational-operators------)
    * [3.3 Logical operators (&&, ||, !)](#33-logical-operators---)
    * [3.4 Bitwise operators (&, |, ^, ~, <<, >>, >>>)](#34-bitwise-operators-------)
    * [3.5 Assignment operators (=, +=, -=, *=, /=, %=)](#35-assignment-operators-------)
    * [3.5 Unary Operators (+, -, ++, --)](#35-unary-operators-------)

<!-- TOC -->

In Java, operators are special symbols that perform operations on variables and values. Expressions are combinations of
variables, literals, operators, and method calls that evaluate to a single value. Understanding operators and
expressions is fundamental for programming in Java, as they form the basis of calculations and logic in the code.

**Types of Operators in Java**

Java operators can be categorized into several types:

* Arithmetic Operators
* Unary Operators
* Assignment Operator
* Relational Operators
* Logical Operators
* Ternary Operator
* Bitwise Operators
* Shift Operators
* instance of operator

### 3.1 Arithmetic operators (+, -, *, /, %)

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

### 3.2 Relational operators (==, !=, >, <, >=, <=)

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

### 3.3 Logical operators (&&, ||, !)

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

### 3.4 Bitwise operators (&, |, ^, ~, <<, >>, >>>)

These operators perform operations on individual bits of integer types.

| Operator | Description          | Example |
|----------|----------------------|---------|
| &        | Bitwise AND          | a & b   |
| or       | Bitwise OR           | a or b  |
| ^        | Bitwise XOR          | a ^ b   |
| ~        | Bitwise NOT          | ~a      |
| <<       | Left shift           | a << 2  |
| >>       | Right shift          | a >> 2  |
| >>>      | Unsigned right shift | a >>> 2 |

**Example:**

```java
int a = 5; // 0101 in binary
int b = 3; // 0011 in binary
int resultAnd = a & b; // 0001 (1 in decimal)
int resultOr = a | b; // 0111 (7 in decimal)
int resultXor = a ^ b; // 0110 (6 in decimal)
```

### 3.5 Assignment operators (=, +=, -=, *=, /=, %=)

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

### 3.6 Unary Operators (+, -, ++, --)

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

### 3.7 Ternary Operator (? : )

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