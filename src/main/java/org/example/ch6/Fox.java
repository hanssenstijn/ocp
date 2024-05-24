package org.example.ch6;

public class Fox extends Canine{
    @Override
    public String getSound() {
        return "Squeak!";
    }

    public static void main(String[] args) {
        // an abstract class can be initialized but only as part of the instantiation of a non-abstract subclass
        Canine n = new Fox();
        n.bark();
    }
}
