package org.example.ch13;

import java.util.Timer;
import java.util.concurrent.*;

public class CreateThread {
    private static int counter = 0;
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello")).start();
        System.out.println("world");

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        // create new thread
        new Thread(printInventory).start();
        // does not create a new threrad
        new Thread(printInventory).run();

        // single thread executor
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.execute(printInventory);
        } finally {
            executorService.shutdown();
        }

        // ScheduledExecutorService
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        ScheduledFuture<?> r1 = scheduledExecutorService.schedule(task1,10,TimeUnit.SECONDS);
        ScheduledFuture<?> r2 = scheduledExecutorService.schedule(task2,8,TimeUnit.MINUTES);
        // submits it to the executor every period, regardless of whether the previous task finished
        ScheduledFuture<?> r3 = scheduledExecutorService.scheduleAtFixedRate(task1,8,10,TimeUnit.MINUTES);
        // only creates a new task after the previous task has finished
        ScheduledFuture<?> r34 = scheduledExecutorService.scheduleWithFixedDelay(task1,8,10,TimeUnit.MINUTES);

        ExecutorService service = Executors.newFixedThreadPool(10);
        ExecutorService service2 = Executors.newScheduledThreadPool(10);

    }
}
