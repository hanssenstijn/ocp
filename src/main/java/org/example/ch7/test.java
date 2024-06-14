package org.example.ch7;

public class test {
    public static void main(String[] args) {
        var s = Season.FALL;
        System.out.println( Season.SPRING);
        System.out.println(s == Season.SUMMER);

        for (var season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        // must match exactly
        // Season b = Season.valueOf("Summer");
        Season a = Season.valueOf("SUMMER");

        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }

}
