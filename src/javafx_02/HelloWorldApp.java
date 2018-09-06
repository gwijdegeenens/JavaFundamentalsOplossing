package javafx_02;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource(
         "HelloWorld.fxml"));
      Scene scene = new Scene(root, 300, 100);
      stage.setTitle("Hello World");
      stage.setScene(scene);
      stage.show();
   }
}
