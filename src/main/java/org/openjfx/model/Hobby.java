package org.openjfx.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Hobby {
    private List<String> hobbyRU;

    public Hobby() {
        hobbyRU = new ArrayList<>();
        hobbyRU.add("Бег");
        hobbyRU.add("Бодибилдинг");
        hobbyRU.add("Футбол");
        hobbyRU.add("Картинг");
        hobbyRU.add("Скалолазание");
        hobbyRU.add("Резьба по дереву");
        hobbyRU.add("Стрельба");
        hobbyRU.add("Восточные танцы");
        hobbyRU.add("Плавание");
        hobbyRU.add("Садоводство");
        hobbyRU.add("Паркур");
        hobbyRU.add("Тусовщик");
        hobbyRU.add("Астрономия");
        hobbyRU.add("Бокс");
        hobbyRU.add("Фермерство");
        hobbyRU.add("Аниме");
        hobbyRU.add("Борьба");
        hobbyRU.add("Политика");
        hobbyRU.add("Шахматы");
        hobbyRU.add("Роспись пряников");
        hobbyRU.add("Буккарвинг");
        hobbyRU.add("Охота");
        hobbyRU.add("Поиск сокровищ");
        hobbyRU.add("Скаутинг");
        hobbyRU.add("Увлекается химией");
        hobbyRU.add("Увлекается биологией");
    }
}
