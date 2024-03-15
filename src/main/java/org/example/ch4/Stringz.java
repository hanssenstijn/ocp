package org.example.ch4;

public class Stringz {
    public static void main(String[] args) {
        // two ways to initialize strings, both are different and dont refer to same object
        String name = "fully";
        String name2 = new String("fully");
        String name3 = """
                fluffy""";

        // reference
        System.out.println("== " + name == name2);
        System.out.println("== " + name2 == name3);
        // object content
        System.out.println("equals " + name.equals(name2));
        System.out.println("equals " + name2.equals(name3));

        System.out.println("\"a\" + \"b\" + 3 : ");
        System.out.println("a" + "b" + 3);
        System.out.println("1 + 2 + \"c\" : ");
        System.out.println( + 1 + 2 + "c");
        System.out.println("\"c\" + 1 + 2 : ");
        System.out.println("c" + 1 + 2);

        int three = 3;
        String four = "4";
        System.out.println("1 + 2 + three + four : ");
        System.out.println(1 + 2 + three + four);

        // += operand can also be used on string
        var s = "1";
        s += "2";
        s += 3;

        System.out.println(s);
    }
}
