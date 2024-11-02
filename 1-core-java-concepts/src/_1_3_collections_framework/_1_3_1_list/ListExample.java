package _1_3_collections_framework._1_3_1_list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a List using ArrayList
        List<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List after adding elements: " + list);

        // Accessing elements
        int firstElement = list.get(0);
        // int firstElement = list.getFirst();
        System.out.println("First element: " + firstElement);

        // Modifying elements
        list.set(1, 25);
        System.out.println("List after modifying second element: " + list);

        // Removing elements
        list.remove(0); // Remove element at index 0
        // list.removeFirst();
        System.out.println("List after removing first element: " + list);

        // Traversing the list
        System.out.println("Traversing the list:");
        for (Integer element : list) {
            System.out.println(element);
        }

        // Checking if the list contains an element
        boolean contains30 = list.contains(30);
        System.out.println("List contains 30: " + contains30);
    }
}
