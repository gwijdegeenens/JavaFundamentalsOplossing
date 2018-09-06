package javafx_09;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
   @FXML
   private TextField name;
   
   @FXML
   private PasswordField password;
   
   @FXML
   private Label message;
   
   @FXML
   private void logon(ActionEvent ev) {
      name.getStyleClass().remove("error");
      password.getStyleClass().remove("error");
      
      if(name.getText().isEmpty()) {
         message.setText("Please enter your name!");
         name.getStyleClass().add("error");
      } else if (password.getText().isEmpty()) {
         message.setText("Enter your password!");                  
         password.getStyleClass().add("error");
      } else if(!name.getText().equals(password.getText())) {
         message.setText("Invalid password!");
         password.getStyleClass().add("error");
      }
   }
      
}
