package org.example.ch14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class IOStreams {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (var br = new BufferedReader(new FileReader("zoo-data.txt"))) {
            System.out.println(br.lines());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));
        oos.writeObject(new Gorilla());
        oos.close();

        // deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"));
        Gorilla obj = (Gorilla) ois.readObject();
        ois.close();

        // Absolute path
        File fileAbsolute = new File("/home/user/docs/file.txt");
        // Relative path
        File fileRelative = new File("file.txt");

        String line;
        var c = System.console();
        Writer w  = c.writer();
        try (w) {
            if ((line = c.readLine("Enter your name: ")) != null)
                w.append(line);
            w.flush();
        }

        // if the code creates a directory, it will be reachable at /kang/joey
        var path = Paths.get("/kang");
        if(Files.isDirectory(path) && Files.isSymbolicLink(path))
            Files.createDirectory(path.resolve("joey"));

        try {
            // Define the path to the file
            Path filePath = Paths.get("example.txt");

            // Read all lines of the file into a List<String>
            List<String> lines = Files.readAllLines(filePath);

            // Print each line
            for (String linee : lines) {
                System.out.println(linee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // IOexception must be declared
    public void removeBadFile(Path path) throws IOException {
        if(Files.isDirectory(path))
            System.out.println(Files.deleteIfExists(path) ? "Succes": "Try again");
    }

    void copyStream(InputStream in, OutputStream out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

    void copyStream(Reader in, Writer out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

    private void copyPathAsString(Path input, Path output) throws IOException {
        String string = Files.readString(input);
        Files.writeString(output, string);
    }

    private void copyPathAsBytes(Path input, Path output) throws IOException {
        byte[] bytes = Files.readAllBytes(input);
        Files.write(output, bytes);
    }

    private void copyPathAsLines(Path input, Path output) throws IOException {
        List<String> lines = Files.readAllLines(input);
        Files.write(output, lines);
    }

    private void readLazily(Path path) throws IOException {
        try (Stream<String> s = Files.lines(path)) {
            s.forEach(System.out::println);
        }

        try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("Warn:")).map(f -> f.substring(5)).forEach(System.out::println);
        }
    }

    private void test() throws IOException {
        // readAlllines returns a list not a stream thus wont work, it needs the stream in between
        // Files.readAllLines(Paths.get("birds.txt")).filter(s -> s.length() > 2).forEach(System.out::println);
        Files.readAllLines(Paths.get("birds.txt")).stream().filter(s -> s.length() > 2).forEach(System.out::println);
        // however lines returns a stream thus can use stream method immediately
        Files.lines(Paths.get("birds.txt")).filter(s -> s.length() > 2).forEach(System.out::println);
    }
}
