package org.example.ch9;

public class LegacyDuck implements Comparable{
    private String name;

    @Override
    public int compareTo(Object o) {
        LegacyDuck d = (LegacyDuck) o;
        return name.compareTo(((LegacyDuck) o).name);
    }
}
