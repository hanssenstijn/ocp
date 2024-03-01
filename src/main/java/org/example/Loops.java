package org.example;

import java.util.List;

public class Loops {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 5) {
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }

        int lizard = 0;
        do {
            lizard++;
        } while (false);
        System.out.println(lizard);

        for (int i=0; i < 5; ++i)
            System.out.println(i);

        // does not compile since first is not an expression
/*        int y = 0;
        for (y;y<5;y++) {
            System.out.println(y);
        }*/

        // declaring initialized var inside for loop does not compile
/*        int x = 0;
        for(int x = 4; x < 5; x++)
            System.out.println(x + " ");*/

        // does not compile types have to match
/*        String[] sloths = new String[3];
        for(int sloth : sloths)
            System.out.println(sloth);*/

        // for the second itteration the do loop body will still be ran, before hitting the while loop
        int hungryHippopotamus = 8;
        while (hungryHippopotamus>0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus>5);
            hungryHippopotamus--;
            System.out.println(hungryHippopotamus + " hungryHippopotamus, ");
        }

    }

    public void printNames(List<String> names) {
        for (var name : names)
            System.out.println(name);
    }
}
