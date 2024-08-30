package org.example.ch13;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduledExecutorExample {
    public static void main(String[] args) {
        // Create a ScheduledExecutorService with a single thread
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Runnable task = () -> System.out.println("Task executed at: " + System.currentTimeMillis());

        // Schedule the task to run every 2 seconds with an initial delay of 1 second
        executor.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);

        // Schedule the executor to shutdown after 10 seconds
        executor.schedule(() -> {
            System.out.println("Shutting down executor");
            executor.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}

