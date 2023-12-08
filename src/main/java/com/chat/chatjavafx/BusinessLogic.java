package com.chat.chatjavafx;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class BusinessLogic {
  @FXML
  private TextField textField;

  @FXML
  private ImageView sendButton;

  @FXML
  private ScrollPane scrollPane;
  @FXML
  private VBox vBox;

  @FXML
  void sendAction(MouseEvent mouseEvent) {
    if (!textField.getText().isBlank()) {
      String txt = textField.getText();
      Text text = new Text(textField.getText());
      text.setStyle("-fx-text-fill: white");
      TextFlow textFlow = new TextFlow(text);
      textFlow.setStyle(
          "-fx-background-color: #bbcaf6;" + "-fx-font-family: 'Comic Sans MS'");
      textFlow.setPadding(new Insets(5, 10, 5, 10));
      HBox hBox = new HBox();
      hBox.setAlignment(Pos.CENTER_LEFT);
      hBox.setPadding(new Insets(5, 5, 5, 10));
      hBox.getChildren().add(textFlow);
      vBox.getChildren().add(hBox);
      scrollPane.setContent(vBox);
      textField.clear();
    }
  }

}