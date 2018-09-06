package io_07.graphics;

import java.io.*;


public class WriteDrawing {   
   public static void main(String[] args) throws Exception {
      Drawing drawing = new Drawing();      
      drawing.add(new Rectangle(5,6));
      drawing.add(new Square(5));
      drawing.add(new Triangle(4,8,6));
      drawing.add(new IsoScelesTriangle(7,8));
      drawing.add(new Circle(8));
      drawing.add(new Square(9));

      FileOutputStream file = new FileOutputStream("Drawing.bin");
      ObjectOutputStream oos = new ObjectOutputStream(file);
      oos.writeObject(drawing);      
      oos.close();
   }   
}
