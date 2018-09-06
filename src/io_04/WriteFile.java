package io_04;

import java.io.*;

public class WriteFile {
   public static void main(String[] args) {
      try (BufferedWriter file = new BufferedWriter(new FileWriter(
            "MyFile.txt", true))) {
         file.newLine();
         file.write("Hello");
         file.write("World");
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
