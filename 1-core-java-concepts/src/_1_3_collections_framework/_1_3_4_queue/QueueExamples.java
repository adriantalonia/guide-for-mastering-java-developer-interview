package _1_3_collections_framework._1_3_4_queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {
        createAndPopulateQueue();
        basicQueueOperations();
        iterateOverQueue();
        demonstratePriorityQueue();
    }

    // Example 1: Creating and Populating a Queue
    private static void createAndPopulateQueue() {
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Creating and Populating a Queue:");
        System.out.println("Initial Queue: " + queue);
        System.out.println();
    }

    // Example 2: Basic Queue Operations
    private static void basicQueueOperations() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");

        System.out.println("Basic Queue Operations:");
        System.out.println("Front element: " + queue.peek());

        // Removing elements
        queue.poll();
        System.out.println("Queue after polling: " + queue);
        System.out.println();
    }

    // Example 3: Iterating Over a Queue
    private static void iterateOverQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Iterating Over a Queue:");
        for (String name : queue) {
            System.out.println(name);
        }
        System.out.println();
    }

    // Example 4: Demonstrating PriorityQueue
    private static void demonstratePriorityQueue() {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("PriorityQueue Demonstration:");
        while (!pq.isEmpty()) {
            System.out.println("Polled: " + pq.poll());
        }
        System.out.println();
    }
}
