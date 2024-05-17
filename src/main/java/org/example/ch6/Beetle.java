package org.example.ch6;

public class Beetle extends Insect{
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData() {
        System.out.println("this.label : " + this.label);
        System.out.println("super.label : " + super.label);
        System.out.println("this.age : " + this.age);
        System.out.println("numberOfLegs : " + numberOfLegs);
    }

    public static void main(String[] args) {
        new Beetle().printData();
    }
}
