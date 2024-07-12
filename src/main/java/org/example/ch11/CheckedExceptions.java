package org.example.ch11;

import java.io.IOException;

public class CheckedExceptions {

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
