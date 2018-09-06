package javafx_09;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class RegisterApp extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource(
         "Register.fxml"));
      Scene scene = new Scene(root, 300, 200);
      stage.setTitle("Register");
      stage.setScene(scene);
      stage.show();
   }
}
