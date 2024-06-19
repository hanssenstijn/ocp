package org.example.ch7;

public record Crane(int numberEggs, String name) {

    public Crane {
        if (numberEggs < 0) throw new IllegalArgumentException();

        name = name.toUpperCase();
    }
}
