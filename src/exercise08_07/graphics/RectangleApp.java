package exercise08_07.graphics;

public class RectangleApp {
	public static void main(String[] args) {
		System.out
				.println("This program uses a rectangle");
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(4, 5);
		Rectangle rect3 = new Rectangle(10, 56, 4, 6);
		Rectangle rect4 = new Rectangle(rect3);

		rect1.setWidth(-5);
		rect1.setHeight(7);
		rect1.setPosition(10, 20);
		rect1.grow(5);

		printRectangle(rect1);
		printRectangle(rect2);
		printRectangle(rect3);
		printRectangle(rect4);
		
	}

	private static void printRectangle(Rectangle rect) {
      System.out.println("Height: " + rect.getHeight());
      System.out.println("Width: " + rect.getWidth());
      System.out.println("X: " + rect.getX());
      System.out.println("Y: " + rect.getY());
      System.out.println("Area: " + rect.getArea());
      System.out.println("Perimeter: " + rect.getPerimeter());
   }
}
