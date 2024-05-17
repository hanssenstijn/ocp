package org.example.ch6;

public class Crocodile extends Reptile{
    protected int speed = 20;
    public int getSpeed() {
        return speed;
    }

    public int getSpeed2() {
        return super.speed;
    }

    public int getSpeed3() {
        return this.speed;
    }

    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println("getSpeed() : " + croc.getSpeed());
        System.out.println("super.speed : " + croc.getSpeed2());
        System.out.println("this.speed : " + croc.getSpeed3());
    }
}
