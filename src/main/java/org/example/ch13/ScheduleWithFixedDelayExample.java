package org.example.ch13;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleWithFixedDelayExample {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Runnable task = () -> {
            System.out.println("Task executed at: " + System.currentTimeMillis());
            try {
                // Simulate task execution time
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Schedule the task to run repeatedly with a fixed delay of 3 seconds between completions
        executor.scheduleWithFixedDelay(task, 1, 3, TimeUnit.SECONDS);

        // Schedule the executor to shutdown after 10 seconds
        executor.schedule(() -> {
            System.out.println("Shutting down executor");
            executor.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}

