package com.chat.chatjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Presentation extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(Presentation.class.getResource("Index.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 441, 528);
    stage.setTitle("Chat UI");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}