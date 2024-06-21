package org.example.ch7;

public class StaticOuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class.");
        }
    }

    public static void main(String[] args) {
        // it can be instantiated without an instance of the outer class
        StaticOuterClass.StaticNestedClass nested = new StaticOuterClass.StaticNestedClass();
        nested.display();
    }
}
