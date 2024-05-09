package org.example.ch5;

public class StringBuilderz {
    public static StringBuilder work(StringBuilder a, StringBuilder b) {
        // assigning a new object to a does not change the caller
        a = new StringBuilder("a");
        // calling append does affect the caller
        b.append("b");
        // returns a for s3
        return a;
    }

    public static void main(String[] args) {
        var s1 = new StringBuilder("s1");
        var s2 = new StringBuilder("s2");
        var s3 = work(s1,s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
