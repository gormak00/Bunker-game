package org.openjfx.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Health {
    private List<String> healthRU;
    private List<String> healthPersent;

    public Health() {
        healthRU = new ArrayList<>();
        healthRU.add("Немой");
        healthRU.add("Не ходит");
        healthRU.add("Копрофилия");
        healthRU.add("Нет руки");
        healthRU.add("Парализована половина тела");
        healthRU.add("Облысение");
        healthRU.add("Плоскостопие");
        healthRU.add("Сколиоз");
        healthRU.add("Болеет ветрянкой");
        healthRU.add("Наркоман");
        healthRU.add("Биполярное расстройство");
        healthRU.add("Аллергик");
        healthRU.add("Рак");
        healthRU.add("Косоглазие");
        healthRU.add("Туберкулез");
        healthRU.add("Диабет");
        healthRU.add("Курильщик");
        healthRU.add("Алкоголик");
        healthRU.add("Альцгеймер");
        healthRU.add("Астма");
        healthRU.add("Вич");
        healthRU.add("Ожирение");
        healthRU.add("Не слышит на (значение процента)");
        healthRU.add("Не видит на (значение процента)");
        healthRU.add("Полностью здоров");
        healthRU.add("Полностью здоров");
        healthRU.add("Полностью здоров");
        healthRU.add("Полностью здоров");
        healthRU.add("Полностью здоров");
        healthRU.add("Полностью здоров");
        healthRU.add("Полностью здоров");
        healthRU.add("Полностью здоров");

        healthPersent = new ArrayList<>();
        healthPersent.add("10%");
        healthPersent.add("25%");
        healthPersent.add("35%");
        healthPersent.add("50%");
        healthPersent.add("75%");
        healthPersent.add("100%");
    }
}
