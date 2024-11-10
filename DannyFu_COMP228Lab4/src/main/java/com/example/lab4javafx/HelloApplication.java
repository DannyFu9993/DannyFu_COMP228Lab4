package com.example.lab4javafx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;




import java.awt.event.ActionListener;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 600);

        // So the resolution isn't inconsistent when I start it every time
        stage.setMinWidth(1200);
        stage.setMinHeight(600);
        stage.setMaxWidth(1200);
        stage.setMaxHeight(600);


        stage.setTitle("Lab 4 Assignment - JavaFX - Danny Fu");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }


}

