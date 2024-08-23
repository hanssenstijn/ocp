package org.example.ch13;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> results = service.submit(() -> {
                for(int i = 0; i<3000;i++)
                    counter++;
            });
            results.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");
        } catch (TimeoutException | InterruptedException | ExecutionException e) {
            System.out.println("Not Reached In Time");
        } finally {
            service.shutdown();
        }
    }
}
