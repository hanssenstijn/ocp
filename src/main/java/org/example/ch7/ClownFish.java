package org.example.ch7;

public class ClownFish implements Aquatic {
    String getNumOfGills() { return "14"; }
    // since methods in interface are public, make sure to put it here too
    public int getNumOfGills(int p) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumOfGills(-1));
    }
}
