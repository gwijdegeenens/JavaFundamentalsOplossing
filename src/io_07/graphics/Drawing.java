package io_07.graphics;

import java.util.*;
import javafx.scene.canvas.GraphicsContext;

/**
 * This class represents a drawing, containing drawable objects. The drawing is
 * implemented according the <i><b>Composite Design Pattern</b></i>
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public class Drawing implements Drawable, Iterable<Drawable> {
   private Collection<Drawable> drawables = new ArrayList<Drawable>();

   /**
    * Add a drawable object to the drawing.
    * 
    * @param d
    *           The drawable object to add. null will be ignored.
    */
   public void add(Drawable d) {
      if (d != null) {
         drawables.add(d);
      }
   }

   /**
    * Remove all drawable objects from the drawing.
    */
   public void clear() {
      drawables.clear();
   }

   public void remove(Drawable d) {
      drawables.remove(d);
   }

   public Iterator<Drawable> iterator() {
      return drawables.iterator();
   }

   /**
    * Get the number of drawables in the drawing.
    * 
    * @return The number of drawables.
    */
   public int getSize() {
      return drawables.size();
   }

   public void draw(GraphicsContext g) {
      for (Drawable d : drawables) {
         d.draw(g);
      }
   }

   public void scale(int factor) {
      for (Drawable d : drawables) {
         d.scale(factor);
      }
   }
}
