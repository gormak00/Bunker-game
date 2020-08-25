package org.openjfx.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Baggage {
    private List<String> baggageRU;

    public Baggage() {
        baggageRU = new ArrayList<>();
        baggageRU.add("3 рации");
        baggageRU.add("АК-47 + патроны к нему");
        baggageRU.add("Аккумуляторные баттареи");
        baggageRU.add("Блок сигарет");
        baggageRU.add("Гитара");
        baggageRU.add("Диджейский пульт");
        baggageRU.add("Запас шоколадок на две недели");
        baggageRU.add("Змея");
        baggageRU.add("Книга рецептов");
        baggageRU.add("Комиксы");
        baggageRU.add("Компьютер");
        baggageRU.add("Медикаменты");
        baggageRU.add("Музыкальная колонка");
        baggageRU.add("Набор защитных масок");
        baggageRU.add("Набор сталярных инструментов");
        baggageRU.add("Паук");
        baggageRU.add("Попугай");
        baggageRU.add("Презервативы");
        baggageRU.add("Ребенок девочка (5 месяцев)");
        baggageRU.add("Ребенок мальчик(3 года)");
        baggageRU.add("Саженцы картофеля");
        baggageRU.add("Семена пшеницы");
        baggageRU.add("Скрипка");
        baggageRU.add("Собака");
        baggageRU.add("Таблетки от аллергии");
        baggageRU.add("Ферма грибов");
        baggageRU.add("Эротические журналы");
        baggageRU.add("Фермерский инкубатор с яйцами");
        baggageRU.add("Огромный запас инсулина");
        baggageRU.add("Костюм хим-защиты");
        baggageRU.add("Тактический военный рюкзак, битком набитый тушёнкой");
        baggageRU.add("Соли, спайсы и спиды");
        baggageRU.add("Акваланг");
    }
}
