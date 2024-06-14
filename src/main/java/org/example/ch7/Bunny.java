package org.example.ch7;

public class Bunny implements Hop {
    public void printDetails() {
        // although implementing it needs the reference
        System.out.println(Hop.getJumpHeight());
    }
}
