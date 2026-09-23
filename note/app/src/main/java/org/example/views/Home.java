package org.example.views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Home {
  public static void homePage(Stage stage, Scene scene) {
    stage.setTitle("My JavaFX App");
    stage.setScene(scene);
    stage.show();
  }
}
