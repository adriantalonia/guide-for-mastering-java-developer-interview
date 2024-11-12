package _1_3_collections_framework._1_3_2_set._1_HasSet;

import java.util.*;

public class HashSetExamples {

    public static void main(String[] args) {
        basicHashSetOperations();
        hashSetWithNullValues();
        hashSetWithCustomObjects();
        iteratingOverHashSet();
        unionOfSets();
        intersectionOfSets();
        differenceOfSets();
        subSet();
    }

    // Example 1: Basic HashSet Operations
    private static void basicHashSetOperations() {
        Set<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate, will not be added

        System.out.println("Basic HashSet Operations:");
        System.out.println("HashSet: " + hashSet);

        // Checking for an element
        boolean hasApple = hashSet.contains("Apple");
        System.out.println("Contains 'Apple': " + hasApple);

        // Removing an element
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);
        System.out.println();
    }

    // Example 2: HashSet with Null Values
    private static void hashSetWithNullValues() {
        Set<String> hashSet = new HashSet<>();

        // Adding null value
        hashSet.add(null);
        hashSet.add("Apple");

        System.out.println("HashSet with Null Values:");
        System.out.println("HashSet: " + hashSet);
        System.out.println();
    }

    // Example 3: HashSet with Custom Objects
    private static void hashSetWithCustomObjects() {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 30)); // Duplicate based on equals and hashCode

        System.out.println("HashSet with Custom Objects:");
        System.out.println("People Set: " + people);
        System.out.println();
    }

    // Example 4: Iterating Over HashSet
    private static void iteratingOverHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        System.out.println("Iterating Over HashSet:");

        // Using enhanced for-loop
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Using Iterator
        Iterator<String> iterator = hashSet.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using forEach with lambda
        System.out.println("Using forEach with Lambda:");
        hashSet.forEach(System.out::println);

        System.out.println();
    }

    // example 5: To perform the union between two sets, we can use the addAll()
    private static void unionOfSets() {
        System.out.println("Union Of Sets");
        Set<Integer> hashSet1 = new HashSet<Integer>();
        // Adding all elements to List
        hashSet1.addAll(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}));
        System.out.println("HashSet1: " + hashSet1);

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> hashSet2 = new HashSet<Integer>();
        hashSet2.addAll(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));
        System.out.println("HashSet2: " + hashSet2);


        // To find union
        Set<Integer> union = new HashSet<Integer>(hashSet1);
        union.addAll(hashSet2);
        System.out.print("Union of the two Set: ");
        System.out.println(union);

        System.out.println();
    }

    // example 6: Intersection of Sets, to perform the intersection between two sets, we can use the retainAll()
    private static void intersectionOfSets() {
        System.out.println("Intersection of Sets");
        Set<Integer> hashSet1 = new HashSet<Integer>();
        // Adding all elements to List
        hashSet1.addAll(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}));
        System.out.println("HashSet1: " + hashSet1);

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> hashSet2 = new HashSet<Integer>();
        hashSet2.addAll(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));
        System.out.println("HashSet2: " + hashSet2);


        // To find union
        Set<Integer> intersection = new HashSet<Integer>(hashSet1);
        intersection.retainAll(hashSet2);
        System.out.print("Intersection of the two Set: ");
        System.out.println(intersection);

        System.out.println();
    }

    // example 7: To calculate the difference between the two sets, we can use the removeAll()
    private static void differenceOfSets() {
        System.out.println("Difference of Sets");
        Set<Integer> hashSet1 = new HashSet<Integer>();
        // Adding all elements to List
        hashSet1.addAll(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}));
        System.out.println("HashSet1: " + hashSet1);

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> hashSet2 = new HashSet<Integer>();
        hashSet2.addAll(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));
        System.out.println("HashSet2: " + hashSet2);


        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(hashSet1);
        difference.removeAll(hashSet2);
        System.out.print("Difference of the two Set: ");
        System.out.println(difference);

        System.out.println();
    }

    // example 8: Subset, To check if a set is a subset of another set or not, we can use the containsAll() method
    private static void subSet() {
        System.out.println("Subset");
        Set<Integer> hashSet1 = new HashSet<Integer>();
        // Adding all elements to List
        hashSet1.addAll(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}));
        System.out.println("HashSet1: " + hashSet1);

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> hashSet2 = new HashSet<Integer>();
        hashSet2.addAll(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));
        System.out.println("HashSet2: " + hashSet2);


        // Check if primeNumbers is a subset of numbers
        boolean result = hashSet1.containsAll(hashSet2);
        System.out.println("Is HashSet2 is subset of HashSet1? " + result);

        System.out.println();
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}
