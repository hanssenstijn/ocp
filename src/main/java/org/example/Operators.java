package org.example;

public class Operators {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        System.out.println("& : " + (a & b));
        System.out.println("| : " + (a | b));
        // if one true and other false returns true
        System.out.println("^ : " + (a ^ b));

        int owl = 5;
        int food = owl < 2 ? 3 : 4;
        System.out.println(food);

        // First ternary: Checks if owl is less than 4 (owl < 4).
        //If true: Proceeds to the second ternary.
        //If false: Skips the second ternary and directly assigns 5 to food2.
        int food2 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        System.out.println(food2);
    }
}
