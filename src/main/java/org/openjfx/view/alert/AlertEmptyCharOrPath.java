package org.openjfx.view.alert;

import javafx.scene.control.Alert;

public class AlertEmptyCharOrPath {
    public AlertEmptyCharOrPath(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert!");
        alert.setHeaderText("Ошибка:");
        alert.setContentText("Не выбрана характеристика или не указан путь!");

        alert.showAndWait();
    }
}
