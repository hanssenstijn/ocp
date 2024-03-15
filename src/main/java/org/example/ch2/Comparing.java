package org.example.ch2;

public class Comparing {
    public static void main(String[] args) {
        String x = "x";
        String y = x;
        System.out.println("object : " + (x == y));

        int z = 10;
        int v = 11;
        System.out.println("primitive : " + (z == v));

        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar);
        System.out.println(bear);

        boolean w = x instanceof String;
        System.out.println("instanceof: " + w);

        String m = null;
        System.out.println("instanceof null always: " + (m instanceof String));


    }
}
