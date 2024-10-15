# 1.2.5 Abstraction

Abstraction in Java is a fundamental concept in object-oriented programming (OOP) that focuses on hiding the complex
implementation details of a system and exposing only the essential features to the users. Abstraction allows programmers
to create a simple interface that simplifies interactions with complex systems, thereby enhancing code readability and
maintainability.

<!-- TOC -->

* [1.2.5 Abstraction](#125-abstraction)
    * [Key Concepts](#key-concepts)
* [1.2.5.1 Abstract Classes and Methods](#1251-abstract-classes-and-methods)
    * [Syntax](#syntax)
* [1.2.5.2 Interfaces](#1252-interfaces)
    * [Syntax](#syntax-1)
* [FAQs](#faqs)

<!-- TOC -->

In Java, abstraction can be achieved using two main mechanisms:

1. **Abstract Classes**
2. **Interfaces**

Abstraction in Java is a fundamental concept in object-oriented programming (OOP) that focuses on hiding the complex
implementation details of a system and exposing only the essential features to the users. Abstraction allows programmers
to create a simple interface that simplifies interactions with complex systems, thereby enhancing code readability and
maintainability.

In Java, abstraction can be achieved using two main mechanisms:

1. Abstract Classes
2. Interfaces

## Key Concepts

1. **Purpose of Abstraction**: Abstraction helps in reducing programming complexity and effort by allowing a programmer
   to focus on interactions at a high level without needing to understand all underlying details.

2. **Real-World Analogy**: When driving a car, the driver does not need to understand the internal workings of the
   engine; they only need to know how to operate the steering wheel, pedals, and other controls.

3. **Abstract Classes vs. Interfaces**:
    - Abstract classes can have both abstract (no body) and concrete (with body) methods, whereas interfaces can only
      have abstract methods (in Java 7 and earlier). From Java 8 onwards, interfaces can also have default and static
      methods.

**Data Abstraction** may also be defined as the process of identifying only the required characteristics of an object
ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of
similar type and also help in classifying/grouping the objects.

# 1.2.5.1 Abstract Classes and Methods

An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. It can contain
abstract methods (methods without a body) as well as concrete methods (methods with a body).

## Syntax

```java
abstract class AbstractClass {
    abstract void abstractMethod(); // Abstract method

    void concreteMethod() { // Concrete method
        System.out.println("This is a concrete method.");
    }
}
```

**Example:**

```java
abstract class Animal {
    abstract void sound(); // Abstract method

    void sleep() { // Concrete method
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Outputs: Dog barks.
        dog.sleep(); // Outputs: This animal sleeps.

        Animal cat = new Cat();
        cat.sound(); // Outputs: Cat meows.
        cat.sleep(); // Outputs: This animal sleeps.
    }
}
```

# 1.2.5.2 Interfaces

An interface in Java is a reference type that can contain only constants, method signatures, default methods, static
methods, and nested types. Interfaces cannot contain instance fields.

## Syntax

```java
interface InterfaceName {
    void method1(); // Abstract method

    void method2(); // Abstract method
}
```

**Example:**

```java
interface Drawable {
    void draw(); // Abstract method
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw(); // Outputs: Drawing a Circle

        Drawable rectangle = new Rectangle();
        rectangle.draw(); // Outputs: Drawing a Rectangle
    }
}
```

# FAQs

1. **What is abstraction in Java?**

   Abstraction is a principle of object-oriented programming that focuses on hiding complex implementation details and
   exposing only the necessary parts of an object or system.

2. **What is an abstract class?**

   An abstract class is a class that cannot be instantiated and may contain abstract methods (without a body) and
   concrete methods (with a body).

3. **What is an interface?**

   An interface is a reference type in Java that can only contain method signatures and constants. It defines a contract
   that implementing classes must follow.

4. **Can an abstract class have constructors?**

   Yes, an abstract class can have constructors, which can be called when a subclass is instantiated.

5. **Can a class implement multiple interfaces?**

   Yes, a class in Java can implement multiple interfaces, allowing for a form of multiple inheritance.

6. **Can an interface extend another interface?**

   Yes, an interface can extend another interface, inheriting its abstract methods