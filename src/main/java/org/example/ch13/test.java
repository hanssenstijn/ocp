package org.example.ch13;

public class test {
    public static void main(String[] args) {
        // depending on the threadd priority either can be printed out first
        new Thread(() -> System.out.println("Hello")).start();
        System.out.println("World");

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        // same print out order is not known
        System.out.println("being");
        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();
        System.out.println("end");
    }
}
