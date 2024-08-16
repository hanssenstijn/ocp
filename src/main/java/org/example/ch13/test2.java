package org.example.ch13;

import java.util.concurrent.*;

public class test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        ExecutorService service = Executors.newSingleThreadExecutor();

        try {
            System.out.println("Begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("End");
        } finally {
            service.shutdown();
        }

        Future<?> future = service.submit(() -> System.out.println("Hello"));
    }
}
