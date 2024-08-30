package org.example.ch13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    private final Lock lock = new ReentrantLock();

    public void performTask() {
        if (lock.tryLock()) {  // Try to acquire the lock, that attempts to acquire the lock without waiting indefinitely.
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock and is working");
            } finally {
                lock.unlock();  // Always release the lock in a finally block
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " could not acquire the lock");
        }
    }

    public static void main(String[] args) {
        TryLockExample example = new TryLockExample();

        Runnable task = example::performTask;

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

