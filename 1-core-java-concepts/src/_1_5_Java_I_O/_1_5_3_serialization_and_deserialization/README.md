# 1.5.3 Serialization and Deserialization 📦

<!-- TOC -->
* [1.5.3 Serialization and Deserialization 📦](#153-serialization-and-deserialization-)
  * [Overview](#overview)
  * [Key Concepts](#key-concepts)
  * [Real-World Scenarios](#real-world-scenarios)
  * [Example Code](#example-code)
    * [1️⃣ Serializable Class](#1-serializable-class)
    * [2️⃣ Serialization Example](#2-serialization-example)
    * [3️⃣ Deserialization Example](#3-deserialization-example)
  * [Best Practices ✅](#best-practices-)
  * [Interview Questions & Answers](#interview-questions--answers)
    * [❓ What is serialization in Java?](#-what-is-serialization-in-java)
    * [❓ What is `serialVersionUID`?](#-what-is-serialversionuid)
    * [❓ What happens if a class does not implement Serializable?](#-what-happens-if-a-class-does-not-implement-serializable)
    * [❓ Can you prevent fields from being serialized?](#-can-you-prevent-fields-from-being-serialized)
    * [❓ What is the difference between externalization and serialization?](#-what-is-the-difference-between-externalization-and-serialization)
  * [Real Use Case Example](#real-use-case-example)
  * [Additional Resources](#additional-resources)
<!-- TOC -->

## Overview

Serialization and Deserialization are essential concepts in Java used to persist and retrieve the state of objects.

- **Serialization**: The process of converting a Java object into a byte stream for storage or transmission.
- **Deserialization**: The process of reconstructing a Java object from a byte stream.

Java provides built-in support through the `java.io.Serializable` interface and classes like `ObjectOutputStream` and
`ObjectInputStream`.

---

## Key Concepts

| Concept              | Description                                                                         |
|----------------------|-------------------------------------------------------------------------------------|
| `Serializable`       | A marker interface used to indicate that a class can be serialized.                 |
| `ObjectOutputStream` | Writes primitive data types and objects to an output stream.                        |
| `ObjectInputStream`  | Reads primitive data types and objects previously written using ObjectOutputStream. |
| `serialVersionUID`   | Used to verify compatibility between sender and receiver during deserialization.    |

---

## Real-World Scenarios

- Saving game states or user preferences.
- Caching objects locally.
- Transmitting objects over a network (e.g., RMI, web services).
- Deep cloning of objects using serialization.

---

## Example Code

### 1️⃣ Serializable Class

```java
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L; // Best practice for version control

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

---

### 2️⃣ Serialization Example

```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUser {
    public static void main(String[] args) {
        User user = new User("Alice", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
            System.out.println("User serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### 3️⃣ Deserialization Example

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUser {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User user = (User) ois.readObject();
            System.out.println("User deserialized:");
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

---

## Best Practices ✅

- Always declare a `serialVersionUID` in serializable classes.
- Avoid serialization of sensitive data (e.g., passwords).
- Mark transient fields with the `transient` keyword to skip serialization.
- Ensure class compatibility between serialization and deserialization versions.
- Handle exceptions gracefully and log necessary details.

---

## Interview Questions & Answers

### ❓ What is serialization in Java?

**✅ Answer**: It's the process of converting a Java object into a byte stream to save it to disk or send over a network.

---

### ❓ What is `serialVersionUID`?

**✅ Answer**: It’s a unique identifier for Serializable classes that helps during deserialization to verify
compatibility.

---

### ❓ What happens if a class does not implement Serializable?

**✅ Answer**: A `NotSerializableException` is thrown at runtime when trying to serialize the object.

---

### ❓ Can you prevent fields from being serialized?

**✅ Answer**: Yes, by marking them with the `transient` keyword.

```java
private transient String password;
```

---

### ❓ What is the difference between externalization and serialization?

**✅ Answer**: Externalization (`Externalizable`) gives complete control over serialization logic, unlike Serializable,
which is automatic.

---

## Real Use Case Example

In a chat application, user profile information like username and status may be serialized to cache it locally. This
avoids fetching it from the server every time the app loads.

---

## Additional Resources

- [Oracle Java Docs - Serialization](https://docs.oracle.com/en/java/)
- [Effective Java by Joshua Bloch - Chapter on Serialization]

