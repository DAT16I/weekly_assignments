package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    Button testButton;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        testButton.setText("This is my new text");

    }

}
