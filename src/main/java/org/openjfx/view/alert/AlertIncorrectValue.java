package org.openjfx.view.alert;

import javafx.scene.control.Alert;

public class AlertIncorrectValue {
    public AlertIncorrectValue(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert!");
        alert.setHeaderText("Ошибка:");
        alert.setContentText("Неверное количество играющих!\nМинимальное количество человек 7, максимальное 14");

        alert.showAndWait();
    }
}
