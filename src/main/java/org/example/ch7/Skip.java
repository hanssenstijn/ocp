package org.example.ch7;

public class Skip {
    public int skip() {
        // static method can be accessed without an instance of a class
        return Hop.getJumpHeight();
    }
}
