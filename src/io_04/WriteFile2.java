package io_04;

import java.io.*;
import java.nio.file.*;

public class WriteFile2 {
   public static void main(String[] args) {
      Path path = Paths.get("MyFile.txt");
      try (BufferedWriter writer = Files.newBufferedWriter(path,
                                          StandardOpenOption.APPEND)) {
         writer.newLine();
         writer.write("Hello");
         writer.write("World");
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
