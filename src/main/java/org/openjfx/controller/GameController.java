package org.openjfx.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openjfx.controller.alert.AlertBadPath;
import org.openjfx.controller.alert.AlertListIsEmpty;
import org.openjfx.model.PlayerInfo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Getter
@NoArgsConstructor
public class GameController {
    private PlayerInfo playerInfo;

    public GameController(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    public void createGame(String path, int numberOfPlayers, PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
        File file = new File(path);
        if(file.isDirectory() && path.charAt(path.length()-1) == '/') {
            createCatastrophe(path);
            createAllRoles(path, numberOfPlayers);
        } else new AlertBadPath();
    }

    private void createCatastrophe(String path) {
        try (FileOutputStream fos = new FileOutputStream(path + "Catastrophe.txt", false)) {
            byte[] buffer = catastropheAndBunkerInfo().getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            new AlertBadPath();
            System.out.println(ex.getMessage());
        }
    }

    private String catastropheAndBunkerInfo(){
        return "Ваша катастрофа: " + extractInfoByKeyFromList(this.playerInfo.getCatastrophe().getCatastropheRU()) +
                "\n\n\n\n" + fullBunkerInfo();
    }

    private String fullBunkerInfo(){
        String fullBunkerInfo = "Площадь бункера: " + extractInfoByKeyFromList(this.playerInfo.getBunker().getAreaRU()) +
                "\nВремя пребывания в бункере: " + extractInfoByKeyFromList(this.playerInfo.getBunker().getTimeInsideRU()) +
                "\nСостояние бункера: " + extractInfoByKeyFromList(this.playerInfo.getBunker().getConditionRU()) +
                "\nОснащение бункера: " + extractInfoByKeyFromList(this.playerInfo.getBunker().getEquipmentRU()) +
                ", " + extractInfoByKeyFromList(this.playerInfo.getBunker().getEquipmentRU()) +
                "\nДополнительные предметы в бункере: " + extractInfoByKeyFromList(this.playerInfo.getBunker().getItemsRU()) +
                ", " + extractInfoByKeyFromList(this.playerInfo.getBunker().getItemsRU()) +
                ", " + extractInfoByKeyFromList(this.playerInfo.getBunker().getItemsRU()) +
                "\nВредители в бункере: " + extractInfoByKeyFromList(this.playerInfo.getBunker().getVerminRU());
        return fullBunkerInfo;
    }

    private void createAllRoles(String path, int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            try (FileOutputStream fos = new FileOutputStream(path + (i + 1) + ".txt", false)) {
                byte[] buffer = fullPlayerInfo().getBytes();
                fos.write(buffer, 0, buffer.length);
            } catch (IOException ex) {
                new AlertBadPath();
                System.out.println(ex.getMessage());
            }
        }
    }

    private String fullPlayerInfo() {
        String fullPlayerInfo = "Профессия: " + extractInfoByKeyFromList(this.playerInfo.getProfessions().getProfessionRU()) +
                "\nБиологические характеристики: " + getInfoByKeyFromList(this.playerInfo.getGenderNAge().getGenderRU()) +
                ", " + getInfoByKeyFromList(this.playerInfo.getGenderNAge().getAgeRU()) + ", " + getInfoByKeyFromList(this.playerInfo.getGenderNAge().getBioGenderRU()) +
                "\nЗдоровье: " + extractInfoByKeyFromList(this.playerInfo.getHealth().getHealthRU()) +
                "\nТяжесть болезни (если она допустима): " + getInfoByKeyFromList(this.playerInfo.getHealth().getHealthPersent()) +
                "\nХобби: " + extractInfoByKeyFromList(this.playerInfo.getHobby().getHobbyRU()) +
                "\nФобии: " + extractInfoByKeyFromList(this.playerInfo.getPhobias().getPhobiasRU()) +
                "\nДополнительная информация: " + extractInfoByKeyFromList(this.playerInfo.getAdditionalInfo().getAdditionalInfoRU()) +
                "\nБагаж: " + extractInfoByKeyFromList(this.playerInfo.getBaggage().getBaggageRU()) +
                "\nЧеловеческие качества: " + extractInfoByKeyFromList(this.playerInfo.getHumanQualities().getHumanQualitiesRU()) +
                "\nКарта специальных возможностей №1: " + extractInfoByKeyFromList(this.playerInfo.getSpecialAbilities().getSpecialAbilitiesRU()) +
                "\nКарта специальных возможностей №2: " + extractInfoByKeyFromList(this.playerInfo.getSpecialAbilities().getSpecialAbilitiesRU());
        return fullPlayerInfo;
    }

