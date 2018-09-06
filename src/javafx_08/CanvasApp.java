package javafx_08;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CanvasApp extends Application {

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Label l;
      Parent root = FXMLLoader.load(getClass().getResource(
         "Canvas.fxml"));
      Scene scene = new Scene(root, 300, 300);
      stage.setTitle("Canvas");      
      stage.setScene(scene);
      stage.show();
   }   
   
}
