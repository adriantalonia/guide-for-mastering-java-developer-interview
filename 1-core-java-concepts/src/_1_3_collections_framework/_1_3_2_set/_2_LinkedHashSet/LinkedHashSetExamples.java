package _1_3_collections_framework._1_3_2_set._2_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetExamples {

    public static void main(String[] args) {
        basicLinkedHashSetOperations();
        linkedHashSetWithNullValues();
        iteratingOverLinkedHashSet();
    }

    // Example 1: Basic LinkedHashSet Operations
    private static void basicLinkedHashSetOperations() {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("One"); // Duplicate, will not be added

        System.out.println("Basic LinkedHashSet Operations:");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Checking for presence of an element
        boolean containsTwo = linkedHashSet.contains("Two");
        System.out.println("Contains 'Two': " + containsTwo);

        // Removing an element
        linkedHashSet.remove("Three");
        System.out.println("After removing 'Three': " + linkedHashSet);
        System.out.println();
    }

    // Example 2: LinkedHashSet with Null Values
    private static void linkedHashSetWithNullValues() {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding null value
        linkedHashSet.add(null);
        linkedHashSet.add("Apple");

        System.out.println("LinkedHashSet with Null Values:");
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println();
    }

    // Example 3: Iterating Over LinkedHashSet
    private static void iteratingOverLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");

        System.out.println("Iterating Over LinkedHashSet:");

        // Using enhanced for-loop
        for (String element : linkedHashSet) {
            System.out.println(element);
        }

        // Using Iterator
        Iterator<String> iterator = linkedHashSet.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using forEach with lambda
        System.out.println("Using forEach with Lambda:");
        linkedHashSet.forEach(System.out::println);

        System.out.println();
    }
}
