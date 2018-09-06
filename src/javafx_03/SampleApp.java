package javafx_03;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class SampleApp extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource(
         "Sample.fxml"));
      Scene scene = new Scene(root, 200, 150);
      stage.setTitle("Sample");
      stage.setScene(scene);
      stage.show();
   }
}

