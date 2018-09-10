package graphics;

import javafx.scene.canvas.GraphicsContext;
/**Drawable objects
 * 
 * @author No&euml;l Vaes
 * @version 1.0
 */
public interface Drawable extends Scaleable{
   /**Draw the object.
    * @param g Graphical context.
    */
	public void draw(GraphicsContext g);
}
