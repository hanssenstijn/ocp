package org.example.ch7;

public class LocalOuterClass {
    void outerMethod() {
        class LocalClass {
            void display() {
                System.out.println("Inside local class.");
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }

    public static void main(String[] args) {
        LocalOuterClass outer = new LocalOuterClass();
        outer.outerMethod();
    }
}
