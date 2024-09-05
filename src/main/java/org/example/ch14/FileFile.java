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

        var p = Paths.get("/mammal/omnivorre/raccoon.image");
        System.out.println("p.subpath(0,3) : " + p.subpath(0,3));
        System.out.println("p.subpath(1,2) : " + p.subpath(1,2));
        System.out.println("p.subpath(1,3) : " + p.subpath(1,3));

        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");
        System.out.println("relative path : " + path1.resolve(path2));

        Path path3 = Path.of("/turkey/food");
        System.out.println("absolute path : " + path3.resolve("/tiger/cage"));

        Path p1 = Path.of("fish.txt");
        Path p2 = Path.of("friendly/birds.txt");

        // relativize method require both paths to be absolute or relative and throws an exception if the types are
        // mixed
        System.out.println("p1.relativize(p2) : " + p1.relativize(p2));
        System.out.println("p2.relativize(p1) : " + p2.relativize(p1));

        Path path4 = Path.of("./armadillo/../shells.txt");
        System.out.println("path4.normalize() : " + path4.normalize());
        Path path5 = Path.of("/cats/../panther/food");
        System.out.println("path5.normalize() : " + path5.normalize());

        System.out.println("path5.equals(path4) : " + path5.equals(path4));
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
