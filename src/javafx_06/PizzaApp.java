package javafx_06;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class PizzaApp extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource(
         "Pizza.fxml"));
      Scene scene = new Scene(root, 500, 300);
      stage.setTitle("Pizza");      
      stage.setScene(scene);
      stage.show();
   }
}
