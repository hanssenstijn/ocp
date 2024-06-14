package org.example.ch7;

public class Owl implements HasBigEyes{
    @Override
    public void flap() {
        System.out.println("Flap!");
    }

    @Override
    public int hunt() {
        return 5;
    }
}
