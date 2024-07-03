package org.example.ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DuckDuck implements Comparable<DuckDuck> {
    private String name;
    private int weight;

    public DuckDuck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "DuckDuck{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(DuckDuck o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Comparator<DuckDuck> byWeight = (o1, o2) -> o1.getWeight()-o2.getWeight();

        var ducks = new ArrayList<DuckDuck>();
        ducks.add(new DuckDuck("Quack",7));
        ducks.add(new DuckDuck("Puddles",10));
        System.out.println(ducks);
        Collections.sort(ducks,byWeight);
        System.out.println(ducks);
    }
}
