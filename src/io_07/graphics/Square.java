package io_07.graphics;

/**
 * This class is square in a two dimensional area. This class can be used the
 * following way:
 * 
 * <pre>
 * Square sq = new Square(5);
 * </pre>
 * 
 * @author Noel Vaes
 * @version 1.0
 * @see graphics.Rectangle
 */
public class Square extends Rectangle {
   private static int count = 0;

   {
      count++;
      
   }
   public static int getCount() {
      return count;
   }

   /**
    * Creates a square with side 0 at postion (0,0)
    */
   public Square() {
      this(0, 0, 0);
   }

   /**Create a square with the specified side at postion (0,0) 
    * @param side The side.
    * @throws NegativeSizeException
    *            The side is negative.
    */
   public Square(int side) {
      this(side, 0, 0);
   }

   /**
    * This constructor creates a square with specified side.
    * 
    * @param side
    *           The initial side of the square.
    * @param x
    *           The x position of the square.
    * @param y
    *           The y position of the square;
    * @throws NegativeSizeException
    *            The side is negative.
    */
   public Square(int side, int x, int y) {
      super(side, side, x, y);
   }

   public Square(Square square) {
      this(square.getSide(), square.x, square.y);
   }

   /**
    * Returns the side of the square. The side of the square can be set using
    * {@link graphics.Square#setSide}.
    * 
    * @return The side of the square
    * @see graphics.Square#setSide
    */
   public int getSide() {
      assert getHeight() == getWidth() : "width != heigth";
      return getHeight();
   }

   /**Set the side of the square.
    * @param side The new side.
    * @throws NegativeSizeException
    *            The side is negative.
    */
   public void setSide(int side) {
      super.setHeight(side);
      super.setWidth(side);
   }

   public void setHeight(int height) {
      setSide(height);
   }

   public void setWidth(int width) {
      setSide(width);
   }

   protected void finalize() throws Throwable {
      count--;
      super.finalize();
   }

   public String toString() {
      return "Square with side " + getSide() + " at position (" + x + "," + y
            + ")";
   }
}
