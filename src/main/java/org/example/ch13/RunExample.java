package org.example.ch13;

public class RunExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunExample thread = new RunExample();

        // If you call the run() method directly, it does not create a new thread.
        // Instead, it will execute the code inside the run() method on the current thread,
        // just like a regular method call.
        // The run() method doesn't cause the thread to be scheduled for execution as a separate thread.
        // Here, run() is called directly, so both System.out.println statements execute on the main thread,
        // not on a new thread.
        thread.run();  // This will run in the main thread

        System.out.println("Run method called: " + Thread.currentThread().getName());
    }
}