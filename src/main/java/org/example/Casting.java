package org.example;

public class Casting {

    static long addCandy(double fruit, float vegetables) {
        return (int) (fruit + vegetables);
    }
    // does not compile, since vegetables is a float
//    static long addCandy(double fruit, float vegetables) {
//        return (int) (fruit) + vegetables;
//    }

    public static void main(String[] args) {
        int fur = (int)5;
        int hair = (short) 10;
        short x = (short) 4 + 10;
        short y = (short) (4 + 10);
        System.out.println(x);

        short mouse = 10;
        short hamster = 3;
        // does not compile since binary operation the output becomes an int
        // short capybara = mouse + hamster;
        // does not compile since casting is a unary operation
        // short capybara = (short) mouse + hamster;
        short capybara = (short) (mouse + hamster);

        // compiler doesn't require casting when working with literal values that fit into the data type
        byte gloves = 7 * 10;
        short boots = 2 + 1;
        // but if you use variable instead, it doesn't compile
        // short shoes = 2 + boots;

        int a = 1;
        a += 5;
        System.out.println(a);
        double b = 0.2;
        b -= 0.1;
        System.out.println(b);
        int c = 2;
        c *= 100;
        System.out.println(c);
        int d =2;
        d /= 2;
        System.out.println(d);

        // does not compile variable first needs to be assigned
        // int x +=d;
        // int x += 5;

        long goat = 10;
        int sheep = 5;
        // does not compile since will become long
        // sheep = goat * sheep;
        // will compile since compound will first make long and then automatically cast to int
        sheep *= goat;

        long wolf = 5;
        // sets wolf to 3 and returns the value of assignment
        long coyote = (wolf = 3);
        System.out.println(wolf);
        System.out.println(coyote);

        boolean healthy = false;
        // sets healthy to true this prints Good!
        if(healthy = true) {
            System.out.println("Good!");
        }

        // after the operation, the result is converted back to the type of the left-hand operand
        long deer = (int) 2;
        deer -= 1.0;
        System.out.println("deer : " + deer);

        int note = 1;
        short melody = (byte) (double) (note *=2);
        // does not compile since type double is larger
        // short melody2 = (double) (byte) (note *=2);
    }
}
