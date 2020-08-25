package org.openjfx.view.alert;

import javafx.scene.control.Alert;

public class AlertGameWasCreated {
    public AlertGameWasCreated() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Congratulation!");
        alert.setHeaderText("Поздравляю:");
        alert.setContentText("Ваша игра создана.");

        alert.showAndWait();
    }
}
