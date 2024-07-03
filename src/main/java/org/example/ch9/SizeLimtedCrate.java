package org.example.ch9;

public class SizeLimtedCrate<T,U> {
    private T contents;
    private U sizeLimit;

    public SizeLimtedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}
