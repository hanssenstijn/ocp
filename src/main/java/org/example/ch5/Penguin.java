package org.example.ch5;

import java.util.List;

// static import thus can use asList() instead of Array.asList()
import static java.util.Arrays.asList;
// does not compile, static import can only import static members like a method or a variable
// import static java.util.Arrays

public class Penguin {
    // does not compile since needs to be initialized
    // static final double height;
    // bamboo does compile since static block initializes (with value)
    static final int bamboo;
    static int bamboo2;
    // static final cannot be initialized in a instance block therefor compiler error
    // static final int bamboo3;
    int check;
    int check2;
    static { bamboo = 5;
    // check = 5; --> cannot be initialized here since static block only has access to static var
    }

    {
        bamboo2 = 6;
        check2 = 4;
        // bamboo3 = 3;
    }
    static String nameOfTallestPeguin;
    String name;
    private static final int NUM_BUCKETS = 45;
    private static final String[] treats = new String[10];

    int quack = 5;
    // convert int to Integer
    Integer quackquack = Integer.valueOf(quack);
    // convert Integer to int
    int quackquackquack = quackquack.intValue();
    // autoboxing
    Integer quackquackquackquack = quack;
    // unboxing
    int quackquackquackquackquackquack = quackquackquackquack;

    // does not compile since it can be autoboxed to long or Integer
    // Long badGorilla = 8;

    Character elephant = null;
    // results in nullpointerexception
    // char badElephant = elephant;

    public static void main(String[] args) {
        // treats = reference variable. we are allowed to modify the referenced object or array's contents.
        treats[0] = "popcorn";

        var p1 = new Penguin();
        p1.name = "Lilly";
        p1.nameOfTallestPeguin = "Lilly";
        var p2 = new Penguin();
        p2.name = "Willy";
        p2.nameOfTallestPeguin = "Willy";

        System.out.println("p1.name : " + p1.name);
        System.out.println("p1.nameOfTallestPeguin : " + p1.nameOfTallestPeguin);
        System.out.println("p2.name : " + p2.name);
        System.out.println("p2.nameOfTallestPeguin : " + p2.nameOfTallestPeguin);

        p2 = null;
        System.out.println("after null p2, p2.nameOfTallestPeguin : " + p2.nameOfTallestPeguin);

        // does not compile since both the method and the instance var has to be static
        // third()
        // does compile since instance made
        p1.third();
        fourth();
        fifth();

        List<String> list = asList("one","two");

        int num = 4;
        newNumber(num);
        // prints out 4
        System.out.println("newNumber : " + num);

        String name = "Webby";
        speak(name);
        // prints Webby
        System.out.println(name);

        var name2 = new StringBuilder("Webbey");
        speak2(name2);
        // prints WebbeyGeorgette
        System.out.println(name2);

        climb(123);
        swin(123);
        // does not compile since java will not automatically convert to a narrower type
        // jump(123L);
        // does not compile since java will not cast and autobox at the same time
        // rest(8);
    }

    private static void speak2(StringBuilder name2) {
        name2.append("Georgette");
    }

    private static void speak(String name) {
        name = "Georgette";
    }

    private static void newNumber(int num) {
        num = 8;
    }

    // does not compile since method is static and var is instance
    /*  public static void fourth() {
            System.out.println(name);
    }*/

    public void third() {
        System.out.println(name);
        System.out.println("third calling fifth : ");
        fifth();
    }

    public static void fourth() {
        System.out.println("fourth calling fifth : ");
        fifth();
    }

    public static void fifth() {
        System.out.println("fifth");
    }

    public static void climb(long t) {}
    public static void swin(Integer u) {}
    public static void jump(int v){}
    public static void rest(Long x) {}
}
