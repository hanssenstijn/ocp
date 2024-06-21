package org.example.ch7;

public class SwitchEnumExample {

    // DAY.MONDAY is not acceptable, you have to use only the enum name
    public static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start of the work week!");
            case TUESDAY -> System.out.println("Second day of the work week.");
            case WEDNESDAY -> System.out.println("Hump day!");
            case THURSDAY -> System.out.println("Almost there...");
            case FRIDAY -> System.out.println("Last workday of the week!");
            case SATURDAY -> System.out.println("Weekend fun!");
            case SUNDAY -> System.out.println("Rest and recharge for the week ahead.");
            default -> System.out.println("Invalid day.");
        }
    }

    public static void printDayMessage2(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case TUESDAY:
                System.out.println("Second day of the work week.");
                break;
            case WEDNESDAY:
                System.out.println("Hump day!");
                break;
            case THURSDAY:
                System.out.println("Almost there...");
                break;
            case FRIDAY:
                System.out.println("Last workday of the week!");
                break;
            case SATURDAY:
                System.out.println("Weekend fun!");
                break;
            case SUNDAY:
                System.out.println("Rest and recharge for the week ahead.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }

    public static void main(String[] args) {
        // Test the switch statement with different days
        printDayMessage(Day.MONDAY);
        printDayMessage(Day.WEDNESDAY);
        printDayMessage(Day.SATURDAY);
    }
}

