package org.openjfx.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class HumanQualities {
    private List<String> humanQualitiesRU;

    public HumanQualities() {
        humanQualitiesRU = new ArrayList<>();
        humanQualitiesRU.add("Альтруист");
        humanQualitiesRU.add("Аскет");
        humanQualitiesRU.add("Бережливый");
        humanQualitiesRU.add("Бесконфликтный");
        humanQualitiesRU.add("Вежливый");
        humanQualitiesRU.add("Ворчливый");
        humanQualitiesRU.add("Впечатлительный");
        humanQualitiesRU.add("Душевный");
        humanQualitiesRU.add("Жалкий");
        humanQualitiesRU.add("Жертвенный");
        humanQualitiesRU.add("Жестокий");
        humanQualitiesRU.add("Закрытый");
        humanQualitiesRU.add("Коварный");
        humanQualitiesRU.add("Конформист");
        humanQualitiesRU.add("Ленивый");
        humanQualitiesRU.add("Мелочный");
        humanQualitiesRU.add("Невежа");
        humanQualitiesRU.add("Нудный");
        humanQualitiesRU.add("Образованный");
        humanQualitiesRU.add("Оптимист");
        humanQualitiesRU.add("Пессимист");
        humanQualitiesRU.add("Тихий");
        humanQualitiesRU.add("Трус");
        humanQualitiesRU.add("Хитрый");
        humanQualitiesRU.add("Храбрый");
    }
}
