package io_03;

import java.io.*;

public class ReadFile {
   public static void main(String[] args) {
      try (FileReader file = new FileReader("MyFile.txt")) {
         int character;
         while ((character = file.read()) != -1) {
            System.out.print((char) character);
         }
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}