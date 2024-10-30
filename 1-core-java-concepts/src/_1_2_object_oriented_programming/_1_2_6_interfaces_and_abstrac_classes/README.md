# 1.2.6 Interfaces and Abstract Classes

In Java, both interfaces and abstract classes are used to achieve abstraction, but they serve different purposes and
have different characteristics. Understanding the differences and how to implement them is crucial for effective Java
programming.

<!-- TOC -->

* [1.2.6 Interfaces and Abstract Classes](#126-interfaces-and-abstract-classes)
    * [1.2.6.1 Defining and implementing interfaces](#1261-defining-and-implementing-interfaces)
        * [Defining an Interface](#defining-an-interface)
        * [Implementing an Interface](#implementing-an-interface)
    * [1.2.6.2 Abstract class vs Interface](#1262-abstract-class-vs-interface)
        * [When to Use an Abstract Class](#when-to-use-an-abstract-class)
        * [When to Use an Interface](#when-to-use-an-interface)
* [FAQs](#faqs)

<!-- TOC -->

## 1.2.6.1 Defining and implementing interfaces

An interface in Java is a reference type that can contain only constants, method signatures, default methods, static
methods, and nested types. Interfaces cannot contain instance fields, and they cannot have constructors. The methods in
an interface are abstract by default (unless they are default or static).

### Defining an Interface

To define an interface, you use the `interface` keyword:

```java
interface InterfaceName {
    // Abstract method (implicitly public and abstract)
    void method1();

    // Another abstract method
    int method2(int param);

    // Default method (introduced in Java 8)
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method (introduced in Java 8)
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
```

### Implementing an Interface

A class that implements an interface must provide concrete implementations for all of its abstract methods. A class can
implement multiple interfaces, allowing for a form of multiple inheritance.

```java
class InterfaceImplementation implements InterfaceName {
    @Override
    public void method1() {
        System.out.println("Implementation of method1.");
    }

    @Override
    public int method2(int param) {
        return param * 2; // Example implementation
    }
}
```

**Example:**

```java
interface Animal {
    void sound(); // Abstract method

    default void sleep() { // Default method
        System.out.println("This animal sleeps.");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class InterfaceExample {
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

## 1.2.6.2 Abstract class vs Interface

While both abstract classes and interfaces are used to achieve abstraction, they have distinct differences in their
usage and characteristics:

| Feature              | Abstract Class	                                           | Interface                                                                                              |
|----------------------|-----------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| Instantiation        | Cannot be instantiated directly.                          | Cannot be instantiated directly.                                                                       |
| Methods              | Can contain both abstract and concrete methods.           | Can only contain abstract methods (Java 7 and earlier). Can have default and static methods (Java 8+). |
| Fields               | Can have instance variables (fields).                     | Can only have constants (public static final).                                                         |
| Access Modifiers     | Can use any access modifier (private, protected, public). | All methods are public and abstract by default.                                                        |
| Multiple Inheritance | A class can extend only one abstract class.               | A class can implement multiple interfaces.                                                             |
| Use Case             | Used when classes share a common base and behavior.       | Used to define a contract that multiple classes can implement.                                         |

### When to Use an Abstract Class

* When classes share common behavior and state.
* When you want to provide a base implementation for some methods.
* When you want to define constructors that can be called by subclasses.

### When to Use an Interface

* When you want to define a contract that multiple classes must adhere to.
* When you want to achieve multiple inheritance.
* When you want to specify that a class must implement certain methods without dictating how they should behave.

## FAQs

1. **What is an interface in Java?**
    - An interface is a reference type in Java that can contain only method signatures, default methods, static methods,
      and constants. It defines a contract that implementing classes must follow.

2. **What is an abstract class in Java?**
    - An abstract class is a class that cannot be instantiated and may contain both abstract methods (without a body)
      and concrete methods (with a body). It is used to provide a base for subclasses.

3. **Can an interface extend another interface?**
    - Yes, an interface can extend another interface, inheriting its abstract methods. A class can implement multiple
      interfaces, allowing for flexibility and multiple inheritance.

4. **Can an abstract class implement an interface?**
    - Yes, an abstract class can implement an interface. However, it must provide concrete implementations for all
      abstract methods of the interface or remain abstract.

5. **What is the difference between abstract classes and interfaces?**
    - Abstract classes can contain both abstract and concrete methods, can have instance variables, and can use any
      access modifier. Interfaces can only have abstract methods (Java 7 and earlier), can have default and static
      methods (Java 8+), and cannot have instance variables.

6. **Can a class implement multiple interfaces?**
    - Yes, a class in Java can implement multiple interfaces, allowing it to inherit behavior from multiple sources.

7. **When should I use an abstract class instead of an interface?**
    - Use an abstract class when classes share common behavior or state and when you want to provide a base
      implementation for some methods. Use an interface when you want to define a contract that multiple classes must
      adhere to, especially when those classes may not share a common ancestor.

8. **Can an interface have constructors?**
    - No, interfaces cannot have constructors. They cannot be instantiated directly.

9. **What happens if a class implements multiple interfaces with the same method signature?**
    - If a class implements multiple interfaces that have the same method signature, it must provide a single
      implementation for that method.

10. **Can you declare an interface as final?**
    - No, you cannot declare an interface as final. An interface is meant to be implemented by other classes, and
      declaring it as final would prevent that.






















