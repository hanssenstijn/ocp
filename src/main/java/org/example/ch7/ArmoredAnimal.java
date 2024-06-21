package org.example.ch7;

public sealed class ArmoredAnimal permits Armadillo {
    public ArmoredAnimal(int size) {
    }
    @Override public String toString() { return "Strong"; }

    public static void main(String[] args) {
        var c = new Armadillo(10,null);
        System.out.println(c);
    }

    }
