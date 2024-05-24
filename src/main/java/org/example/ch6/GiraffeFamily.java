package org.example.ch6;

public class GiraffeFamily {
    // first initialize static
    static {
        System.out.println("A");
    }
    // second initialize block of super class
    {
        System.out.println("B");
    }
    // third superclass constructor
    public GiraffeFamily(String name) {
        this(1);
        System.out.println("C");
    }



    public GiraffeFamily() {
        System.out.println("D");
    }

    // third superclass constructor
    public GiraffeFamily(int stripes) {
        System.out.println("E");
    }
}

class Okapi extends GiraffeFamily {
    // first initialize static
    static {
        System.out.println("F");
    }

    public Okapi(int stripes) {
        // third superclass constructor
        super("sugar");
        // fifth last print out
        System.out.println("G");
    }

    // fourth this happens immediately after everything in the super class is finished
    {
        System.out.println("H");
    }

    public static void main(String[] args) {
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }
}
