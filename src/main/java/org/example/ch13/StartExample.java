package org.example.ch13;

public class StartExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        StartExample thread = new StartExample();

        // Calling start() to start a new thread
        // Here, start() is called, which creates a new thread and executes the run() method on that new thread.
        thread.start();  // This will start a new thread

        System.out.println("Start method called: " + Thread.currentThread().getName());
    }
}
