package _1_3_collections_framework._1_3_1_list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList after adding elements: " + arrayList);

        // Accessing elements
        int firstElement = arrayList.get(0);
        System.out.println("First element: " + firstElement);

        // Modifying elements
        arrayList.set(1, 25);
        System.out.println("ArrayList after modifying second element: " + arrayList);

        // Removing elements
        arrayList.remove(0); // Remove element at index 0
        System.out.println("ArrayList after removing first element: " + arrayList);

        // Traversing the ArrayList
        System.out.println("Traversing the ArrayList:");
        for (Integer element : arrayList) {
            System.out.println(element);
        }

        // Checking if the ArrayList contains an element
        boolean contains30 = arrayList.contains(30);
        System.out.println("ArrayList contains 30: " + contains30);

        // Using ArrayList-specific methods
        arrayList.ensureCapacity(50); // Ensure capacity
        System.out.println("ArrayList capacity ensured to 50.");
    }
}
