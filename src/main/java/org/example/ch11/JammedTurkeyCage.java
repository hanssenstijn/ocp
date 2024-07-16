package org.example.ch11;

public class JammedTurkeyCage implements AutoCloseable {
    @Override
    public void close() throws IllegalArgumentException {
        throw new IllegalArgumentException("Cage does not close");
    }

    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            System.out.println("Put turkeys in");
        } catch (IllegalArgumentException e ) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
