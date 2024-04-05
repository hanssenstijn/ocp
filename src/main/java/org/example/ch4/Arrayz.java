package org.example.ch4;

import java.util.Arrays;

public class Arrayz {
    public static void main(String[] args) {

        // all elements are set to the default value for that type, 33 is length
        int[] numbers = new int[3];

        int[] moreNumbers = new int[] {42,55,99};
        int[] moreNumbers2 = {44,55,66};

        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];

        // twice an array
        int[] ids, types;
        // ids2 is array, types2 is int
        int ids2[],types2;

        String[] bugs = {"cricket","beetle","ladybug"};
        String[] alias = bugs;
        System.out.println("array equals : " + bugs.equals(alias));
        System.out.println("== : " + (bugs == alias));
        System.out.println("toString : " + bugs.toString());
        System.out.println("toString : " + alias.toString());

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        // does not compile
        // againStrings[0] = new StringBuilder();

        String[] mammals = {"monkey","chimp","donkey"};
        System.out.println("length : " + mammals.length);
        System.out.println(mammals[0]);

        var birds = new String[6];
        System.out.println("empty array : " + birds.length);

        var numberz = new int[10];
        for (int i = 0; i < numberz.length; i++)
            numberz[i] = i + 5;
        System.out.println(java.util.Arrays.toString(numberz));

        int[] numberos = {6,9,1};
        // search in unsorted array results in undefined
        System.out.println("binarySearch : " + Arrays.binarySearch(numberos,9));
        // not found, retyns index where a match need to be insterted to preserve sorted order
        System.out.println("binarySearch : " + Arrays.binarySearch(numberos,10));
        java.util.Arrays.sort(numberos);
        for (int i = 0; i < numberos.length; i++)
            System.out.println(numberos[i] + " ");

        // sorts in alphabetic order and 1 sorts before 9
        // (numbers sort before letters, and uppercase sorts before lowercase)
        String[] stringsie = { "10","9","100"};
        Arrays.sort(stringsie);
        for (String s : stringsie)
            System.out.println(s + " ");

        // unsorted array returns undefined result
        int[] numnum = new int[] {3,2,1};
        System.out.println("unsorted array : " + Arrays.binarySearch(numnum,2));
        System.out.println("unsorted array : " + Arrays.binarySearch(numnum,3));

        // compare arrays
        // negative number means the first array is smaller than the second
        // zero means they are equal
        // positive first array is larger than the second
        System.out.println("compare : " + Arrays.compare(new int[] {1}, new int[] {2}));
        System.out.println("compare : " + Arrays.compare(new int[] {1,2}, new int[] {1}));
        System.out.println("compare : " + Arrays.compare(new int[] {1,2}, new int[] {2}));
        System.out.println("compare : " + Arrays.compare(new String[] {"a"}, new String[] {"aa"}));
        System.out.println("compare : " + Arrays.compare(new String[] {"a"}, new String[] {"A"}));
        System.out.println("compare : " + Arrays.compare(new String[] {"a"}, new String[] {null}));
        // does not compile, must be same type
        // System.out.println("compare : " + Arrays.compare(new String[] {"a"}, new int[] {1}));

        System.out.println("mismatch : " + Arrays.mismatch(new int[] {1}, new int[] {1}));
        System.out.println("mismatch : " + Arrays.mismatch(new String[] {"a"}, new String[] {"A"}));
        System.out.println("mismatch : " + Arrays.mismatch(new int[] {1,2}, new int[] {1}));

        System.out.println("equals : " + numberos.equals(numnum));
        System.out.println("equals : " + numberos.equals(numberos));


    }
}
