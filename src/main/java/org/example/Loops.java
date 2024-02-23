package org.example;

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

        // declaring initialized var inside for loop does not compile
/*        int x = 0;
        for(int x = 4; x < 5; x++)
            System.out.println(x + " ");*/
    }
}
