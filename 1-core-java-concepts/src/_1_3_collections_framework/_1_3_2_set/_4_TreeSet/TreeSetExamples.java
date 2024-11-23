package _1_3_collections_framework._1_3_2_set._4_TreeSet;

import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Comparator;

public class TreeSetExamples {

    public static void main(String[] args) {
        basicTreeSetOperations();
        iterateOverTreeSet();
        customComparatorExample();
    }

    // Example 1: Basic TreeSet Operations
    private static void basicTreeSetOperations() {
        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);

        System.out.println("Basic TreeSet Operations:");
        System.out.println("TreeSet in Natural Order: " + treeSet);

        // Checking for the presence of an element
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

        System.out.println();
    }

    // Example 2: Iterating Over TreeSet
    private static void iterateOverTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(8);

        System.out.println("Iterating Over TreeSet in Natural Order:");

        // Using enhanced for-loop
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        System.out.println("Iterating Over TreeSet in Descending Order:");

        // Using descending iterator
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        System.out.println();
    }

    // Example 3: Custom Comparator Example
    private static void customComparatorExample() {
        // TreeSet with custom comparator (reverse order)
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        System.out.println("TreeSet with Custom Comparator (Reverse Order):");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        System.out.println();
    }
}


