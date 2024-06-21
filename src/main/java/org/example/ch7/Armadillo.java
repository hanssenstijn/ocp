package org.example.ch7;

// sinze extend sealed class it must be final, non-sealed or sealed!!
public final class Armadillo extends ArmoredAnimal{
    @Override public String toString() {return "Cute"; }
    public Armadillo(int size, String name) {
        super(size);
    }
}
