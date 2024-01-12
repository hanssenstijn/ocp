package org.example;

public class Switch {
    public static void main(String[] args) {
        int number = 1;

        String message = switch (number) {
            case 1 -> {
                yield "Got a 1";
            }
            case 2 -> {
                yield "Got a 2";
            }
            default -> {
                yield "More than 2";
            }
        };
        System.out.println(message);
    }
}
