package org.example.ch13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock(); //  is reentrant, meaning that the thread holding the lock
    // can acquire it again without causing a deadlock. Each time the thread acquires the lock,
    // it must release it the same number of times.

    public void performTask() {
        lock.lock();  //  Acquires the lock, blocking if necessary until it is available.
        try {
            System.out.println(Thread.currentThread().getName() + " is working");
        } finally {
            lock.unlock();  // Always release the lock in a finally block
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();

        Runnable task = example::performTask;

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

