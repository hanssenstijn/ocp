package org.example.ch11;

import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) throws Exception {
        throw new Exception("bla bla");
        // does not compile since code is unreachable, program stops after previous throw
        // throw new Exception("bla bla");
    }
    void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    void fall2(int distance) {
        try {
            if(distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
