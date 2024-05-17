package org.example.ch6;

public class Zebra extends Animal{

    public Zebra(int age) {
        // refers to constructor in animal
        super(age);
    }

    public Zebra() {
        // refers to constructor in zebra
        this(4);
    }
}
