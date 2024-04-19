package org.example.ch5;

public class Trip {
    public static void main(String[] args) {


    }
    public void visitZoo(String name, int waitTime) {}
    // does not compile since signature is the same, even-though the names are different
    // public void visitZoo(String name2, int waitTime2) {}
    // change order does compile
    public void visitZoo(int name2, String waitTime2) {}

    public void oneException() throws IllegalArgumentException {}
    public void twoException() throws IllegalArgumentException, InterruptedException {}
}
