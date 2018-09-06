package io_05;
import java.io.*;
import java.util.zip.*;

public class ReadFile {
   public static void main(String[] args) {
      try (BufferedReader source = new BufferedReader(
                                      new InputStreamReader(
                                         new InflaterInputStream(                                           
                                            new FileInputStream("MyCompressedFile.bin"))));) {
         String line;
         while ((line = source.readLine()) != null) {
            System.out.println(line);
         }
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
