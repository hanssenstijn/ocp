package org.example.ch6;

public class Hippo extends Animal {
    // the classes are only loaded once so it will print ABC only once
    public Hippo(int age) {
        super(age);
    }

    public static void main(String[] args) {
        System.out.println("C");
        new Hippo(1);
        new Hippo(2);
    }
    static {
        System.out.println("B");
    }
}
