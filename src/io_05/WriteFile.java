package io_05;
import java.io.*;
import java.util.zip.*;
// Noël

public class WriteFile {
   public static void main(String[] args) {
      try (PrintStream out = new PrintStream(
         new DeflaterOutputStream(new FileOutputStream(
            "MyCompressedFile.bin")))) {
         for (int i = 0; i < 1000; i++)
            out.println("Hello World");
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
