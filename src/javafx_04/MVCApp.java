package javafx_04;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class MVCApp extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource(
         "MVC.fxml"));
      Scene scene = new Scene(root, 300, 100);
      stage.setTitle("Model View Controller");
      stage.setScene(scene);
      stage.show();
   }
}
