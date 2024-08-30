package org.example.ch13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManagerAtomic {
    private AtomicInteger sheepCount = new AtomicInteger(0);
    private void incrermentAndReport() {
        System.out.println((sheepCount.incrementAndGet()) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManagerAtomic manager = new SheepManagerAtomic();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrermentAndReport());
        } finally {
            service.shutdown();
        }
    }
}

