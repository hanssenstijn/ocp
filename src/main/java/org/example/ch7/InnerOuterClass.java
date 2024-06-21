package org.example.ch7;

public class InnerOuterClass {
    private String message = "Hello from outer class";

    class InnerClass {
        // it has access to the members (including private members) of the outer class
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        InnerOuterClass outer = new InnerOuterClass();
        InnerOuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
