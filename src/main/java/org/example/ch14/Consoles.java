package org.example.ch14;

import java.io.Console;

public class Consoles {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null ) {
            String userInput = console.readLine();
            console.writer().println("You entered : " + userInput);
            console.format("It has %d animals and employs %d people",291,25);
            console.printf("The zoo spans %5.1f acres",128.91);

            char[] password = console.readPassword("Enter the password again : ");
        } else {
            System.err.println("Console not available");
        }
    }
}
