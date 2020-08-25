package org.openjfx.view.alert;

import javafx.scene.control.Alert;

public class AlertEmptyFields {
    public AlertEmptyFields(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert!");
        alert.setHeaderText("Ошибка:");
        alert.setContentText("Не все поля заполнены!");

        alert.showAndWait();
    }
}
