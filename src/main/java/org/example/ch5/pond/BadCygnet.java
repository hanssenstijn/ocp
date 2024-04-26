package org.example.ch5.pond;

import org.example.ch5.MotherDuck;
import org.example.ch5.ProtectedDuck;

public class BadCygnet extends ProtectedDuck {
    public void makeNoise() {
        var duck = new MotherDuck();
        // does not compile since in different package
        // duck.quack();
        // System.out.println(duck.noise);

        // works since extend
        floatInWatter();
        System.out.println(text);

        var protectedDuck = new ProtectedDuck();
        // does not compile since not using the extend but creating different object and then has no access
        // protectedDuck.floatInWater
        // protectedDuck.text;
    }
}
