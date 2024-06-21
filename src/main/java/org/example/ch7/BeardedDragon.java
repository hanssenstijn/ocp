package org.example.ch7;

public record BeardedDragon(boolean fun) {
    @Override public boolean fun() {return false;}
}
