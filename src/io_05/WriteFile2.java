package io_05;
import java.io.*;
import java.util.zip.*;

public class WriteFile2 {
   public static void main(String[] args) {
      try (FileOutputStream fos = new FileOutputStream("MyCompressedFile.bin");
           DeflaterOutputStream dos = new DeflaterOutputStream(fos);
           PrintStream ps = new PrintStream(dos)) {
         for (int i = 0; i < 1000; i++)
            ps.println("Hello World");
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
