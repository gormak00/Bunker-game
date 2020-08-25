package org.openjfx.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AdditionalInfo {
    private List<String> additionalInfoRU;

    public AdditionalInfo() {
        additionalInfoRU = new ArrayList<>();
        additionalInfoRU.add("Бывший чиновник");
        additionalInfoRU.add("Гадает по картам");
        additionalInfoRU.add("Гоняет самогон");
        additionalInfoRU.add("Дрессировщик животных");
        additionalInfoRU.add("Знает азбуку Морзе");
        additionalInfoRU.add("Знает язык жестов");
        additionalInfoRU.add("Ограбил банк");
        additionalInfoRU.add("Побывал в космосе");
        additionalInfoRU.add("Посмотрел 200 аниме");
        additionalInfoRU.add("Проходил курсы сексолога");
        additionalInfoRU.add("Прошел курсы по выживанию"); 
        additionalInfoRU.add("Прошел курсы программиста"); 
        additionalInfoRU.add("Служил в армии"); 
        additionalInfoRU.add("Смотрел фильмы про апокалипсис");
        additionalInfoRU.add("Спас детей из пожара"); 
        additionalInfoRU.add("Увлекается охотой");
        additionalInfoRU.add("Увлекается радиотехникой");
        additionalInfoRU.add("Умеет варить пиво");
        additionalInfoRU.add("Умеет делать оружие");
        additionalInfoRU.add("Умеет ориентироваться по звездам");
        additionalInfoRU.add("Умеет показывать карточные фокусы");
        additionalInfoRU.add("Чемпион мира по пейнтболу");
        additionalInfoRU.add("Черный пояс по каратэ");
        additionalInfoRU.add("Прочитал всего Гарри Поттера"); 
        additionalInfoRU.add("Читал книги про зомби");
        additionalInfoRU.add("Резидент камеди");
    }
}
