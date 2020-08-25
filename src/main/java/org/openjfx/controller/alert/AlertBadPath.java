package org.openjfx.controller.alert;

import javafx.scene.control.Alert;

public class AlertBadPath {
    public AlertBadPath() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert!");
        alert.setHeaderText("Ошибка:");
        alert.setContentText("Указан неправильный путь!");

        alert.showAndWait();
    }
}
