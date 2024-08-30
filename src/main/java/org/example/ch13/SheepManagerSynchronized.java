package org.example.ch13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SheepManagerSynchronized {
    private int sheepCount = 0;

    private void incrermentAndReport() {
        synchronized (this) {
            System.out.println((++sheepCount) + " ");
        }
    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManagerSynchronized manager = new SheepManagerSynchronized();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrermentAndReport());
        } finally {
            service.shutdown();
        }

        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();
        if(lock.tryLock()) {
            try {
                System.out.println("Entering protected code");
            } finally {
                lock.unlock();
            }
        }
    }
}

