package io_07.graphics;

/**
 * This class represents a graphical shape
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public abstract class Shape implements Drawable {
   /** X-position */
   public int x;

   /** Y-position */
   public int y;

   private static int count = 0;

   {
      count++;
   }

   /**
    * Get the Y-position
    * 
    * @return The y-position
    */
   public int getY() {
      return y;
   }

   /**
    * The the postion.
    * 
    * @param x
    *           X-position
    * @param y
    *           Y-position
    */
   public void setPosition(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /**
    * Get the X-position
    * 
    * @return The X-position
    */
   public int getX() {
      return x;
   }

   /**
    * Get the number of object of this class.
    * 
    * @return The number of objects.
    */
   public static int getCount() {
      return count;
   }

   /**
    * Get the shape area.
    * 
    * @return The shape area.
    */
   public abstract double getArea();

   /**
    * Get the shape perimeter
    * 
    * @return The shape perimeter
    */
   public abstract double getPerimeter();

   protected void finalize() throws Throwable {
      count--;
      super.finalize();
   }
}
