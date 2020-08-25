package org.openjfx.view.alert;

import javafx.scene.control.Alert;

public class AlertCharacteristicWasCreated {
    public AlertCharacteristicWasCreated() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Congratulation!");
        alert.setHeaderText("Поздравляю:");
        alert.setContentText("Новая характеристика создана.");

        alert.showAndWait();
    }
}
