package _1_3_collections_framework._1_3_3_map._3_TreeMap;

import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;

public class TreeMapExamples {

    public static void main(String[] args) {
        createAndPopulateTreeMap();
        basicTreeMapOperations();
        iterateOverTreeMap();
        useNavigableMapFeatures();
        customComparatorExample();
    }

    // Example 1: Creating and Populating a TreeMap
    private static void createAndPopulateTreeMap() {
        TreeMap<String, Integer> ageMap = new TreeMap<>();

        // Adding key-value pairs
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("Creating and Populating a TreeMap:");
        System.out.println("Initial Map: " + ageMap);
        System.out.println();
    }

    // Example 2: Basic TreeMap Operations
    private static void basicTreeMapOperations() {
        TreeMap<String, Integer> ageMap = new TreeMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);

        // Accessing a value by key
        Integer ageOfAlice = ageMap.get("Alice");
        System.out.println("Basic TreeMap Operations:");
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

    // Example 3: Iterating Over a TreeMap
    private static void iterateOverTreeMap() {
        TreeMap<String, Integer> ageMap = new TreeMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("Iterating Over a TreeMap:");

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

    // Example 4: Using NavigableMap Features
    private static void useNavigableMapFeatures() {
        TreeMap<String, Integer> ageMap = new TreeMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("Using NavigableMap Features:");

        // Accessing first and last keys
        String firstKey = ageMap.firstKey();
        String lastKey = ageMap.lastKey();
        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);

        // Getting lower, floor, ceiling, and higher keys
        System.out.println("Lower key than 'Charlie': " + ageMap.lowerKey("Charlie"));
        System.out.println("Floor key for 'Charlie': " + ageMap.floorKey("Charlie"));
        System.out.println("Ceiling key for 'Charlie': " + ageMap.ceilingKey("Charlie"));
        System.out.println("Higher key than 'Charlie': " + ageMap.higherKey("Charlie"));

        System.out.println();
    }

    // Example 5: Custom Comparator Example
    private static void customComparatorExample() {
        // TreeMap with custom comparator (reverse order)
        TreeMap<String, Integer> ageMap = new TreeMap<>(Comparator.reverseOrder());
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        System.out.println("TreeMap with Custom Comparator (Reverse Order):");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println();
    }
}
