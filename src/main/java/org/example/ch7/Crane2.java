package org.example.ch7;

public record Crane2(int numberEggs, String name) {
    private static int type = 10;
    // cannot add instance fields outside record declaration
    // public int size;

    // overloading constructor, the first line must be an explicit call to another constructor via this()
    public Crane2(String firstName, String lastName) {
        this(0,firstName + " " + lastName);
    }
}
