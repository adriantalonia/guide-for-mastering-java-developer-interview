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
  * [1.3.2.2 LinkedHashSet](#1322-linkedhashset)
    * [Key Characteristics](#key-characteristics-1)
    * [How It Works](#how-it-works)
    * [Constructors](#constructors-1)
    * [Common Operations](#common-operations)
    * [Best Practices](#best-practices-1)
    * [FAQs and Interview Questions](#faqs-and-interview-questions)
  * [1.3.2.3 EnumSet](#1323-enumset)
    * [Key Characteristics](#key-characteristics-2)
    * [How It Works](#how-it-works-1)
    * [Constructors](#constructors-2)
    * [Common Operations](#common-operations-1)
    * [Best Practices](#best-practices-2)
    * [FAQs and Interview Questions](#faqs-and-interview-questions-1)
  * [1.3.2.4 TreeSet](#1324-treeset)
    * [Key Characteristics](#key-characteristics-3)
    * [How It Works](#how-it-works-2)
    * [Constructors](#constructors-3)
    * [Common Operations](#common-operations-2)
    * [Best Practices](#best-practices-3)
    * [FAQs and Interview Questions](#faqs-and-interview-questions-2)
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

## 1.3.2.2 LinkedHashSet

The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. When the
iteration order is needed to be maintained this class is used. When iterating through a HashSet the order is
unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. When
cycling through LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted.

The LinkedHashSet is a class in Java's Collections Framework that extends HashSet and implements the Set interface. It
retains the order of elements based on their insertion order. This is achieved using a doubly-linked list that runs
through all entries.

### Key Characteristics

- **Ordered**: Maintains the insertion order of elements. When iterating over a LinkedHashSet, elements are returned in
  the order they were added.

- **Unique Elements**: Like HashSet, it does not allow duplicate elements.

- **Underlying Structure**: Combines a hash table with a linked list to maintain order without compromising on
  performance.

- **Performance**: Generally offers slightly lower performance than HashSet due to the overhead of maintaining the
  linked list. However, basic operations like add, remove, and contains still run in constant time on average.

- **Null Elements**: Allows a single null element.

### How It Works

- **Hash Table with Linked List**: Each element in a LinkedHashSet is stored in a hash table and linked to the previous
  and next elements via a linked list. This enables maintaining insertion order.

- **Iteration**: The linked list defines the iteration order, which is the order in which elements were inserted.

### Constructors

- **Default Constructor**:

```java
LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>();
```

- **With Initial Capacity**:

```java
LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>(initialCapacity);
```

- **With Initial Capacity and Load Factor**:

```java
LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>(initialCapacity, loadFactor);
```

- **From Another Collection**:

```java
LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>(collection);
```

### Common Operations

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");

        // Attempt to add a duplicate
        linkedHashSet.add("One"); // Duplicate, will not be added

        // Iterating over elements
        System.out.println("LinkedHashSet maintains insertion order:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        // Checking for presence of an element
        boolean containsTwo = linkedHashSet.contains("Two");
        System.out.println("Contains 'Two': " + containsTwo);

        // Removing an element
        linkedHashSet.remove("Three");
        System.out.println("After removing 'Three': " + linkedHashSet);
    }
}
```

### Best Practices

- **Use When Order Matters**: Prefer LinkedHashSet over HashSet when you need to maintain the order of elements as they
  were inserted.

- **Performance Considerations**: Be aware of the slight performance overhead due to maintaining a linked list. If order
  is not important, a HashSet might be more performant.

- **Null Elements**: If nulls are expected, ensure that your logic handles them gracefully, as LinkedHashSet allows
  exactly one null element.

### FAQs and Interview Questions

1. **What is a LinkedHashSet, and how does it differ from a HashSet?**

   Answer: A LinkedHashSet is an ordered version of HashSet that maintains insertion order using a doubly-linked list.
   Unlike HashSet, which does not guarantee order, LinkedHashSet ensures elements are iterated in the order they were
   added.

2. **How does LinkedHashSet maintain insertion order?**

   Answer: It uses a combination of a hash table and a linked list. The linked list runs through all the elements in the
   order they were inserted, thus maintaining insertion order during iteration.

3. **What are the time complexities of basic operations in a LinkedHashSet?**

   Answer: Basic operations like add, remove, and contains have constant time complexity on average, similar to HashSet,
   due to the underlying hash table. However, there is an additional overhead due to the linked list.

4. **Can a LinkedHashSet contain null elements?**

   Answer: Yes, it can store a single null element.

5. **Is LinkedHashSet synchronized? How can you make it thread-safe?**

   Answer: LinkedHashSet is not synchronized. You can make it thread-safe by wrapping it with
   Collections.synchronizedSet(new LinkedHashSet<>()).

6. **When should you use a LinkedHashSet over a HashSet or TreeSet?**

   Answer: Use a LinkedHashSet when you need to maintain insertion order without the sorting overhead of a TreeSet. If
   order is not important, a HashSet might be more performant. Use TreeSet when a sorted order is required.

7. **How do you convert a LinkedHashSet to a List?**

   Answer: You can convert it using the constructor of ArrayList:
    ```java
    Set<String> set = new LinkedHashSet<>();
    List<String> list = new ArrayList<>(set);
    ```

## 1.3.2.3 EnumSet

EnumSet is a specialized implementation of the Set interface specifically designed for use with Java enum types. It is
highly efficient and provides a compact and performance-optimized implementation for handling enum constants.

### Key Characteristics

- **Efficient Storage**: EnumSet is implemented as a bit vector, offering a fast and memory-efficient way to store enum
  constants.

- **All Elements Must Be of a Single Enum Type**: EnumSet can only hold enums from a single specified enum type.

- **Ordered**: Maintains the natural order of enum constants, which is the order in which they are declared.

- **Not Synchronized**: Like most collections, EnumSet is not synchronized and must be manually synchronized if accessed
  by multiple threads concurrently.

### How It Works

- **Bit Vector Representation**: Internally, EnumSet uses a bit vector to represent the set of enum constants. Each bit
  in the vector corresponds to an enum constant, allowing rapid operations like add, remove, and contains.

- **Type Safety**: EnumSet is type-safe and ensures that only valid enum constants are added.

### Constructors

EnumSet does not have public constructors. Instead, it provides static factory methods to create instances:

- **of()**: Creates an EnumSet with specified elements.

```java
EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
```

- **allOf()**: Creates an EnumSet containing all elements of the specified enum type.

```java
EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
```

- **noneOf()**: Creates an empty EnumSet of the specified enum type.

```java
EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
```

- **range()**: Creates an EnumSet containing all the elements in the range between two specified elements.

```java
EnumSet<Day> workweek = EnumSet.range(Day.MONDAY, Day.FRIDAY);
```

- **complementOf()**: Creates an EnumSet containing all elements not present in the specified EnumSet.

```java
EnumSet<Day> nonWeekend = EnumSet.complementOf(weekend);
```

### Common Operations

```java
import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        // Creating an EnumSet with specific values
        Set<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        // Create an EnumSet with all values
        Set<Day> allDays = EnumSet.allOf(Day.class);

        // Create an empty EnumSet
        Set<Day> noDays = EnumSet.noneOf(Day.class);

        // Create an EnumSet with a range of values
        Set<Day> workweek = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        // Create an EnumSet with complement of another EnumSet
        Set<Day> nonWeekend = EnumSet.complementOf(weekend);

        // Displaying EnumSets
        System.out.println("Weekend: " + weekend);
        System.out.println("All Days: " + allDays);
        System.out.println("No Days: " + noDays);
        System.out.println("Workweek: " + workweek);
        System.out.println("Non-weekend: " + nonWeekend);
    }
}
```

### Best Practices

- **Use for Enum Types**: Only use EnumSet for enum types, as it is specifically optimized for this use case.

- **Performance Optimization**: Use EnumSet when performance and memory efficiency are critical, especially when working
  with large numbers of enum constants.

- **Type Safety**: Benefit from Java's type safety, which ensures that only valid enum constants are added to the set.

### FAQs and Interview Questions

1. **What is an EnumSet in Java, and how does it differ from other Set implementations?**

   Answer: EnumSet is a specialized Set implementation designed for enum types. It differs from other Set
   implementations by offering highly efficient storage and operations for enums, using a bit vector for representation.

2. **How does EnumSet maintain order?**

   Answer: EnumSet maintains the natural order of enum constants, which is the order they are declared in the enum type.

3. **Can EnumSet contain elements from different enum types?**

   Answer: No, an EnumSet can only contain elements from a single specified enum type.

4. **What are the benefits of using EnumSet over other Set implementations?**

   Answer: EnumSet provides efficient storage and fast operations for enum types, with minimal memory overhead. It is
   type-safe and maintains the natural order of the enum constants.

5. **Is EnumSet synchronized? How can you make it thread-safe?**

   Answer: EnumSet is not synchronized. To make it thread-safe, you can wrap it with Collections.synchronizedSet(new
   EnumSet<...>(...)).

6. **How do you create an EnumSet that contains all elements except a given subset?**

   Answer: You can use the complementOf() method to create an EnumSet that contains all elements not present in the
   specified subset:
    ```
    EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
    EnumSet<Day> nonWeekend = EnumSet.complementOf(weekend);
    ```

--- 

## 1.3.2.4 TreeSet

TreeSet is a class in Java's Collections Framework that implements the SortedSet interface. It stores elements in a
sorted, ascending order and is based on a TreeMap internally, typically a Red-Black tree, which ensures that the set
remains ordered.

### Key Characteristics

- **Sorted Order**: Elements in a TreeSet are stored in a natural ascending order according to their natural ordering or
  by a specified comparator.

- **NavigableSet**: It implements the NavigableSet interface, providing methods to navigate through the set (e.g.,
  lower(), floor(), ceiling(), higher()).

- **No Duplicates**: Like all Set implementations, TreeSet does not allow duplicate elements.

- **Performance**: Provides O(log n) time complexity for the basic operations like add, remove, and contains, due to its
  underlying Red-Black tree structure.

- **Comparator**: By default, TreeSet relies on the natural ordering, but a custom comparator can be provided when the
  set is constructed.

- **No Nulls**: TreeSet does not allow null elements.

### How It Works

- **Red-Black Tree**: Internally, TreeSet uses a Red-Black tree to store elements in a sorted manner. This
  self-balancing binary search tree ensures that operations like insertion, deletion, and lookup are efficient.

- **Sorting**: Elements are sorted based on their natural ordering (Comparable) or by a Comparator provided at set
  construction.

### Constructors

1. **Default Constructor:**

```java
TreeSet<E> treeSet = new TreeSet<>();
```

2. **With Comparator:**

```java
TreeSet<E> treeSet = new TreeSet<>(Comparator < E > comparator);
```

3. **From Another Collection:**

```java
TreeSet<E> treeSet = new TreeSet<>(Collection < E > collection);
```

4. **From Another SortedSet:**

```java
TreeSet<E> treeSet = new TreeSet<>(SortedSet < E > sortedSet);
```

### Common Operations

```java
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);

        System.out.println("TreeSet in Natural Order:");
        System.out.println(treeSet);

        // Checking for presence of an element
        boolean containsFive = treeSet.contains(5);
        System.out.println("Contains 5: " + containsFive);

        // Removing an element
        treeSet.remove(10);
        System.out.println("After removing 10: " + treeSet);

        // Accessing the first and last elements
        Integer first = ((TreeSet<Integer>) treeSet).first();
        Integer last = ((TreeSet<Integer>) treeSet).last();
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);

        // Iterating in descending order
        System.out.println("Descending Order:");
        Iterator<Integer> descendingIterator = ((TreeSet<Integer>) treeSet).descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
```

### Best Practices

- **Use for Sorted Data**: Prefer TreeSet when you need to store elements in a sorted order and efficiently perform
  range searches or order-sensitive operations.

- **Comparator Usage**: Use a custom comparator if you need a specific order other than the natural ordering of
  elements.

- **No Nulls**: Avoid inserting null elements into a TreeSet, as it will throw a NullPointerException.

### FAQs and Interview Questions

1. **What is a TreeSet in Java, and how does it differ from a HashSet?**

   Answer: TreeSet is a sorted set that stores elements in a natural or custom order using a tree data structure. Unlike
   HashSet, which is unordered, TreeSet maintains elements in sorted order and has higher time complexity for basic
   operations.

2. **How does TreeSet maintain order?**

   Answer: TreeSet uses a Red-Black tree, a self-balancing binary search tree, to maintain elements in sorted order.

3. **Can TreeSet store null elements?**

   Answer: No, TreeSet does not allow null elements. Attempting to add null will result in a NullPointerException.

4. **What is the time complexity of basic operations in a TreeSet?**

   Answer: The time complexity for basic operations like add, remove, and contains is O(log n) due to the underlying
   Red-Black tree structure.

5. **How can you iterate over a TreeSet in descending order?**

   Answer: You can use the descendingIterator() method to iterate over the elements in descending order.

6. **When should you use a TreeSet over a LinkedHashSet or EnumSet?**

   Answer: Use TreeSet when you need elements to be stored and accessed in a sorted order. Use LinkedHashSet when you
   need to maintain insertion order without sorting, and use EnumSet for efficient storage of enum constants.





