package org.example.ch5;

public class Trip {
    public static void main(String[] args) {
    // instance variable
        int hunger = 4;

        // dont need to be assigned value, but before used it has to be
        final int rest;
        rest = 5;

    }
    public void visitZoo(String name, int waitTime) {
        // local variable
        int snack = 10;
        // final only modifier for local variables
        final int snack2 = 10;
    }
    // does not compile since signature is the same, even-though the names are different
    // public void visitZoo(String name2, int waitTime2) {}
    // change order does compile
    public void visitZoo(int name2, String waitTime2) {}

    public void oneException() throws IllegalArgumentException {}
    public void twoException() throws IllegalArgumentException, InterruptedException {}
}
