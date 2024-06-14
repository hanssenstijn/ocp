package org.example.ch7;

public class Snake implements IsColdBlooded {
    // required override
    @Override
    public boolean hasScales() {
        return false;
    }

    // optional override since it is a default method
    @Override
    public double getTemperature() {
        return 13;
    }
}
