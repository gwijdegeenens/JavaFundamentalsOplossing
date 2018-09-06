package javafx_08;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class DrawingController {
   @FXML
   private Canvas canvas;
   private GraphicsContext gc;
   private double x;
   private double y;
   

   @FXML
   public void initialize() {
      gc = canvas.getGraphicsContext2D();
      gc.setStroke(Color.BLACK);
      gc.setLineWidth(1);
      gc.setFill(Color.WHITE);
      clear();
   }

   @FXML
   private void mousePressed(MouseEvent ev) {
      x = ev.getX();
      y= ev.getY();
   }

   @FXML
   private void mouseDragged(MouseEvent ev) {
      gc.strokeLine(x, y, ev.getX(), ev.getY());
      x = ev.getX();
      y = ev.getY();
   }

   @FXML
   private void mouseReleased(MouseEvent ev) {
      gc.strokeLine(x, y, ev.getX(), ev.getY());
   }

   @FXML
   private void clear(ActionEvent ev) {
      clear();
   }

   private void clear() {
      gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
   }
}
