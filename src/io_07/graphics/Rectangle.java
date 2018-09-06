package io_07.graphics;

import javafx.scene.canvas.GraphicsContext;

/**
 * A rectangle
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public class Rectangle extends Shape {
   private int width;

   private int height;

   /** Number of angles */
   public static final int ANGLES = 4;

   /** Number of rectangles */
   private static int count = 0;

   {
      count++;
   }
   /**
    * Constructs a rectangle with width 0, height 0 on position (0,0)
    * 
    */
   public Rectangle() {
      this(0, 0, 0, 0);
   }

   /**
    * Creaates a rectangle on position (0,0) with specified dimensions
    * 
    * @param width
    *           The width.
    * @param height
    *           The height
    * @throws NegativeSizeException If the width or height is negative.          
    */
   public Rectangle(int width, int height) {
      this(width, height, 0, 0);
   }

   /**
    * Creates a rectangle with specified dimensions on specified location
    * 
    * @param width
    *           The width
    * @param height
    *           The height
    * @param x
    *           The X-position
    * @param y
    *           The Y-position
    * @throws NegativeSizeException If the width or height is negative.          
    */
   public Rectangle(int width, int height, int x, int y) {
      setWidth(width);
      setHeight(height);
      this.x = x;
      this.y = y;
   }

   /**
    * Creates a rectangle as a copy of another rectangle
    * 
    * @param rect
    */
   public Rectangle(Rectangle rect) {
      this(rect.width, rect.height, rect.x, rect.y);
   }

   /**
    * Set the width
    * 
    * @param width  The width
    * @throws NegativeSizeException If the width is negative.          
    */
   public void setWidth(int width) {
      if (width < 0)
         throw new NegativeSizeException("Negative width");
      this.width = width;
   }

   /**
    * Get the width.
    * 
    * @return The width.
    */
   public int getWidth() {
      return width;
   }

   /**
    * Set the height
    * 
    * @param height
    *           The height
    * @throws NegativeSizeException If the height is negative.          
    */
   public void setHeight(int height) {
      if (height < 0)
         throw new NegativeSizeException("Negative height");
      this.height = height;
   }

   /**
    * Get the height
    * 
    * @return The height
    */
   public int getHeight() {
      return height;
   }

   /**
    * Increase dimensions. The new dimensions are limited to 0.
    * 
    * @param dw
    *           Width increment
    * @param dh
    *           Height increment
    * @throws NegativeSizeException If the dimensions get negative.          
    */
   public void grow(int dw, int dh) {
      width += dw;
      height += dh;
      if (width < 0)
         throw new NegativeSizeException("Negative width");
      if (height < 0)
         throw new NegativeSizeException("Negative height");
   }

   /**
    * Increase dimensions.
    * 
    * @param d
    *           Width and height increment.
    */
   public void grow(int d) {
      this.grow(d, d);
   }

   public double getArea() {
      return width * height;
   }

   public double getPerimeter() {
      return (width + height) << 1;
   }

   /**
    * Get the number of rectangles.
    */
   public static int getCount() {
      return count;
   }

   protected void finalize() throws Throwable {
      count--;
      super.finalize();
   }

   /** Compares the rectangle with another object.
    * Two rectangles are equal if they have the same dimensions and position.
    * @param o The other object to compare with.
    * @return True if the objects are equal.
    */
   public boolean equals(Object o) {
      return ((o != null) && (o.getClass() == this.getClass())
            && (((Rectangle) o).x == this.x) && (((Rectangle) o).y == this.y)
            && (((Rectangle) o).width == this.width) && (((Rectangle) o).height == this.height));
   }

   public int hashCode() {
      return x ^ y ^ width ^ height;
   }

   public String toString() {
      return "Rectangle with width " + width + "and height " + height
            + " at position (" + x + "," + y + ")";
   }

   public void draw(GraphicsContext g) {
   }

   public void scale(int factor) {
      double f = Math.sqrt(factor) / 10;
      height = (int) (height * f);
      width = (int) (width * f);
   }
}
