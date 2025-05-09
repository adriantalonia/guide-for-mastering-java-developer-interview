# 1.6.1 Threads and Runnable

<!-- TOC -->
* [1.6.1 Threads and Runnable](#161-threads-and-runnable)
  * [1.6.1.1 Creating Threads (Thread Class & Runnable Interface)](#1611-creating-threads-thread-class--runnable-interface)
    * [✅ Using the `Thread` Class](#-using-the-thread-class)
    * [✅ Using the `Runnable` Interface](#-using-the-runnable-interface)
    * [🔍 Key Differences](#-key-differences)
    * [🧠 Best Practice](#-best-practice)
  * [1.6.1.2 Thread Lifecycle](#1612-thread-lifecycle)
    * [🔁 Lifecycle States](#-lifecycle-states)
    * [🔄 Lifecycle Diagram (Conceptually)](#-lifecycle-diagram-conceptually)
    * [🧪 Example with Sleep (Timed Waiting)](#-example-with-sleep-timed-waiting)
  * [💡 Real-World Scenario](#-real-world-scenario)
  * [🎯 Interview Questions & Answers](#-interview-questions--answers)
    * [❓ Q1: What is the difference between extending Thread and implementing Runnable?](#-q1-what-is-the-difference-between-extending-thread-and-implementing-runnable)
    * [❓ Q2: What happens if you call run() instead of start()?](#-q2-what-happens-if-you-call-run-instead-of-start)
    * [❓ Q3: What are the states of a thread?](#-q3-what-are-the-states-of-a-thread)
    * [❓ Q4: How to create a thread-safe class?](#-q4-how-to-create-a-thread-safe-class)
  * [✅ Summary](#-summary)
<!-- TOC -->

## 1.6.1.1 Creating Threads (Thread Class & Runnable Interface)

Java supports multithreading by allowing multiple threads to execute concurrently. Threads can be created in two primary
ways:

In Java, there are two primary ways to create threads:

1. Extending the `Thread` class
2. Implementing the `Runnable` interface

### ✅ Using the `Thread` Class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running using Thread class");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // start() invokes run()
    }
}
```

### ✅ Using the `Runnable` Interface

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
```

### 🔍 Key Differences

| Feature     | Thread Class                | Runnable Interface       |
|-------------|-----------------------------|--------------------------|
| Inheritance | Extends Thread              | Implements Runnable      |
| Flexibility | Cannot extend another class | Can extend another class |
| Reusability | Less reusable               | More reusable            |

### 🧠 Best Practice

Prefer `Runnable` when you only need to execute code in a thread, as it promotes better OOP practices and decoupling.

---

## 1.6.1.2 Thread Lifecycle

A thread in Java has the following states defined in the `Thread.State` enum:

### 🔁 Lifecycle States

1. **New** – Thread object is created but not started.
2. **Runnable** – Thread is ready to run and waiting for CPU.
3. **Running** – Thread is currently executing.
4. **Blocked** – Thread is blocked waiting for a monitor lock.
5. **Waiting** – Thread is waiting indefinitely for another thread to perform a specific action.
6. **Timed Waiting** – Thread is waiting for a specified time.
7. **Terminated** – Thread has exited.

### 🔄 Lifecycle Diagram (Conceptually)

```
New -> Runnable -> Running -> Terminated
             ↓         ↑
       Blocked/Waiting/Timed Waiting
```

### 🧪 Example with Sleep (Timed Waiting)

```java
class LifecycleExample implements Runnable {
    public void run() {
        System.out.println("Thread state: Running");
        try {
            Thread.sleep(1000); // Timed waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state: Terminated");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new LifecycleExample());
        System.out.println("Thread state: New");
        t.start();
        System.out.println("Thread state: Runnable");
    }
}
```

---

## 💡 Real-World Scenario

**Scenario**: A web server handles multiple requests simultaneously. Each request can be handled by a separate thread to
ensure concurrency and improve performance.

**Example**: Thread per client connection or thread pool handling tasks.

---

## 🎯 Interview Questions & Answers

### ❓ Q1: What is the difference between extending Thread and implementing Runnable?

**✅ A1**: Runnable is preferred because Java supports single inheritance. Using Runnable promotes code reuse and
decouples task logic from thread management.

### ❓ Q2: What happens if you call run() instead of start()?

**✅ A2**: Calling `run()` directly doesn't start a new thread. It executes the method in the current thread.

### ❓ Q3: What are the states of a thread?

**✅ A3**: New, Runnable, Running, Blocked, Waiting, Timed Waiting, Terminated.

### ❓ Q4: How to create a thread-safe class?

**✅ A4**: By synchronizing access to shared resources or using concurrent utilities like `ReentrantLock`,
`AtomicInteger`, etc.

---

## ✅ Summary

* Use `Runnable` for better design flexibility.
* Understand the thread lifecycle for effective debugging and resource management.
* Use thread-safe practices when accessing shared resources.

Would you like the code examples in a separate `.java` class file as well?
