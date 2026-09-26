package org.example.views;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Home {
  public void homePage(Stage stage) {
    Label label = new Label("Hello, JavaFX!");
    Button mybtn = new Button("test");
    mybtn.setId("btn");
    mybtn.setOnAction(event -> {
      label.setText("Button was clicked!");
    });

    FlowPane root = new FlowPane(10, 10);
    root.setAlignment(Pos.CENTER);

    root.getChildren().addAll(label, mybtn);

    Scene scene = new Scene(root, 400, 300);
    scene.getStylesheets().add(getClass().getResource("css/Home.css").toExternalForm());
    stage.setTitle("My JavaFX App");
    stage.setScene(scene);
    stage.show();
  }
}
