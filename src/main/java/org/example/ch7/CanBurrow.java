package org.example.ch7;

public interface CanBurrow {
    Float getSpeed(int age);

    // all these modifiers are redundant, compiler will always insert!
    public abstract Float getSpeed2(int age);

    // all these modifiers are redundant, compiler will always insert!
    public static final int MINIMUM_DEPTH = 2;
    int MINIMUM_DEPTH2 = 2;
}
