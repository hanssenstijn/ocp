package org.example.ch7;

public class Lemur extends Primate implements HasTail {
    @Override
    public boolean isStriped() {
        return true;
    }

    @Override
    public boolean isStriped2() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        // reference Primate has direct access only to methods defined with the Primate class therefore it doesnt have access to the var
        // does not compile
        // primate.age;
        // primate.isStriped();

        Lemur lemur2 = (Lemur) primate;
    }
}
