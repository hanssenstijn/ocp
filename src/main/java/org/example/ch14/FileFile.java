package org.example.ch14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileFile {
    public static void main(String[] args) {
        File zooFile = new File("test/x/y/txt.txt");
        System.out.println("zooFile.exists() : " + zooFile.exists());
        System.out.println("zooFile.isFile() : " + zooFile.isFile());

        Path zooPath1 = Path.of("a/b/c/txt,txt");
        System.out.println("Files.exists(zooPath1) : " + Files.exists(zooPath1));

        Path nowPath = zooFile.toPath();
        File backToFile = nowPath.toFile();

        Path path = Paths.get("/land/hippo/harrry.happy");
        System.out.println("The Path Name is: " + path);
        for (int i=0; i<path.getNameCount(); i ++)
            System.out.println(" Element " + i + " is " + path.getName(i));

    }

    public static void io() {
        var file = new File("a/b/c/txt.txt");
        if (file.exists()) {
            System.out.println("file.getAbsolutePath() : " + file.getAbsolutePath());
            System.out.println("file.isDirectory() : " + file.isDirectory());
            System.out.println("file.getParent() : " + file.getParent());

            if (file.isFile()) {
                System.out.println("file.length() : " + file.length());
                System.out.println("file.lastModified() : " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println("subfile.getName() : " + subfile.getName());
                }
            }
        }
    }

    public static void nio() throws IOException {
        var path = Path.of("C:\\data\\zoo.txt");
        if (Files.exists(path)) {
            System.out.println("path.toAbsolutePath() : " + path.toAbsolutePath());
            System.out.println("Files.isDirectory(path) : " + Files.isDirectory(path));
            System.out.println("path.getParent() : " + path.getParent());
            if (Files.isRegularFile(path)) {
                System.out.println("Files.size(path) : " + Files.size(path));
                System.out.println(Files.getLastModifiedTime(path));
            } else  {
                try (Stream<Path> stream = Files.list(path)) {
                    stream.forEach(p -> System.out.println(" " + p.getName(0)));
                }
            }
        }
    }
}
