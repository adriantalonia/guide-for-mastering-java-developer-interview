package _1_3_collections_framework._1_3_2_set._3_EnumSet;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExamples {

    // Define an enum type for demonstration
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        createEnumSetExamples();
        basicEnumSetOperations();
        iterateOverEnumSet();
    }

    // Example 1: Creating EnumSets
    private static void createEnumSetExamples() {
        // Creating an EnumSet with specific values
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        // Create an EnumSet with all values
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);

        // Create an empty EnumSet
        EnumSet<Day> noDays = EnumSet.noneOf(Day.class);

        // Create an EnumSet with a range of values
        EnumSet<Day> workweek = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        // Create an EnumSet with the complement of another EnumSet
        EnumSet<Day> nonWeekend = EnumSet.complementOf(weekend);

        System.out.println("Creating EnumSets:");
        System.out.println("Weekend: " + weekend);
        System.out.println("All Days: " + allDays);
        System.out.println("No Days: " + noDays);
        System.out.println("Workweek: " + workweek);
        System.out.println("Non-weekend: " + nonWeekend);
        System.out.println();
    }

    // Example 2: Basic EnumSet Operations
    private static void basicEnumSetOperations() {
        EnumSet<Day> days = EnumSet.noneOf(Day.class);

        // Adding elements
        days.add(Day.MONDAY);
        days.add(Day.WEDNESDAY);

        System.out.println("Basic EnumSet Operations:");
        System.out.println("Days: " + days);

        // Checking for the presence of an element
        boolean containsTuesday = days.contains(Day.TUESDAY);
        System.out.println("Contains Tuesday: " + containsTuesday);

        // Removing an element
        days.remove(Day.MONDAY);
        System.out.println("After removing Monday: " + days);
        System.out.println();
    }

    // Example 3: Iterating Over EnumSet
    private static void iterateOverEnumSet() {
        EnumSet<Day> days = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        System.out.println("Iterating Over EnumSet:");

        // Using enhanced for-loop
        for (Day day : days) {
            System.out.println(day);
        }

        // Using forEach with lambda
        System.out.println("Using forEach with Lambda:");
        days.forEach(System.out::println);

        System.out.println();
    }
}

