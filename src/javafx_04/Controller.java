package javafx_04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
   private int count;
   @FXML
   private Label label;
   @FXML
   private Button button;

   @FXML
   private void buttonPressed(ActionEvent ev) {
      count++;
      label.setText("Count: " + count);
   }
   
   @FXML
   private void reset(ActionEvent ev) {
      count = 0;
      label.setText("Count: " + count);
   }
   
}
