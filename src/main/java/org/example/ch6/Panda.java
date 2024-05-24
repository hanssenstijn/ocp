package org.example.ch6;

public class Panda extends Bear{
    // for static method it's called hidden (not overriding)
    public static void eat() {
        System.out.println("Panda is chewing");
    }

    public static void main(String[] args) {
        eat();
    }
}
