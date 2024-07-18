package org.example.ch11;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StuckTurkeyCage implements AutoCloseable {
    @Override
    public void close() throws IOException {
        throw new FileNotFoundException("Cage not closed");
    }

    public static void main(String[] args) throws IOException {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
}
