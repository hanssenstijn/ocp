package org.example.ch6;

public class test {
    // non-final and instance variables defined without a value are assigned a default value
    static int x;
    short y;
    // final thus needs to be initialized either when declared or in initialize block
    final static byte z;
    final static double q = 10.0;

    // final fields must be assigned a value exactly once,
    // either when they are declared in an instance initializer or in a constructor
    final float w;
    final int e = 1;
    final int r;
    {r=1;}



    public test(float w) {
        this.w = w;
    }

    // this is need else it wont compile since final float w needs a value assigned
    public test() {
        this(1);
    }

    static {z =1;}
    public static void main(String[] args) {
        test test = new test();
        System.out.println(test.y);
        System.out.println(x);
    }
}
