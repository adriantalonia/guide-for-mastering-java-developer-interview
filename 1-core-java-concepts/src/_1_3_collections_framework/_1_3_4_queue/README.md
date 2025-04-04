# 1.3.4 Queue

The `Queue` interface is a core part of the Java Collections Framework. It is designed to hold elements prior to
processing and typically operates on a First-In-First-Out (FIFO) basis. However, different implementations can modify
this behavior (e.g., with priority ordering).

---

## Table of Contents

1. [Key Characteristics](#key-characteristics)
2. [How It Works](#how-it-works)
3. [Constructors & Implementations](#constructors--implementations)
4. [Common Operations](#common-operations)
5. [Best Practices](#best-practices)
6. [FAQs and Interview Questions](#faqs-and-interview-questions)
7. [Code Examples](#code-examples)
8. [Conclusion](#conclusion)

---

## Key Characteristics

- **FIFO Ordering:** Elements are added at the end and removed from the front.
- **Interface-Based:** `Queue` is an interface, implemented by classes like `LinkedList`, `PriorityQueue`, and
  `ArrayDeque`.
- **Null Elements:** Most implementations do not allow `null` as it is often used as a return value for operations like
  `poll()`.
- **Extra Methods:** Includes methods like `offer()`, `poll()`, `peek()` for queue-specific behaviors.
- **Variants:** Implementations like `PriorityQueue` or concurrent queues provide different behaviors.

---

## How It Works

A queue works like a line:

- **Enqueue:** Add elements to the tail.
- **Dequeue:** Remove elements from the head.
- **FIFO Principle:** First element added is the first to be removed.

---

## Constructors & Implementations

### LinkedList

```java
Queue<String> queue = new LinkedList<>();
```

- Doubly-linked list implementation.
- Supports null elements.

### PriorityQueue

```java
Queue<Integer> pq = new PriorityQueue<>();
```

- Elements ordered by natural ordering or comparator.
- Does not allow `null`.

### ArrayDeque

```java
Queue<String> deque = new ArrayDeque<>();
```

- Resizable array.
- Faster than LinkedList.

### ArrayBlockingQueue (concurrent)

```java
BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);
```

- Thread-safe with fixed capacity.

---

## Common Operations

### Insertion

```java
queue.add("A");      // Throws exception if full
queue.offer("B");    // Returns false if full
```

### Removal

```java
queue.remove();       // Throws exception if empty
queue.poll();         // Returns null if empty
```

### Peek/Examine

```java
queue.element();      // Throws exception if empty
queue.peek();         // Returns null if empty
```

### Iteration

```java
for(String item :queue){
        System.out.println(item);
}
```

---

## Best Practices

- Use `offer()` and `poll()` to avoid exceptions.
- Choose the right implementation for the use case.
- Avoid inserting `null`.
- Consider thread-safe queues for concurrency.
- Remember: `PriorityQueue` does not preserve FIFO.

---

## FAQs and Interview Questions

### FAQs

- **What is a Queue in Java?**
  A FIFO collection interface for managing processing order.

- **Difference between `add()` and `offer()`?**
  `add()` throws on failure; `offer()` returns false.

- **Difference between `remove()` and `poll()`?**
  `remove()` throws on empty; `poll()` returns null.

- **Why not insert `null`?**
  Many operations use `null` to indicate an empty queue.

### Interview Questions

### **1. Explain FIFO and how Java implements it.**
FIFO (**First In, First Out**) is a principle where elements are added to the end of the queue and removed from the front. It mimics real-world queues, like people waiting in line.

#### **Java Implementation:**
- The `Queue` interface provides various implementations that follow FIFO order:
  - `LinkedList`: Implements a doubly linked list structure.
  - `ArrayDeque`: Provides a resizable array implementation.
  - `PriorityQueue`: Does not strictly follow FIFO as it orders elements based on priority.

Common operations:
```java
Queue<String> queue = new LinkedList<>();
queue.offer("Alice");
queue.offer("Bob");
System.out.println(queue.poll()); // Alice (FIFO order)
```

---

### **2. Compare LinkedList vs ArrayDeque vs PriorityQueue**

| Feature         | LinkedList (Queue Mode) | ArrayDeque | PriorityQueue |
|---------------|----------------------|------------|--------------|
| **Implementation** | Doubly linked list | Resizable array | Binary heap |
| **Performance** | O(1) for insertion/deletion | O(1) for insertion/deletion | O(log n) for insertion/removal |
| **Memory Overhead** | Higher due to node references | Lower | Moderate |
| **Order** | FIFO | FIFO | Sorted order (not FIFO) |
| **Use Case** | General-purpose queue | Fast and memory-efficient | Priority-based processing |

---

### **3. When to use BlockingQueue?**
A `BlockingQueue` is used in **multi-threaded** environments where one or more threads produce data while others consume it.

#### **Use Cases:**
- **Producer-Consumer Problems**: Producers add tasks to a queue, and consumers process them at their own pace.
- **Thread Pools**: Executors use `BlockingQueue` to manage worker threads.
- **Rate Limiting**: Queues can limit request processing speed.

#### **BlockingQueue Implementations:**
- `LinkedBlockingQueue`: Bounded/unbounded blocking queue with linked nodes.
- `ArrayBlockingQueue`: Bounded blocking queue backed by an array.
- `PriorityBlockingQueue`: Similar to `PriorityQueue` but thread-safe.
- `SynchronousQueue`: Transfers elements directly between producers and consumers.

Example:
```java
BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);
queue.put(1);
queue.put(2);
System.out.println(queue.take()); // 1 (FIFO order)
```

---

### **4. How does PriorityQueue reorder elements?**
`PriorityQueue` **does not maintain FIFO order**. Instead, it **reorders elements based on priority** using a **binary heap**.

- **By default**, elements are ordered in **natural order** (`Comparable` interface).
- **Custom ordering** can be defined using a `Comparator`.
- The **head** of the queue is always the **smallest** (or highest priority) element.

Example:
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(30);
pq.offer(10);
pq.offer(20);

while (!pq.isEmpty()) {
    System.out.println(pq.poll());  // Output: 10, 20, 30
}
```

---

### **5. Common pitfalls in using queues**

❌ **Using `peek()` or `poll()` on an empty queue**
- `poll()` returns `null`, but `remove()` throws an exception.
- ✅ **Solution**: Always check `isEmpty()` before calling these methods.

❌ **BlockingQueue deadlocks**
- If a consumer doesn’t process fast enough, a full queue can block the producer.
- ✅ **Solution**: Use a bounded queue and adjust processing rates.

❌ **PriorityQueue doesn't guarantee FIFO order**
- If multiple elements have the same priority, their relative order is undefined.
- ✅ **Solution**: Use a `LinkedHashMap` or timestamp for tie-breaking.

❌ **ArrayDeque misuse**
- `null` elements are not allowed in `ArrayDeque`.
- ✅ **Solution**: Ensure elements are non-null before adding them.


---

## Code Examples

### Example: Basic Queue with LinkedList

```java
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");

        while (!queue.isEmpty()) {
            System.out.println("Polled: " + queue.poll());
        }
    }
}
```

### Example: PriorityQueue

```java
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.println("Polled: " + pq.poll());
        }
    }
}
```

---

## Conclusion

Queues are essential data structures in Java that provide controlled element access and processing. Knowing the
different implementations, their strengths, and common usage patterns will help you write better, more robust programs.
This guide covers foundational concepts, practical usage, and is a great resource for both learning and interview
preparation.




