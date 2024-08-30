package org.example.ch13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {
    private int sheepCount = 0;
    private void incrermentAndReport() {
        System.out.println((++sheepCount) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManager manager = new SheepManager();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrermentAndReport());
        } finally {
            service.shutdown();
        }
    }
}

