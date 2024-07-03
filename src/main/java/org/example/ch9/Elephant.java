package org.example.ch9;

public class Elephant {

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Integer numPounds = 15_000;

        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.LookInCrate();

        SizeLimtedCrate<Elephant,Integer> c1 = new SizeLimtedCrate<>(elephant,numPounds);

        
    }
}
