package io_05;
import java.io.*;
import java.util.zip.*;

public class ReadFile2 {
   public static void main(String[] args) {
      try (FileInputStream fis = new FileInputStream("MyCompressedFile.bin");
           InflaterInputStream iis = new InflaterInputStream(fis);
           InputStreamReader isr = new InputStreamReader(iis);
           BufferedReader reader = new BufferedReader(isr)) {
         String line;
         while ((line = reader.readLine()) != null) {
            System.out.println(line);
         }
      } catch (IOException ex) {
         System.out.println(ex.getMessage());
      }
   }
}
