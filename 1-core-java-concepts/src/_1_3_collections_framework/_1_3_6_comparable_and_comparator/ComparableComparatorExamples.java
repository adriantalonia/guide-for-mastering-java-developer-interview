package _1_3_collections_framework._1_3_6_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorExamples {

    public static void main(String[] args) {
        // Example 1: Natural Ordering with Comparable
        System.out.println("Natural Ordering with Comparable:");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 92));

        Collections.sort(students); // Sorts using compareTo()
        for (Student student : students) {
            System.out.println(student);
        }

        // Example 2: Custom Ordering with Comparator
        System.out.println("\nCustom Ordering with Comparator:");
        Comparator<Student> byScoreDescending = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s2.getScore(), s1.getScore()); // Descending order
            }
        };

        // Lambda example
        /*Comparator<Student> byScoreDescending = (s1, s2) -> {
            return Integer.compare(s2.getScore(), s1.getScore()); // Descending order
        };*/

        students.sort(byScoreDescending); // Sorts using Comparator
        for (Student student : students) {
            System.out.println(student);
        }

        // Example 3: Using Comparator with Lambda Expression
        System.out.println("\nUsing Comparator with Lambda Expression:");
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName())); // Sort by name in ascending order
        //students.sort(Comparator.comparing(Student::getName));
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Student class implementing Comparable for natural ordering
    static class Student implements Comparable<Student> {
        private final String name;
        private final int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public int compareTo(Student other) {
            // Natural ordering by score (ascending)
            return Integer.compare(this.score, other.score);
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', score=" + score + "}";
        }
    }

    // or using Record:
    /*record Student(String name, int score) implements Comparable<Student> {

        @Override
        public int compareTo(Student other) {
            // Natural ordering by score (ascending)
            return Integer.compare(this.score, other.score);
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', score=" + score + "}";
        }
    }*/
}
