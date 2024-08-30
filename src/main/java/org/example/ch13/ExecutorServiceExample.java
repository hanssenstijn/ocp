package org.example.ch13;

import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Define some tasks to be executed
        Runnable task1 = () -> {
            try {
                System.out.println("Executing Task 1");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable task2 = () -> {
            System.out.println("Executing Task 2");
        };

        Callable<String> task3 = () -> {
            System.out.println("Executing Task 3");
            return "Result of Task 3";
        };

        // Submit tasks to the executor
        executorService.execute(task1);             // Executing Runnable
        executorService.submit(task2);              // Executing Runnable
        Future<String> future = executorService.submit(task3); // Executing Callable

        // Retrieve the result from the Callable task
        try {
            String result = future.get();
            System.out.println("Result from Task 3: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(5, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("Executor Service Shutdown");
    }
}

