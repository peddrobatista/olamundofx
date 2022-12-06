package com.example.olamundofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblMensagem;
    @FXML
    private Button btnClick;

    @FXML
    protected void onHelloButtonClick() {
        lblMensagem.setText("Welcome to JavaFX Application!");
    }

    public void clicouBotao(ActionEvent actionEvent) {
        lblMensagem.setText("Olá Mundo!!");
    }
}