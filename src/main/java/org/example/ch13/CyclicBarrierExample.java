package org.example.ch13;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int numberOfThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads, () -> {
            System.out.println("All threads have reached the barrier and are released!");
        });

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(new Task(barrier)).start();
        }
    }

    static class Task implements Runnable {
        private CyclicBarrier barrier;

        public Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is working on something...");
                Thread.sleep(1000); // Simulate some work
                System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
                // Once all three threads have called await(), the barrier action
                // ("All threads have reached the barrier and are released!") is executed.
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

