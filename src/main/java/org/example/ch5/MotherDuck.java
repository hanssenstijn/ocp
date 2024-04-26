package org.example.ch5;

public class MotherDuck {
    String noise = "quack";
    void quack() {
        System.out.println(noise);
    }
}

class GoodDuckling {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
