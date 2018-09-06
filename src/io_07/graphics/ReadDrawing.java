package io_07.graphics;

import java.io.*;


public class ReadDrawing {   
   public static void main(String[] args) throws Exception {
      FileInputStream file = new FileInputStream("Drawing.bin");
      ObjectInputStream ois = new ObjectInputStream(file);
      Drawing drawing = (Drawing) ois.readObject();      
      for(Drawable d: drawing) {
         System.out.println(d);
      }
      ois.close();
   }   
}
