package com.example.simplecalulatorproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainSceneController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}