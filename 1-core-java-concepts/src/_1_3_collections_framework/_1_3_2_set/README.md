# 1.3.2 Set

Java Set is a collection of elements (Or objects) that contains no duplicate elements. Java Set is an interface that
extends Collection interface. Unlike List, Java Set is NOT an ordered collection, it’s elements does NOT have a
particular order. Java Set does NOT provide a control over the position where you can insert an element. You cannot
access elements by their index and also search elements in the list.

![image](../../resource/images/java-set-implementation.png)

<!-- TOC -->
* [1.3.2 Set](#132-set)
  * [Key Characteristics of a Set](#key-characteristics-of-a-set)
  * [Syntax](#syntax)
    * [Common Implementations](#common-implementations)
  * [Operations on the Set Interface](#operations-on-the-set-interface)
  * [1.3.2.1 HashSet](#1321-hashset)
    * [Key Characteristics](#key-characteristics)
    * [How HashSet Works](#how-hashset-works)
    * [Constructors](#constructors)
    * [Basic Operations](#basic-operations)
      * [Handling Custom Objects](#handling-custom-objects)
    * [Best Practices](#best-practices)
    * [FAQs - Interview questions](#faqs---interview-questions)
<!-- TOC -->

## Key Characteristics of a Set

- **Unique Elements**: A Set ensures that no duplicate elements are present.
- **Null Elements**: Most implementations allow a single null element.
- **Unordered vs. Ordered vs. Sorted**:
    - **HashSet** is unordered.
    - **LinkedHashSet** maintains insertion order.
    - **TreeSet** maintains a sorted order.

## Syntax

**Declaration**: The Set interface is declared as:

```java
public interface Set extends Collection 
```

**Creating Set Objects**: Since Set is an interface, objects cannot be created of the typeset. We always need a class
that extends this list in order to create an object. And also, after the introduction of Generics in Java 1.5, it is
possible to restrict the type of object that can be stored in the Set. This type-safe set can be defined as

```java
// Obj is the type of the object to be stored in Set 
Set<Obj> set = new HashSet<Obj>(); 
```

### Common Implementations

**HashSet:**

```java
Set<Obj> hashSet = new HashSet<>();
```

**LinkedHashSet:**

```java
Set<Obj> linkedHashSet = new LinkedHashSet<>();
```

**TreeSet:**

```java
Set<Obj> treeSet = new TreeSet<>();
```

**Sample Program to Illustrate Set interface:**

```java
public class GFG {
    public static void main(String[] args) {
        // Demonstrating Set using HashSet
        // Declaring object of type String 
        Set<String> hash_Set = new HashSet<String>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        // Printing elements of HashSet object
        System.out.println(hash_Set);
    }
}
```

**Output:**

```
[Set, Example, Geeks, For]
```

## Operations on the Set Interface

The set interface allows the users to perform the basic mathematical operation on the set. Let’s take two arrays to
understand these basic operations. Let set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7, 5]. Then the
possible operations on the sets are:

1. **Intersection**: This operation returns all the common elements from the given two sets. For the above two sets, the
   intersection would be:

```
Intersection = [0, 1, 3, 4]
```

2. **Union**: This operation adds all the elements in one set with the other. For the above two sets, the union would
   be:

```
Union = [0, 1, 2, 3, 4, 5, 7, 8, 9]
```

3. **Difference**: This operation removes all the values present in one set from the other set. For the above two sets,
   the difference would be:

```
Difference = [2, 8, 9]
```

**Example:**

```java
public class SetExample {

    // Main driver method 
    public static void main(String args[]) {
        // Creating an object of Set class 
        // Declaring object of Integer type 
        Set<Integer> a = new HashSet<Integer>();

        // Adding all elements to List 
        a.addAll(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));


        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}
```

---

## 1.3.2.1 HashSet

This class is the most commonly used implementation of Set. As the name implies, it is implemented by a hash table, an
array in which elements are stored at a position derived from their contents

### Key Characteristics

- **Underlying Structure**: HashSet is backed by a HashMap. Each element in a HashSet is stored as a key in the HashMap,
  with a constant dummy value.

- **No Ordering**: HashSet does not guarantee any specific order of iteration. The order might change over time.

- **Constant-Time Performance**: The basic operations such as add, remove, and contains are performed in constant time
  on average. This is due to the efficient hashing mechanism.

- **Null Elements**: HashSet allows the storage of a single null element.

- **Non-Synchronized**: HashSet is not thread-safe. If multiple threads access a HashSet concurrently and at least one
  of the threads modifies it, external synchronization is required.

### How HashSet Works

- **Hashing**: When an element is added to a HashSet, its hash code is computed using the hashCode() method. This hash
  code determines the bucket location where the element is stored in the underlying array.

- **Handling Collisions**: If two elements have the same hash code, they are stored in a linked list at the same bucket
  location. Java 8 and later use a balanced tree structure (red-black tree) to handle collisions, improving performance
  from O(n) to O(log n) in the case of many collisions.

- **Load Factor and Capacity**: The capacity of a HashSet is the number of buckets in the hash table, and the initial
  capacity is the capacity at the time the hash table is created. The load factor is a measure of how full the hash
  table can get before it is resized. A higher load factor means fewer rehash operations but more collisions.

**Syntax**

```java
HashSet<Type> hashSet = new HashSet<>();
```

### Constructors

- **Default Constructor:**

```java
HashSet<E> hashSet = new HashSet<>();
```

- **With Initial Capacity:**

```java
HashSet<E> hashSet = new HashSet<>(initialCapacity);
```

- **With Initial Capacity and Load Factor:**

```java
HashSet<E> hashSet = new HashSet<>(initialCapacity, loadFactor);
```

- **From Another Collection:**

```java
HashSet<E> hashSet = new HashSet<>(collection);
```

**Examples**

### Basic Operations

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate, will not be added

        System.out.println("Fruits Set: " + fruits);

        // Checking if an element exists
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains Apple: " + hasApple); // true

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterating over a Set
        System.out.println("Iterating over Set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

#### Handling Custom Objects

```java
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class HashSetCustomObjects {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 30)); // Duplicate based on equals and hashCode

        System.out.println("People Set: " + people);
    }
}
```

### Best Practices

- **Choose an Appropriate Initial Capacity and Load Factor**: If you have an estimate of the number of elements, set the
  initial capacity and load factor appropriately to minimize resizing and collision handling overhead.

- **Implement equals() and hashCode()**: For custom objects, ensure that equals() and hashCode() methods are properly
  overridden to maintain the contract and ensure correct behavior in the HashSet.

- **Synchronization**: If a HashSet is accessed by multiple threads concurrently, consider wrapping it with
  Collections.synchronizedSet() or using ConcurrentHashMap if applicable.

### FAQs - Interview questions

1. **What is a HashSet in Java? How does it differ from other Set implementations?**

   _Answer_: A **HashSet** is a collection that implements the Set interface and uses a hash table for storage. Unlike
   **TreeSet**, which maintains a sorted order, and **LinkedHashSet**, which maintains insertion order, HashSet does not
   guarantee any order of its elements. It offers constant-time performance for basic operations, assuming the hash
   function disperses elements properly.

2. **How does HashSet handle duplicate elements?**

   _Answer_: HashSet does not allow duplicate elements. When an element is added, the HashSet checks for equality using
   the equals() method. If an equal element is already present, the new element is not added.

3. **What is the role of hashCode() and equals() methods in a HashSet?**

   _Answer_: hashCode() is used to determine the bucket location for an element in the hash table. equals() is used to
   check if two objects are equivalent. For a HashSet to function correctly, objects stored in it must implement
   consistent and correctly overridden hashCode() and equals() methods.

4. **Can you store null values in a HashSet?**

   _Answer_: Yes, a HashSet can store a single null element.

5. **Explain the internal working of a HashSet. How does it handle collisions?**

   _Answer_: HashSet is backed by a HashMap where each element is stored as a key with a constant dummy value. When
   adding
   an element, its hash code is computed to find the bucket. If a collision occurs (two elements have the same hash
   code), the elements are stored in a linked list (or a tree structure if there are many collisions) within that
   bucket. Java 8 introduced tree bins (red-black trees) to handle frequent collisions, which improves performance from
   O(n) to O(log n).

6. **What are initial capacity and load factor in a HashSet? How do they affect performance?**

   _Answer_: The initial capacity is the number of buckets in the hash table at creation, and the load factor is a
   measure
   of how full the hash table can get before resizing. A higher load factor reduces space usage but increases the
   likelihood of collisions, which can degrade performance. Choosing an appropriate initial capacity and load factor can
   significantly improve performance by balancing space and speed.

7. **Is HashSet synchronized? How can you make it thread-safe?**

   _Answer_: HashSet is not synchronized. To make it thread-safe, you can wrap it with Collections.synchronizedSet(new
   HashSet<>()). Alternatively, consider using ConcurrentHashMap if you need a concurrent collection with similar
   behavior.

8. **What happens if you modify an object stored in a HashSet after it has been added?**

   _Answer_: Modifying an object that affects its hash code or equality can lead to inconsistent behavior. The HashSet
   may
   not be able to find the object if it's queried, as it relies on the original hash code and equality for retrieval.
   It's generally a good practice to avoid modifying objects once they are stored in a HashSet.

9. **How do you iterate over elements in a HashSet?**

   _Answer_: You can iterate over elements in a HashSet using an enhanced for-loop, an iterator, or a lambda expression
   with the forEach method. Example:
    ```java
    Set<String> set = new HashSet<>();
      for (String s : set) {
        System.out.println(s);
      }
    ```

10. **Can you explain a scenario where using a HashSet would be more appropriate than a List?**

    _Answer_: Use a HashSet when you need to maintain a collection of unique elements and do not require ordered access.
    For instance, if you need to quickly check for the presence of an element and ensure no duplicates, a HashSet is
    more efficient than a List due to its constant-time performance for lookup operations.

---