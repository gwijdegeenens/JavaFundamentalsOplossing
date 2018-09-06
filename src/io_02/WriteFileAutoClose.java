package io_02;

import java.io.*;

public class WriteFileAutoClose {
   public static void main(String[] args) {
      try (FileWriter file = new FileWriter("MyFile.txt", true)) {
         file.write("Hello");
         file.write("World");
      } catch (IOException ex) {
         System.out.println("Ooops, something went wrong");
         System.out.println(ex.getMessage());
      }
   }
}