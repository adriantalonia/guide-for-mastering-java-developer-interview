# 1.3.3 Map

The Map interface in Java is part of the java.util package and represents a collection of key-value pairs. Unlike other
collection interfaces, Map is not a subtype of Collection. It is designed for situations where you need to associate
keys with values, allowing efficient retrieval of values based on their keys.

<!-- TOC -->

* [1.3.3 Map](#133-map)
    * [Key Characteristics](#key-characteristics)
    * [How It Works](#how-it-works)
    * [Constructors](#constructors)
    * [Common Operations](#common-operations)
    * [Best Practices](#best-practices)
    * [FAQs and Interview Questions](#faqs-and-interview-questions)

<!-- TOC -->

The Map interface is also extended by these sub-interfaces:

* SortedMap
* NavigableMap
* ConcurrentMap

![image](../../resource/images/java-map-subinterfaces.png)

## Key Characteristics

- **Key-Value Pairs**: Each element in a Map is a key-value pair. Keys must be unique, but values can be duplicated.

- **No Direct Collection Methods**: Map does not extend Collection, so it lacks direct support for bulk operations like
  addAll or removeAll.

- **Null Values**: Depending on the implementation, Map can allow one null key and multiple null values (e.g., HashMap),
  while others (e.g., Hashtable) do not permit null keys or values.

- **Various Implementations**: Map has several implementations, including HashMap, LinkedHashMap, TreeMap, and
  Hashtable, each with different characteristics regarding ordering, null handling, and performance.

## Characteristics of a Map Interface

- A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and
  null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.
- The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap have predictable
  orders, while HashMap does not.
- There are two interfaces for implementing Map in Java. They are Map and SortedMap, and three classes: **HashMap,
  TreeMap, and LinkedHashMap**.

## How It Works

- **Key-Based Access**: Map provides efficient access to values based on their associated keys. This is typically
  achieved through hash tables or tree structures.

- **Hashing and Balancing**: Implementations like HashMap use hash tables, while TreeMap uses a Red-Black tree to
  maintain sorted order.

## Constructors

Each Map implementation provides its own constructors, but common ones include:

- **Default Constructor: Initializes an empty map.**

```java
Map<KeyType, ValueType> map = new HashMap<>();
```

- **With Initial Capacity: Specifies an initial capacity and load factor for hash-based maps.**

```java
Map<KeyType, ValueType> map = new HashMap<>(
int initialCapacity, float loadFactor);
```

- **From Another Map**: Initializes a map with the entries from another map.

```java
Map<KeyType, ValueType> map = new HashMap<>(existingMap);
```

## Common Operations

```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Accessing a value by key
        Integer ageBob = map.get("Bob");
        System.out.println("Bob's age: " + ageBob);

        // Checking for a key or value
        boolean hasAlice = map.containsKey("Alice");
        boolean hasAge40 = map.containsValue(40);
        System.out.println("Contains key 'Alice': " + hasAlice);
        System.out.println("Contains value 40: " + hasAge40);

        // Removing a key-value pair
        map.remove("Charlie");

        // Iterating over keys, values, and entries
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());
    }
}
```

## Best Practices

- **Choose the Right Implementation**: Use HashMap for general-purpose use, LinkedHashMap for maintaining insertion
  order, TreeMap for sorted order, and Hashtable for synchronized access (though ConcurrentHashMap is often preferred).

- **Minimize Collisions**: When using hash-based maps, ensure that the hashCode() method is properly implemented to
  minimize collisions.

- **Avoid Nulls in Some Implementations**: Be cautious with null keys and values, as not all implementations support
  them.

- **Use Appropriate Capacity**: For hash-based maps, set an appropriate initial capacity and load factor to optimize
  performance.

## FAQs and Interview Questions

1. **What is a Map in Java, and how is it different from a Collection?**

Answer: A Map represents a collection of key-value pairs and is not a subtype of Collection. Unlike collections, a Map
is used for key-based access and does not support operations like iteration over elements without converting to a
collection view.

2. **How do HashMap and Hashtable differ?**

Answer: HashMap is unsynchronized and allows null keys and values, while Hashtable is synchronized and does not allow
null keys or values.

3. **What are the main differences between HashMap and TreeMap?**

Answer: HashMap provides constant-time performance for basic operations and stores elements in an arbitrary order, while
TreeMap stores elements in a sorted order based on natural ordering or a custom comparator, with log(n) time complexity
for operations.

4. **How can you ensure thread safety when using a Map?**

Answer: Use a ConcurrentHashMap for thread-safe operations without locking the entire map, or use
Collections.synchronizedMap() to wrap a map with synchronized access.

5. **Why should you override equals() and hashCode() when using a custom key type in a Map?**

Answer: Overriding equals() and hashCode() ensures that keys are compared correctly for equality and are distributed
properly in hash-based maps, preventing issues like duplicate keys or poor performance.

--- 

# 1.3.3.1 HashMap

HashMap is a part of the Java Collections Framework and provides a basic implementation of the Map interface. It is used
to store data in the form of key-value pairs, where each key is unique and maps to a specific value.

## Key Characteristics

- **Key-Value Storage**: Stores elements as key-value pairs, allowing efficient retrieval of values by their keys.

- **Hash Table Based**: Internally uses a hash table to store entries, achieving average time complexity of O(1) for
  operations like put, get, and remove.

- **Unordered**: Does not guarantee any specific order of elements. The iteration order is not constant over time.

- **Allows Nulls**: Permits one null key and multiple null values.

- **Not Synchronized**: HashMap is unsynchronized and not thread-safe. If concurrent access is required, consider using
  ConcurrentHashMap.
