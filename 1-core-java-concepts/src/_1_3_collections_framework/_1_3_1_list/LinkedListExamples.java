package _1_3_collections_framework._1_3_1_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListExamples {
    public static void main(String[] args) {
        // Example 1: Basic LinkedList Operations
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial LinkedList: " + list);

        // Adding elements at specific positions
        list.addFirst("Mango");
        list.addLast("Orange");
        System.out.println("After adding first and last: " + list);

        // Removing elements
        list.remove("Banana");
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list);

        // Accessing elements
        String firstElement = list.getFirst();
        String lastElement = list.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Example 2: Iterating over LinkedList
        System.out.println("Iterating using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Example 3: Using ListIterator
        System.out.println("Iterating using ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Example 4: Queue operations with LinkedList
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");

        System.out.println("Queue: " + queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue after poll and peek: " + queue);

        // Example 5: Stack operations with LinkedList
        LinkedList<String> stack = new LinkedList<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
