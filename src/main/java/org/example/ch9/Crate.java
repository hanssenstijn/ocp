package org.example.ch9;

public class Crate<T> {
    private T contents;

    public T LookInCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }
}
