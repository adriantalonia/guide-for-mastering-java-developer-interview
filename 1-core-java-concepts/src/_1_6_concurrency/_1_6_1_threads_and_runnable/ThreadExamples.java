package _1_6_concurrency._1_6_1_threads_and_runnable;

public class ThreadExamples {

    // Example 1: Creating a thread by extending Thread class
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread is running: " + Thread.currentThread().getName());
        }
    }

    // Example 2: Creating a thread by implementing Runnable
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnable is running: " + Thread.currentThread().getName());
        }
    }

    // Example 3: Using lambda for Runnable
    public static void lambdaRunnable() {
        Runnable task = () -> {
            System.out.println("Lambda Runnable is running: " + Thread.currentThread().getName());
        };
        new Thread(task).start();
    }

    // Example 4: Demonstrating Thread Lifecycle
    public static void threadLifecycleDemo() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // TIMED_WAITING
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            System.out.println("Thread finishing: " + Thread.currentThread().getName());
        });

        System.out.println("Thread state before start: " + thread.getState()); // NEW
        thread.start();
        Thread.sleep(100); // Wait a bit for the thread to run
        System.out.println("Thread state during execution: " + thread.getState()); // RUNNABLE or TIMED_WAITING
        thread.join(); // Wait for thread to finish
        System.out.println("Thread state after termination: " + thread.getState()); // TERMINATED
    }

    // Main method to run all examples
    public static void main(String[] args) throws InterruptedException {
        System.out.println("== Example 1: Extending Thread ==");
        Thread myThread = new MyThread();
        myThread.start();

        System.out.println("== Example 2: Implementing Runnable ==");
        Thread runnableThread = new Thread(new MyRunnable());
        runnableThread.start();

        System.out.println("== Example 3: Lambda Runnable ==");
        lambdaRunnable();

        System.out.println("== Example 4: Thread Lifecycle ==");
        threadLifecycleDemo();
    }
}
