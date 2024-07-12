package org.example.ch11;

import java.io.IOException;

public class CheckedExceptions {

    public static void main(String[] args) throws Exception {
        new CheckedExceptions().fall2(11);
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
            if (distance > 10) {
                throw new IOException();
            }
        } catch (IOException | NumberFormatException e) {
            e.getMessage();
        } catch
        (Exception e) {
            System.out.println(e + "\n");
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }

    public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException("# eggs must not be negative");
    }
}
