package org.example.ch5;

public class Penguin {
    static String nameOfTallestPeguin;
    String name;

    public static void main(String[] args) {
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
}
