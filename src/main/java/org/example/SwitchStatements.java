package org.example;

public class SwitchStatements {
    public static void main(String[] args) {
        int animal = 1;

        // break is optional, but without it, it prints every following statement after matching case
        switch (animal) {
            case 1,2:
                System.out.println("lion");

            case 3:
                System.out.println("Tiger");
        }

        int animal3 = 3;
        // pay attention that after matching case also the default is printed
        switch (animal3) {
            case 1,2:
                System.out.println("lion");

            case 3:
                System.out.println("Tiger");
            default:
                System.out.println("also me");
        }

        int animal2 = 1;
        // stops at break
        switch (animal2) {
            case 1: case 2:
                System.out.println("lion");
                break;

            case 3:
                System.out.println("Tiger");
        }

        // empty switch statement
        int month = 2;
        switch (month) {}



    }
    // break is optional!
    public void printDayOfWeek(int day) {
        switch (day) {
            case 0 :
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("invalid value");
                break;

        }
    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 1;
        final int cookies = getCookies();

/*        switch (numberOfAnimals) {
            case bananas; // does compile
            case apples; // does not compile since not final not constant
            case getCookies(); // does not compile, not constant at
            case cookies; // does not compile method not evaluated during run time
            case 3 * 5; // does compile
        }*/
    }



    int getCookies() {
        return 4;
    };
}
