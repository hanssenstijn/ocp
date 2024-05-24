package org.example.ch6;

public class Chimpanzee extends Ape{
    public Chimpanzee() {
        // whtouth super(2) it would print out Ape2, since super() will automatically be called
        super(2);
        System.out.println("Chimpanzee-");
    }

    public static void main(String[] args) {
        new Chimpanzee();
    }
}
