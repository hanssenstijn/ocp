package org.example.ch3;

public class PatternMatching {
    void compareIntegers(Number number) {
        if (number instanceof Integer data) {
            System.out.println(data.compareTo(5));
        }
    }

    void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5)>0) {
            System.out.println(data);
        }
    }

    // does not compile, since if left side is not true (can be other type)
/*    void doesNotCompile(Number number) {
        if (number instanceof Integer data || data.compareTo(5)>0) {
            System.out.println(data);
        }
    }*/

    void pirntOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.println(data.intValue());
    }

    void pirntOnlyIntegersElse(Number number) {
        if (!(number instanceof Integer data))
            return;
        else
        System.out.println(data.intValue());
    }

    // does not compile since using the same name
/*    void getFish(Object fish) {
        if(!(fish instanceof String guppy))
            System.out.println("Eat");
        else if(!(fish instanceof String guppy))
            throw new RuntimeException();
    }*/

    // instanceof checks if the String has the exact value guppy or juppy
    void getFish(Object fish) {
        if(!(fish instanceof String guppy))
            System.out.println("Eat");
        else if(!(fish instanceof String juppy))
            throw new RuntimeException();
    }

}
