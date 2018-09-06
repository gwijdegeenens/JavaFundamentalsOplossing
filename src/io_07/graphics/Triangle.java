package io_07.graphics;

import javafx.scene.canvas.GraphicsContext;

/**
 * A triangle.
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public class Triangle extends Shape {
   private int width;
   private int height;
   private int perpendicular;

   {
      count++;
   }

   /**
    * The number of angles for this shape.
    */
   public static final int ANGLES = 3;
   private static int count = 0;

   /**
    * Creates a triangle with all dimensions set to 0 at position (0,0)
    */
   public Triangle() {
      this(0, 0, 0, 0, 0);
   }

   /**
    * Creates a triangle with specified dimensions at position (0,0).
    * 
    * @param width
    *           The width.
    * @param height
    *           The height.
    * @param perpend
    *           The perpendicular.
    * @throws NegativeSizeException
    *            The width or hight is negative.
    */
   public Triangle(int width, int height, int perpend) {
      this(width, height, perpend, 0, 0);
   }

   /**
    * Creates a triangle with specified dimensions at specified location.
    * 
    * @param width
    *           The width.
    * @param height
    *           The height.
    * @param perpend
    *           The perpendicular.
    * @throws NegativeSizeException
    *            The width or hight is negative.
    */
   public Triangle(int width, int height, int perpend, int x, int y) {
      this.x = x;
      this.y = y;
      setWidth(width);
      setHeight(height);
      setPerpendicular(perpend);
   }

   /**
    * Creates a triangle as clone of an existing triangle.
    * 
    * @param tri
    *           Triangle to clone.
    */
   public Triangle(Triangle tri) {
      this(tri.width, tri.height, tri.perpendicular, tri.x, tri.y);
   }

   /**
    * Set the width. The width can not be negative.
    * 
    * @param width
    *           The width.
    * @throws NegativeSizeException
    *            The width is negative.
    */
   public void setWidth(int width) {
      if (width < 0)
         throw new NegativeSizeException("Negative width");
      this.width = width;
   }

   /**
    * Set the height. The heigth can not be negative.
    * 
    * @param height
    *           The heigth.
    */
   public void setHeight(int height) {
      if (height < 0)
         throw new NegativeSizeException("Negative height");
      this.height = height;
   }

   /**
    * Set the perpendicular.
    * 
    * @param perpendicular
    *           The perpendicular.
    */
   public void setPerpendicular(int perpendicular) {
      this.perpendicular = perpendicular;
   }

   public double getArea() {
      return (width * height) / 2;
   }

   public double getPerimeter() {
      return width + Math.hypot(height, perpendicular)
            + Math.hypot(height, (width - perpendicular));
   }

   public int getWidth() {
      return width;
   }

   public int getHeight() {
      return height;
   }

   /**
    * Get the perpendicular
    * 
    * @return The perpendicular.
    */
   public int getPerpendicular() {
      return perpendicular;
   }

   /**
    * Get the number of created triangles.
    * 
    * @return The number of triangles.
    */
   public static int getCount() {
      return count;
   }

   protected void finalize() throws Throwable {
      count--;
      super.finalize();
   }

   /**
    * Compares the triangle with another object. Two triangles are equal if they
    * have the same dimensions and position.
    * 
    * @param o
    *           The other object to compare with.
    * @return True if the objects are equal.
    */
   public boolean equals(Object o) {
      return (o != null) && (o.getClass() == this.getClass())
            && (((Triangle) o).height == this.height)
            && (((Triangle) o).width == this.width)
            && (((Triangle) o).perpendicular == this.perpendicular);
   }

   public int hashCode() {
      return super.hashCode() ^ height ^ width ^ perpendicular;
   }

   public String toString() {
      return "Triangle at position (" + x + "," + y + ") with base " + width
            + ", height " + height + " and pendicular " + perpendicular;
   }

   public void draw(GraphicsContext g) {
   }

   public void scale(int factor) {
      double f = Math.sqrt(factor) / 10;
      height = (int) (height * f);
      width = (int) (width * f);
   }
}
