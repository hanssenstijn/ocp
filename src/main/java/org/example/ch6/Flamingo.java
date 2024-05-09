package org.example.ch6;

public class Flamingo {
    private String color = null;
    public void setColor(String color) {
        color = color;
    }

    public void setColor2(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.println("setColor : " + f.color);
        f.setColor2("PINK");
        System.out.println("setColor2 : " + f.color);
    }
}
