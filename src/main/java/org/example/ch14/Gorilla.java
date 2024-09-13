package org.example.ch14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Gorilla implements Serializable {
    private static final long serialVersionUID = 1l;
    private String name;
    // any field that is marked transient will not be saved
    private transient String favoriteFood;

    void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Gorilla gorilla : gorillas)
                out.writeObject(gorilla);
        }
    }

    List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();
        try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Gorilla g)
                    gorillas.add(g);
            }
        }
    }
}
