package org.example.ch9;

import java.util.Comparator;

public class Squirrel {
    private int weight;
    private String species;

    public Squirrel(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    public static void main(String[] args) {
        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies).thenComparing(Squirrel::getWeight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
