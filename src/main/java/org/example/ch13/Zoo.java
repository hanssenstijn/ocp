package org.example.ch13;

public class Zoo {
    public static void pause() {
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            System.out.println("Thread Finished");
        }
    }

    public static void main(String[] args) {
        var job = new Thread(() -> pause());
        job.setDaemon(true);

        job.start();
        System.out.println("Main method finished!");
    }
}
