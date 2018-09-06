package javafx_10;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class TextEditorApp extends Application {

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource(
         "TextEditor.fxml"));
      Scene scene = new Scene(root, 300, 300);
      stage.setTitle("TextEditor");      
      stage.setScene(scene);
      stage.show();
   }
}
