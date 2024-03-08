package org.example.ch3;

import java.util.ArrayList;
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

        List<Integer> myFavNum = new ArrayList<>();
        myFavNum.add(10);
        myFavNum.add(14);

        for(Object c : myFavNum)
            System.out.println("c : " + c);

        char[] wolf = {'w','b'};
        int q = wolf.length;
        for(;;) {
            System.out.println(wolf[--q]);
            if(q==0) break;
        }

        // all three sections  separated by semicolons are technically optional
        int performers = -1;
        for (;performers<2;performers+=2) {}

        // snake is out of scope in the while condition
/*        double iguana = 0;
        do {
            int snake = 1;
            System.out.println(snake++ + " ");
            iguana--;
        } while (snake <=5);
        System.out.println(iguana);*/
    }

    public void printNames(List<String> names) {
        for (var name : names)
            System.out.println(name);
    }
}
