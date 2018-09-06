package javafx_07;
import javafx.fxml.FXML;
import javafx.scene.input.*;
import javafx.scene.text.Text;

public class MouseEventsController {
   @FXML
   private Text text;

   @FXML
   private void mouseMoved(MouseEvent ev) {
      text.setText(String.format("Mouse moved (%.0f,%.0f)", ev
         .getX(), ev.getY()));
   }

   @FXML
   private void mouseClicked(MouseEvent ev) {
      text.setText(String.format(
         "Mouse button clicked %s at (%.0f,%.0f)", ev.getButton(),
         ev.getX(), ev.getY()));
   }

   @FXML
   private void mouseEntered(MouseEvent ev) {
      text.setText(String.format("Mouse entered at (%.0f,%.0f)", ev
         .getX(), ev.getY()));
   }

   @FXML
   private void mouseExited(MouseEvent ev) {
      text.setText(String.format("Mouse exited (%.0f,%.0f)", ev
         .getX(), ev.getY()));
   }
}
