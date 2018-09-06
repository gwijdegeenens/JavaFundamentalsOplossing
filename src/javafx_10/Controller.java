package javafx_10;
import java.io.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

public class Controller {
   @FXML
   private Pane pane;
   @FXML
   private TextArea textArea;
   
   private Alert aboutAlert;
   private FileChooser fileChooser;
   private Alert errorAlert;

   @FXML
   private void initialize() {
      aboutAlert = new Alert(AlertType.INFORMATION);
      aboutAlert.setTitle("About this application");
      aboutAlert.setHeaderText("Text editor V 1.0");
      aboutAlert.setContentText("Copyright Noël Vaes");
      errorAlert = new Alert(AlertType.ERROR);
      errorAlert.setTitle("An error has occured");
      errorAlert.setHeaderText("Error");
      fileChooser = new FileChooser();
      fileChooser.setTitle("Select a file");
   }

   @FXML
   private void showAbout(ActionEvent ev) {
      aboutAlert.showAndWait();
   }

   @FXML
   private void fileOpen(ActionEvent ev) {
      File file = fileChooser.showOpenDialog(pane.getScene()
         .getWindow());
      if (file != null) {
         textArea.clear();
         try (BufferedReader reader = new BufferedReader(
            new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
               textArea.appendText(line + "\n");
            }
         } catch (IOException e) {
            errorAlert.setContentText(e.getMessage());
            errorAlert.showAndWait();
         }
      }
   }

   @FXML
   private void fileSave(ActionEvent ev) {
      File file = fileChooser.showSaveDialog(pane.getScene()
         .getWindow());
      if (file != null) {
         try (BufferedWriter writer = new BufferedWriter(
            new FileWriter(file))) {
            writer.write(textArea.getText());           
         } catch (IOException e) {
            errorAlert.setContentText(e.getMessage());
            errorAlert.showAndWait();
         }
      }
   }

   @FXML
   private void exit(ActionEvent ev) {
      System.exit(0);
   }
}
