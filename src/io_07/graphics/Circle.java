package io_07.graphics;

import javafx.scene.canvas.GraphicsContext;

/**
 * A circle
 * 
 * @author Noel Vaes
 * @version 1.0
 */
public class Circle extends Shape {
   private int radius;

   {
      count++;
   }
   
   /**
    * The number of angles for this shape.
    * 
    */
   public static final int ANGLES = 0;

   private static int count = 0;

   /**
    * Creates a circle on position (0,0) with radius 0.
    * 
    */
   public Circle() {
      this(0, 0, 0);
   }

   /**
    * Creates a circle on position (0,0) with the specified radius.
    * 
    * @param radius
    *           The initial radius.
    */
   public Circle(int radius) {
      this(radius, 0, 0);
   }

   /**
    * Creates a circle on the specified position with the specified radius.
    * 
    * @param radius The initial radius.
    * @param x The x position.
    * @param y The y position.
    * @throws NegativeSizeException If the radius is negative.
    */
   public Circle(int radius, int x, int y) {
      setRadius(radius);
      this.x = x;
      this.y = y;
   }

   /**Create a circle as copy of an existing circle
    * @param circ Existing circle to clone.
    * @throws NegativeSizeException If the radius is negative.
    */
   public Circle(Circle circ) {
      this(circ.radius, circ.x, circ.y);
   }

   /**Set the radius. This should be a positive value.
    * @param radius The new radius.
    * @throws NegativeSizeException If the radius is negative.
    */
   public void setRadius(int radius) {
      if (radius < 0)
         throw new NegativeSizeException("Negative radius");
      this.radius = radius;
   }

   /**Get the radius
    * @return The radius.
    */
   public int getRadius() {
      return radius;
   }

   /**Grow circle with radius increment.
    * @param dr The radius increment.
    * @throws NegativeSizeException If the radius gets negative.
    */
   public void grow(int dr) {
      if((radius + dr) <0 ) {
         throw new NegativeSizeException("Negative radius");         
      }
      radius += dr;
   }

   public double getArea() {
      return Math.PI * radius * radius;
   }

   public double getPerimeter() {
      return 2 * Math.PI * radius;
   }

   public static int getCount() {
      return count;
   }

   protected void finalize() throws Throwable {
      count--;
      super.finalize();
   }

   /** Compares the circle with another object.
    * Two circles are equal if they have the same radius and position.
    * @param o The other object to compare with.
    * @return True if the objects are equal.
    */
   public boolean equals(Object o) {
      return ((o != null) && (o.getClass() == this.getClass())
            && (((Circle) o).x == this.x) && (((Circle) o).y == this.y) && (((Circle) o).radius == this.radius));
   }

   public int hashCode() {
      return x ^ y ^ radius;
   }

   public String toString() {
      return "Circle with radius " + radius + " at position (" + x + "," + y
            + ")";
   }

   public void draw(GraphicsContext g) {
   }

   public void scale(int factor) {
      double f = Math.sqrt(factor) / 10;
      radius = (int) (radius * f);
   }
}
