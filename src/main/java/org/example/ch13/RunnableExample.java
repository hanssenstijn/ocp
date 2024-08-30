package org.example.ch13;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Task executed by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunnableExample task = new RunnableExample();
        Thread thread = new Thread(task);
        thread.start();  // Starts the thread and invokes the run() method
    }
}
