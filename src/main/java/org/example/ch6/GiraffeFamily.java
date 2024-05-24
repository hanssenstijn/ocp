package org.example.ch6;

public class GiraffeFamily {
    static {
        System.out.println("A");
    }
    {
        System.out.println("B");
    }

    public GiraffeFamily(String name) {
        this(1);
        System.out.println("C");
    }

    public GiraffeFamily() {
        System.out.println("D");
    }

    public GiraffeFamily(int stripes) {
        System.out.println("E");
    }
}

class Okapi extends GiraffeFamily {
    static {
        System.out.println("F");
    }

    public Okapi(int stripes) {
        super("sugar");
        System.out.println("G");
    }

    {
        System.out.println("H");
    }

    public static void main(String[] args) {
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }
}
