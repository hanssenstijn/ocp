package org.example.ch7;

public class CrestedPenguin extends Penguino{
    public static int getHeight() {return 8;}

    public static void main(String[] args) {
        // returns 3, since its static it used the location
        // without static keyword it would have been 8
        new CrestedPenguin().printInfo();
    }
}
