package org.openjfx.controller.alert;

import javafx.scene.control.Alert;

public class AlertListIsEmpty {
    public AlertListIsEmpty() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert!");
        alert.setHeaderText("Ошибка:");
        alert.setContentText("Количество различных характеристик закончилось!");

        alert.showAndWait();
    }
}
