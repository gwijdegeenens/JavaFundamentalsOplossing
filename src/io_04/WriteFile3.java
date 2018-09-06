package io_04;

import java.io.*;
import java.nio.file.*;

public class WriteFile3 {
   public static void main(String[] args) {
      BufferedWriter writer = null;
      Path path = Paths.get("MyFile.txt");
      try {
         writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
         writer.newLine();
         writer.write("Hello");
         writer.write("World");
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
      finally {
         if(writer != null) {
            try {
               writer.close();
            } catch(IOException ex){}
         }
      }
   }
}
