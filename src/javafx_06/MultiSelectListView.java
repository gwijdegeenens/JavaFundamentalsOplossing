package javafx_06;

import javafx.scene.control.*;

public class MultiSelectListView<T> extends ListView<T> {
   public MultiSelectListView() {
      getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
   }
}
