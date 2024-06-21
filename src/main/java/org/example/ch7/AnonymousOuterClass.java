package org.example.ch7;

public class AnonymousOuterClass {
    void outerMethod() {
        // Anonymous class implementing an interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside anonymous class.");
            }
        };

        runnable.run();
    }

    public static void main(String[] args) {
        AnonymousOuterClass outer = new AnonymousOuterClass();
        outer.outerMethod();
    }
}
