package org.example.ch7;

import org.example.ch5.Penguin;

public class EmperorrPenguin extends Peguin {
    public int getHeight() {
        return 8;
    }

    public static void main(String[] args) {
        // prints 8, since method overridden
        new EmperorrPenguin().printInfo();
    }
}
