# 1.3.5 Iterators

Iterators in Java are used to traverse collections, allowing sequential access to elements without exposing the underlying structure. Java provides different types of iterators to iterate over collections efficiently.

<!-- TOC -->
* [1.3.5 Iterators](#135-iterators)
  * [**1. Iterator and ListIterator Interfaces**](#1-iterator-and-listiterator-interfaces)
    * [**Iterator Interface**](#iterator-interface)
      * [**Key Methods:**](#key-methods)
      * [**Example:**](#example)
    * [**ListIterator Interface**](#listiterator-interface)
      * [**Additional Methods:**](#additional-methods)
      * [**Example:**](#example-1)
  * [**2. The forEach Loop**](#2-the-foreach-loop)
      * [**Syntax:**](#syntax)
      * [**Example:**](#example-2)
  * [**Interview Questions**](#interview-questions)
    * [**1. What is the difference between Iterator and ListIterator?**](#1-what-is-the-difference-between-iterator-and-listiterator)
    * [**2. When should you use an Iterator instead of a for-each loop?**](#2-when-should-you-use-an-iterator-instead-of-a-for-each-loop)
    * [**3. What happens if you modify a collection while iterating using Iterator?**](#3-what-happens-if-you-modify-a-collection-while-iterating-using-iterator)
<!-- TOC -->

## **1. Iterator and ListIterator Interfaces**

### **Iterator Interface**
The `Iterator` interface is used to iterate over collections such as `ArrayList`, `HashSet`, and `LinkedList`. It provides methods to traverse elements in a forward direction.

#### **Key Methods:**
- `hasNext()`: Returns `true` if the iterator has more elements.
- `next()`: Returns the next element in the iteration.
- `remove()`: Removes the last element returned by `next()` (optional operation).

#### **Example:**
```java
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```

### **ListIterator Interface**
The `ListIterator` interface extends `Iterator` and allows bidirectional traversal of a `List`.

#### **Additional Methods:**
- `hasPrevious()`: Returns `true` if there are elements before the current position.
- `previous()`: Returns the previous element.
- `add(E e)`: Inserts an element at the current position.
- `set(E e)`: Replaces the last element returned.

#### **Example:**
```java
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        ListIterator<String> listIterator = names.listIterator();

        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
```

## **2. The forEach Loop**
Java introduced the `forEach` loop to simplify iteration over collections.

#### **Syntax:**
```java
for (Type element : collection) {
    // Process element
}
```

#### **Example:**
```java
import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

## **Interview Questions**

### **1. What is the difference between Iterator and ListIterator?**
| Feature            | Iterator | ListIterator |
|--------------------|---------|--------------|
| Direction         | Forward | Forward & Backward |
| Supports Remove?  | Yes     | Yes |
| Supports Add?     | No      | Yes |
| Supports Set?     | No      | Yes |

### **2. When should you use an Iterator instead of a for-each loop?**
- When you need to remove elements during iteration (`forEach` does not support `remove()`).
- When iterating over large collections where an explicit `Iterator` might be more efficient.

### **3. What happens if you modify a collection while iterating using Iterator?**
- It throws a `ConcurrentModificationException` unless you use `Iterator.remove()`.
- Alternative: Use `CopyOnWriteArrayList` for concurrent modification safety.



