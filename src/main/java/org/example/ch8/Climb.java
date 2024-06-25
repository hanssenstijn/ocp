package org.example.ch8;

// it is since it only contains one abstract method
@FunctionalInterface
public interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() {return 100;}
    private static boolean checkHeight() { return true; }
}
