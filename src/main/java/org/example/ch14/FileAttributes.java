package org.example.ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileAttributes {
    public static void main(String[] args) throws IOException {
        System.out.println(Files.isDirectory(Paths.get("/canine/fur.jpg")));
        System.out.println(Files.isSymbolicLink(Paths.get("/canine/coyote")));
        System.out.println(Files.isRegularFile(Paths.get("canine/types.txt")));

        System.out.println(Files.isHidden(Paths.get("/walrus.txt")));
        System.out.println(Files.isReadable(Paths.get("seal/baby.png")));
        System.out.println(Files.isWritable(Paths.get("dolphin.txt")));
        System.out.println(Files.isExecutable(Paths.get("whale.png")));

        var path = Paths.get("/turtles/sea.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Creation Time: " + data.creationTime());
        System.out.println("Last Modified Time: " + data.lastModifiedTime());
        System.out.println("Size: " + data.size() + " bytes");

        FileTime newTime = FileTime.fromMillis(System.currentTimeMillis());
        Files.setLastModifiedTime(path, newTime);

        
    }
}
