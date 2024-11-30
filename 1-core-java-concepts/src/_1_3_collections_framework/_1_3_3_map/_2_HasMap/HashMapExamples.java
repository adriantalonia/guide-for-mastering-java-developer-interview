package _1_3_collections_framework._1_3_3_map._2_HasMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {
        createAndPopulateHashMap();
        basicHashMapOperations();
        iterateOverHashMap();
        handleNullValues();
    }

    // Example 1: Creating and Populating a HashMap
    private static void createAndPopulateHashMap() {
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("Creating and Populating a HashMap:");
        System.out.println("Initial Map: " + ageMap);
        System.out.println();
    }

    // Example 2: Basic HashMap Operations
    private static void basicHashMapOperations() {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);

        // Accessing a value by key
        Integer ageOfAlice = ageMap.get("Alice");
        System.out.println("Basic HashMap Operations:");
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

    // Example 3: Iterating Over a HashMap
    private static void iterateOverHashMap() {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("Iterating Over a HashMap:");

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

    // Example 4: Handling Null Values
    private static void handleNullValues() {
        Map<String, Integer> mapWithNulls = new HashMap<>();

        // Adding null key and null value
        mapWithNulls.put(null, 100);
        mapWithNulls.put("NullValue", null);

        System.out.println("Handling Null Values:");
        System.out.println("Map with nulls: " + mapWithNulls);

        // Accessing a null key
        Integer valueForNullKey = mapWithNulls.get(null);
        System.out.println("Value for null key: " + valueForNullKey);

        // Checking for null values
        boolean containsNullValue = mapWithNulls.containsValue(null);
        System.out.println("Contains null value: " + containsNullValue);
        System.out.println();
    }
}
