package org.example.ch4;

public class Maths {
    public static void main(String[] args) {
        int first = Math.max(3,7);
        int second = Math.min(7,-9);

        long low = Math.round(123.45);
        System.out.println("round : " + low);
        int fromFloat = Math.round(123.45f);
        System.out.println("round : " + fromFloat);
        long high = Math.round(123.5);

        // ceil if it has any fractional value it rounds up to the next whole number
        // it takes a double
        double c = Math.ceil(3.14);
        System.out.println("ceil : " + c);
        double d = Math.floor(3.14);
        System.out.println("floor : " + d);

        // pow returns double
        double squared = Math.pow(5,2);
        System.out.println("pow : " + squared);

        // generate number greater than or equal to 0 and smaller to 1
        double numnum = Math.random();
        System.out.println("random : " + numnum);
    }

}
