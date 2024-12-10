package _1_3_collections_framework._1_3_3_map._4_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;

public class LinkedHashMapExamples {

    public static void main(String[] args) {
        createAndPopulateLinkedHashMap();
        basicLinkedHashMapOperations();
        iterateOverLinkedHashMap();
        demonstrateAccessOrder();
        synchronizeLinkedHashMap();
    }

    // Example 1: Creating and Populating a LinkedHashMap
    private static void createAndPopulateLinkedHashMap() {
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();

        // Adding key-value pairs
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("Creating and Populating a LinkedHashMap:");
        System.out.println("Initial Map: " + ageMap);
        System.out.println();
    }

    // Example 2: Basic LinkedHashMap Operations
    private static void basicLinkedHashMapOperations() {
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);

        // Accessing a value by key
        Integer ageOfAlice = ageMap.get("Alice");
        System.out.println("Basic LinkedHashMap Operations:");
        System.out.println("Alice's age: " + ageOfAlice);

        // Checking for a key or value
        boolean hasBob = ageMap.containsKey("Bob");
        boolean hasAge40 = ageMap.containsValue(40);
        System.out.println("Contains key 'Bob': " + hasBob);
        System.out.println("Contains value 40: " + hasAge40);

        // Removing a key-value pair
        ageMap.remove("Bob");
        System.out.println("After removing Bob: " + ageMap);
        System.out.println();
    }

    // Example 3: Iterating Over a LinkedHashMap
    private static void iterateOverLinkedHashMap() {
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("Iterating Over a LinkedHashMap:");

        // Iterating over keys
        System.out.println("Keys:");
        for (String key : ageMap.keySet()) {
            System.out.println(key);
        }

        // Iterating over values
        System.out.println("Values:");
        for (Integer value : ageMap.values()) {
            System.out.println(value);
        }

        // Iterating over key-value pairs (entries)
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println();
    }

    // Example 4: Demonstrating Access Order
    private static void demonstrateAccessOrder() {
        // LinkedHashMap with accessOrder set to true
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>(16, 0.75f, true);
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Access some elements to change their order
        ageMap.get("Alice");
        ageMap.get("Charlie");

        System.out.println("LinkedHashMap with Access Order:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println();
    }

    // Example 5: Synchronizing LinkedHashMap
    private static void synchronizeLinkedHashMap() {
        LinkedHashMap<String, Integer> ageMap = new LinkedHashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Synchronizing the LinkedHashMap
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(ageMap);

        System.out.println("Synchronized LinkedHashMap:");
        synchronized (synchronizedMap) {
            for (Map.Entry<String, Integer> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }

        System.out.println();
    }
}
