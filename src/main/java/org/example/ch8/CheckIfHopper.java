package org.example.ch8;

public class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
