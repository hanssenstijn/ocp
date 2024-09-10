package org.example.ch14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOStreams {
    public static void main(String[] args) throws FileNotFoundException {

        try (var br = new BufferedReader(new FileReader("zoo-data.txt"))) {
            System.out.println(br.lines());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
