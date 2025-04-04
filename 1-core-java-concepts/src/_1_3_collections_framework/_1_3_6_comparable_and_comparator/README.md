# 1.3.6 Comparable and Comparator

Java provides `Comparable` and `Comparator` interfaces to define sorting logic for objects. `Comparable` is used for natural ordering, while `Comparator` allows custom sorting.

<!-- TOC -->
* [1.3.6 Comparable and Comparator](#136-comparable-and-comparator)
  * [**1. Natural Ordering with Comparable**](#1-natural-ordering-with-comparable)
    * [**Key Characteristics:**](#key-characteristics)
    * [**Syntax:**](#syntax)
    * [**Example Usage:**](#example-usage)
  * [**2. Custom Ordering with Comparator**](#2-custom-ordering-with-comparator)
    * [**Key Characteristics:**](#key-characteristics-1)
    * [**Syntax:**](#syntax-1)
    * [**Example Usage:**](#example-usage-1)
  * [**Interview Questions**](#interview-questions)
    * [**1. What is the difference between Comparable and Comparator?**](#1-what-is-the-difference-between-comparable-and-comparator)
    * [**2. When should you use Comparator instead of Comparable?**](#2-when-should-you-use-comparator-instead-of-comparable)
    * [**3. What happens if compareTo() returns inconsistent results?**](#3-what-happens-if-compareto-returns-inconsistent-results)
<!-- TOC -->

## **1. Natural Ordering with Comparable**

The `Comparable` interface is used to define the natural order of objects by implementing the `compareTo()` method.

### **Key Characteristics:**
- Defines a single sorting sequence (natural order).
- Must implement the `compareTo()` method.
- Typically used when sorting elements in ascending order.

### **Syntax:**
```java
class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age); // Sorting by age
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}
```

### **Example Usage:**
```java
List<Employee> employees = new ArrayList<>();
employees.add(new Employee("Alice", 30));
employees.add(new Employee("Bob", 25));
employees.add(new Employee("Charlie", 35));

Collections.sort(employees);
System.out.println(employees); // Sorted by age
```

## **2. Custom Ordering with Comparator**

The `Comparator` interface is used when multiple sorting sequences are needed.

### **Key Characteristics:**
- Can define multiple sorting logics.
- Implements the `compare()` method.
- Allows sorting without modifying the entity class.

### **Syntax:**
```java
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name); // Sorting by name
    }
}
```

### **Example Usage:**
```java
Collections.sort(employees, new NameComparator());
System.out.println(employees); // Sorted by name
```

## **Interview Questions**

### **1. What is the difference between Comparable and Comparator?**
| Feature      | Comparable | Comparator |
|-------------|-----------|------------|
| Method      | `compareTo()` | `compare()` |
| Sorting logic | Defined in the entity class | Defined separately |
| Flexibility | Single sorting order | Multiple sorting orders |
| Package | `java.lang` | `java.util` |

### **2. When should you use Comparator instead of Comparable?**
- When you need multiple sorting criteria.
- When you cannot modify the original class (e.g., third-party classes).

### **3. What happens if compareTo() returns inconsistent results?**
- The sorting behavior becomes unpredictable.
- It may lead to `ClassCastException` in sorted collections.

Let me know if you need additional details! 🚀

