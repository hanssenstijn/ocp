package org.example.ch7;

public interface Hop {
    // without access modifier it will implicitly be public
    static int getJumpHeight() {
        return 8;
    }

}
