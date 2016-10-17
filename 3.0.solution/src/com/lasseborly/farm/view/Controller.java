package com.lasseborly.farm.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button btnSend;

    @FXML
    TextArea txtChat;

    @FXML
    TextField txtInput;

    @FXML
    private void clickSend(ActionEvent event) {
        sendMessage();
    }

    private void sendMessage() {
        txtChat.setText(txtChat.getText() + "\n Lasse: " + txtInput.getText());
        txtInput.setText("");
        txtChat.selectPositionCaret(txtChat.getLength());
        txtChat.deselect();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        txtInput.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case ENTER:
                    sendMessage();
                    break;
            }
        });

    }
}
