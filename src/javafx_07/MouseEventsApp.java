package javafx_07;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MouseEventsApp extends Application {

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Label l;
      Parent root = FXMLLoader.load(getClass().getResource(
         "MouseEvents.fxml"));
      Scene scene = new Scene(root);
      stage.setTitle("MouseEvents");      
      stage.setScene(scene);
      stage.show();
   }   
}
