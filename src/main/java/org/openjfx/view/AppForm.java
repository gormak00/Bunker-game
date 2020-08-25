package org.openjfx.view;

import javafx.application.HostServices;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import org.openjfx.controller.GameController;
import org.openjfx.view.alert.*;
import org.openjfx.model.PlayerInfo;
import org.openjfx.sample.Main;

import java.io.File;

public class AppForm {
    private PlayerInfo playerInfo;
    private GameController gameController;
    private Label numberOfPlayers, newCharacteristic, rulesOfTheGame, path, pathExample, numberOfPlayersExample;
    private Button createGameButton, createNewCharacteristicButton, rulesOfTheGameButton;
    private TextField numberOfPlayersField, pathField;
    private ComboBox<String> allCharacteristicBox;
    private CheckBox thisDirectory;

    public Scene getMainScene(Main main) {
        playerInfo = new PlayerInfo();
        gameController = new GameController(playerInfo);
        BorderPane pane = new BorderPane();

        pane.setTop(getTitlePane());
        pane.setCenter(getMainGamePane());
        pane.setBottom(getNewCharacteristicPane());
        Scene scene = new Scene(pane, 800, 450);

        action(main);

        return scene;
    }

    private Pane getTitlePane() {
        Pane pane = new Pane();
        Text sceneTitle = new Text("Добро пожаловать в бункер");
        sceneTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        sceneTitle.setLayoutX(250.0);
        sceneTitle.setLayoutY(50.0);
        pane.getChildren().add(sceneTitle);
        return pane;
    }

    private Pane getMainGamePane() {
        Pane pane = new Pane();

        path = new Label("Введите путь, где сохранить все созданные файлы:");
        path.setFont(Font.font("Arial", FontWeight.NORMAL, 15));
        setLayout(pane, 10.0, 60.0, 250.0, path, null, null, null, null);

        pathField = new TextField();
        setLayout(pane, 430.0, 60.0, 50.0, null, null, pathField, null, null);

        thisDirectory = new CheckBox("Сохранить в директории, где находится программа");
        setLayout(pane, 430.0, 90.0, 50.0, null, null, null, null, thisDirectory);


        pathExample = new Label("Пример пути: C:/SomeDir/");
        pathExample.setFont(Font.font("Arial", FontWeight.EXTRA_LIGHT, 10));
        setLayout(pane, 10.0, 90.0, 250.0, pathExample, null, null, null, null);

        numberOfPlayers = new Label("Введите количество игроков для игры:");
        numberOfPlayers.setFont(Font.font("Arial", FontWeight.NORMAL, 15));
        setLayout(pane, 10.0, 130.0, 250.0, numberOfPlayers, null, null, null, null);

        numberOfPlayersExample = new Label("Минимальное количество человек 7, максимальное 14");
        numberOfPlayersExample.setFont(Font.font("Arial", FontWeight.EXTRA_LIGHT, 10));
        setLayout(pane, 10.0, 160.0, 250.0, numberOfPlayersExample, null, null, null, null);

        numberOfPlayersField = new TextField();
        setLayout(pane, 330.0, 130.0, 30.0, null, null, numberOfPlayersField, null, null);

        createGameButton = new Button("Создать игру");
        createGameButton.setFont(Font.font("Arial", FontWeight.NORMAL, 15));
        setLayout(pane, 330.0, 160.0, 30.0, null, createGameButton, null, null, null);

        newCharacteristic = new Label("Создать отдельную характеристику");
        newCharacteristic.setFont(Font.font("Arial", FontWeight.NORMAL, 15));
        setLayout(pane, 10.0, 250.0, 250.0, newCharacteristic, null, null, null, null);

        ObservableList<String> allCharacteristics = FXCollections.observableArrayList(
                "Профессия",
                "Биологические характеристики",
                "Здоровье",
                "Тяжесть болезни",
                "Хобби",
                "Фобии",
                "Дополнительная информация",
                "Багаж",
                "Человеческие качества",
                "Карта спец возможностей",
                "Катастрофа");
        allCharacteristicBox = new ComboBox<String>(allCharacteristics);
        allCharacteristicBox.setValue("Выбрите характеристику");
        setLayout(pane, 10.0, 280.0, 250.0, null, null, null, allCharacteristicBox, null);

        createNewCharacteristicButton = new Button("Создать характеристику");
        createNewCharacteristicButton.setFont(Font.font("Arial", FontWeight.NORMAL, 15));
        setLayout(pane, 310.0, 250.0, 30.0, null, createNewCharacteristicButton, null, null, null);

        return pane;
    }

    private void setLayout(Pane pane, Double layoutX, Double layoutY, Double maxWidth, Label label, Button button, TextField textField, ComboBox<String> comboBox, CheckBox checkBox) {
        if (label != null) {
            label.setLayoutX(layoutX);
            label.setLayoutY(layoutY);
            label.maxWidth(maxWidth);
            pane.getChildren().add(label);
        } else if (button != null) {
            button.setLayoutX(layoutX);
            button.setLayoutY(layoutY);
            button.maxWidth(maxWidth);
            pane.getChildren().add(button);
        } else if (textField != null) {
            textField.setLayoutX(layoutX);
            textField.setLayoutY(layoutY);
            textField.maxWidth(maxWidth);
            pane.getChildren().add(textField);
        } else if (comboBox != null) {
            comboBox.setLayoutX(layoutX);
            comboBox.setLayoutY(layoutY);
            comboBox.maxWidth(maxWidth);
            pane.getChildren().add(comboBox);
        } else if (checkBox != null) {
            checkBox.setLayoutX(layoutX);
            checkBox.setLayoutY(layoutY);
            checkBox.maxWidth(maxWidth);
            pane.getChildren().add(checkBox);
        }
    }

    private Pane getNewCharacteristicPane() {
        GridPane pane = new GridPane();
        rulesOfTheGame = new Label("Правила игры: ");
        pane.add(rulesOfTheGame, 0, 0);

        rulesOfTheGameButton = new Button("Открыть");
        pane.add(rulesOfTheGameButton, 1, 0);

        return pane;
    }

    private void action(Main main) {
        createGameButton.setOnAction(t -> {
            String path;
            if (numberOfPlayersField.getText().isEmpty() || (pathField.getText().isEmpty() && !thisDirectory.isSelected())) {
                new AlertEmptyFields();
            } else if(Integer.parseInt(numberOfPlayersField.getText()) < 7 || Integer.parseInt(numberOfPlayersField.getText()) > 14) {
                new AlertIncorrectValue();
            } else {
                if(thisDirectory.isSelected()){
                    path = "./";
                } else path = pathField.getText();
                playerInfo = new PlayerInfo();
                gameController.createGame(path, Integer.parseInt(numberOfPlayersField.getText()), playerInfo);
                new AlertGameWasCreated();
            }
        });

        createNewCharacteristicButton.setOnAction(t -> {
            String path;
            if (allCharacteristicBox.getValue().equals("Выбрите характеристику") || (pathField.getText().isEmpty() && !thisDirectory.isSelected())) {
                new AlertEmptyCharOrPath();
            } else {
                if(thisDirectory.isSelected()){
                    path = "./";
                } else path = pathField.getText();
                gameController.createCharacteristic(allCharacteristicBox.getValue(), path);
                new AlertCharacteristicWasCreated();
            }
        });

        rulesOfTheGameButton.setOnAction(t -> {
            File file = new File("./src/main/resources/RulesOfTheBunker.pdf");
            HostServices hostServices = main.getHostServices();
            hostServices.showDocument(file.getAbsolutePath());
        });
    }
}
