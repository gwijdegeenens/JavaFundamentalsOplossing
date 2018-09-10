package graphics;

import java.util.*;
import javafx.scene.canvas.GraphicsContext;

/**This class represents a drawing, containing drawable objects.
 * The drawing is implemented according the <i><b>Composite Design Pattern</b></i>
 * 
 * @author No&euml;l Vaes
 * @version 1.0
 */
public class Drawing implements Drawable,Iterable<Drawable> {
   private class DrawableIterator implements Iterator<Drawable> {
      private int index = 0;

      public boolean hasNext() {
         for (int i = index; i < drawables.length; i++) {
            if (drawables[i] != null) {
               return true;
            }
         }
         return false;
      }

      public Drawable next() {
         for (int i = index; i < drawables.length; i++) {
            if (drawables[i] != null) {
               index = i;
               break;
            }
         }
         if(index == drawables.length) {
            throw new NoSuchElementException();
         }
         return drawables[index++];
      }
   }

   private final int MAX = 100;

	private Drawable[] drawables = new Drawable[MAX];

	private int size = 0;

   /**Add a drawable object to the drawing.
    * @param d The drawable object to add.
    */
	public void add(Drawable d) {
		if (!present(d)) {
			int location = getFreeLocation();
			drawables[location] = d;
			size++;
		}
	}

	/**
	 * Remove all drawable objects from drawing.
	 */
	public void clear() {
		drawables = new Drawable[100];
		size = 0;
	}

	public void draw(GraphicsContext g) {
		for (int i = 0; i < drawables.length; i++) {
			if (drawables[i] != null) {
				drawables[i].draw(g);
			}
		}
	}

	private int getFreeLocation() {
		for (int i = 0; i < drawables.length; i++) {
			if (drawables[i] == null)
				return i;
		}
		// Create new array
		Drawable[] temp = new Drawable[drawables.length + MAX];
		for (int i = 0; i < drawables.length; i++) {
			temp[i] = drawables[i];
		}
		int location = drawables.length;
		drawables = temp;

		return location;
	}

	public Iterator<Drawable> iterator() {
      return new DrawableIterator();
   }
	
   /**Get the number of drawables in the drawing.
    * @return The number of drawables.
    */
	public int getSize() {
		return size;
	}

	/* Private methods */
	private boolean present(Drawable s) {
		for (int i = 0; i < drawables.length; i++) {
			if (s.equals(drawables[i]))
				return true;
		}
		return false;
	}
	
   /**
    * Remove drawable object from the drawing.
    * @param d Object to remove
    */
   public void remove(Drawable d) {
		for (int i = 0; i < drawables.length; i++) {
			if (d.equals(drawables[i])) {
				drawables[i] = null;
				size--;
				return;
			}
		}
	}
	
	public void scale(int factor) {
		for (int i = 0; i < drawables.length; i++) {
			if (drawables[i] != null) {
				drawables[i].scale(factor);
			}
		}
	}
}
