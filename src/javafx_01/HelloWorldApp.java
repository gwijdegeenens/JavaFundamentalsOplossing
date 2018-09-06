package javafx_01;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception {
      Label helloLabel = new Label("Hello World");
      helloLabel.setLayoutX(20);
      helloLabel.setLayoutY(20);
      Group root = new Group(helloLabel);
      Scene scene = new Scene(root, 300, 100);
      stage.setTitle("Hello World");
      stage.setScene(scene);
      stage.show();
   }
}
