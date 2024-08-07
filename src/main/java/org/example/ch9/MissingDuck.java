package org.example.ch9;

public class MissingDuck implements Comparable<MissingDuck>{
    private String name;

    @Override
    public int compareTo(MissingDuck o) {
        if (o == null)
            throw new IllegalArgumentException("Poorly formed duck!");
        if(this.name == null && o.name == null)
            return 0;
        else if (this.name == null) return -1;
        else if (o.name == null) return 1;
        else return name.compareTo(o.name);
    }
}
