package _1_3_collections_framework._1_3_5_iterators;

import java.util.*;

public class IteratorsExamples {
    public static void main(String[] args) {
        iteratorExample();
        listIteratorExample();
        forEachExample();
    }

    // Example 1: Using Iterator
    private static void iteratorExample() {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Iterator<String> iterator = names.iterator();

        System.out.println("Iterator Example:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    // Example 2: Using ListIterator for Bidirectional Traversal
    private static void listIteratorExample() {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        ListIterator<String> listIterator = names.listIterator();

        System.out.println("ListIterator - Forward Traversal:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("ListIterator - Backward Traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println();
    }

    // Example 3: Using For-Each Loop
    private static void forEachExample() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        System.out.println("For-Each Loop Example:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}
