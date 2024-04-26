package org.example.ch5;

public class FatherDuck {
    private String nosie = "quack";
    private void quack() {
        System.out.println(nosie);
    }
}

 class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
        // does not compile since package private
        // duck.quack();
        // System.out.println(duck.noise);
    }
}
