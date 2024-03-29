package org.example.ch4;

public class Arrays {
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
        java.util.Arrays.sort(numberos);
        for (int i = 0; i < numberos.length; i++)
            System.out.println(numberos[i] + " ");





    }
}
