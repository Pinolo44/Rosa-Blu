package it.unicam.cs.mpgc.rpg130406.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RosaBluApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Rosa Blu");
        stage.setScene(new Scene(new StackPane(new Label("Rosa Blu")), 640, 400));
        stage.show();
    }
}