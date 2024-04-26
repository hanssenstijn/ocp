package org.example.ch5;

public class Varargz {
    public static void main(String[] args) {

        int[] data = new int[] {1,2,3};
        walk(data);
        walk(1,2,3);
        // create array of zero length
        walk();
        run(11,77);
        walk2(1);
        walk2(1,2);
        // does compile, but gives nullpointerexception
        // walk2(1,null);
        walk2(1,2,3);
        walk2(1,new int[]{4,5});

    }


    private static void walk(int... steps) {}
    private static void run(int... steps) {
        System.out.println("steps[1] : " + steps[1]);
    }
    private static void walk2(int start,int... steps) {
        System.out.println("steps.length : " + steps.length);
    }
    // does not compile --> varargs has the be last in the list
    // public void walk3(int... start,int steps) {}
    // does noet compile --> can only have one varargs
    // does not compile
    // public void walk4(int... start,int... steps) {}


}