    private String extractInfoByKeyFromList(List<String> list) {
        if(!list.isEmpty()) {
            int index = (int) ((Math.random() * list.size()));
            String info = list.get(index);
            list.remove(index);
            return info;
        } else {
            new AlertListIsEmpty();
            return null;
        }
    }

    private String getInfoByKeyFromList(List<String> list) {
        if(!list.isEmpty()) {
        int index = (int) ((Math.random() * list.size()));
        return list.get(index);
        } else {
            new AlertListIsEmpty();
            return null;
        }
    }

    public void createCharacteristic(String characteristic, String path) {
        switch (characteristic) {
            case "Профессия": {
                printCharacteristic("Ваша новая профессия: " + extractInfoByKeyFromList(this.playerInfo.getProfessions().getProfessionRU()), path);
                break;
            }
            case "Здоровье": {
                printCharacteristic("Ваше новое здоровье: " + extractInfoByKeyFromList(this.playerInfo.getHealth().getHealthRU()), path);
                break;
            }
            case "Тяжесть болезни": {
                printCharacteristic("Ваша новая тяжесть болезни: " + extractInfoByKeyFromList(this.playerInfo.getHealth().getHealthPersent()), path);
                break;
            }
            case "Биологические характеристики": {
                printCharacteristic("Ваши новые биологические характеристики: " + getInfoByKeyFromList(this.playerInfo.getGenderNAge().getGenderRU()) +
                        ", " + getInfoByKeyFromList(this.playerInfo.getGenderNAge().getAgeRU()) +
                        ", " + getInfoByKeyFromList(this.playerInfo.getGenderNAge().getBioGenderRU()), path);
                break;
            }
            case "Хобби": {
                printCharacteristic("Ваше новое хобби: " + extractInfoByKeyFromList(this.playerInfo.getHobby().getHobbyRU()), path);
                break;
            }
            case "Фобии": {
                printCharacteristic("Ваша новая фобия: " + extractInfoByKeyFromList(this.playerInfo.getPhobias().getPhobiasRU()), path);
                break;
            }
            case "Дополнительная информация": {
                printCharacteristic("Ваша новая дополнительная информация: " + extractInfoByKeyFromList(this.playerInfo.getAdditionalInfo().getAdditionalInfoRU()), path);
                break;
            }
            case "Багаж": {
                printCharacteristic("Ваш новый багаж: " + extractInfoByKeyFromList(this.playerInfo.getBaggage().getBaggageRU()), path);
                break;
            }
            case "Человеческие качества": {
                printCharacteristic("Ваши новые человеческие качества: " + extractInfoByKeyFromList(this.playerInfo.getHumanQualities().getHumanQualitiesRU()), path);
                break;
            }
            case "Карта спец возможностей": {
                printCharacteristic("Ваша новая карта специальных возможностей: " + extractInfoByKeyFromList(this.playerInfo.getSpecialAbilities().getSpecialAbilitiesRU()), path);
                break;
            }
            case "Катастрофа": {
                printCharacteristic("Ваша новая катастрофа: " + extractInfoByKeyFromList(this.playerInfo.getCatastrophe().getCatastropheRU()), path);
                break;
            }
            case "Бункер": {
                printCharacteristic(fullBunkerInfo(), path);
                break;
            }
        }
    }

    private void printCharacteristic(String characteristic, String path) {
        try (FileOutputStream fos = new FileOutputStream(path + "NewCharacteristic.txt", false)) {
            byte[] buffer = characteristic.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            new AlertBadPath();
            System.out.println(ex.getMessage());
        }
    }

}
