package org.example.ch6;

public class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
    public Hamster(int weight) {
        // calls the other constructor
        this(weight,"brown");
    }


    public static void main(String[] args) {

    }
}
