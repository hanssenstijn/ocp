package org.example.ch11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             FileWriter writer = new FileWriter("output.txt")) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            // Handle IOException
            System.err.println("An IOException occurred: " + e.getMessage());
        }
    }
}
