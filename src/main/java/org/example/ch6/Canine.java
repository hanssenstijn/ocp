package org.example.ch6;

public abstract class Canine {
    // abstract method is always declared without a body. it also includes a semicolon
    public abstract String getSound();
    // you may include a non abstract methods
    public void bark() {
        System.out.println(getSound());
    }
}
