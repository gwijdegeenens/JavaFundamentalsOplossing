package io_01;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;

public class CreateFile {

   public static void main(String[] args) {
      try {
         Path path = Paths.get("C:\\data\\folder\\file.txt");
         Files.createDirectories(path.getParent());

         if (Files.notExists(path)) {
            Files.createFile(path);
            System.out.println("File created");
         } else {
            System.out.println("File already exsts.");
         }

         // Write lines of text to file
         List<String> lines = new ArrayList<>();
         lines.add("Hello");
         lines.add("World");
         Files.write(path, lines, Charset.defaultCharset(),
               StandardOpenOption.APPEND);

         DosFileAttributes attrs = Files.readAttributes(path,
               DosFileAttributes.class);
         System.out.println(attrs.size());
         System.out.println(attrs.creationTime());
         System.out.println(attrs.lastAccessTime());
         System.out.println(attrs.lastModifiedTime());
         System.out.println(attrs.isArchive());
         System.out.println(attrs.isHidden());
         System.out.println(attrs.isReadOnly());
         System.out.println(Files.getOwner(path));

         // Read lines of text from file
         lines = Files.readAllLines(path, Charset.forName("UTF-8"));
         for(String l: lines) {
            System.out.println(l);
         }

         Path newPath = path.getParent().resolve("Renamed.txt");
         Files.move(path, newPath,StandardCopyOption.REPLACE_EXISTING);

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
