package org.openjfx.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GenderNAge {
    private List<String> genderRU;
    private List<String> ageRU;
    private List<String> bioGenderRU;

    public GenderNAge() {
        genderRU = new ArrayList<>();
        genderRU.add("Женщина");
        genderRU.add("Мужчина");

        ageRU = new ArrayList<>();
        ageRU.add("16");
        ageRU.add("18");
        ageRU.add("20");
        ageRU.add("21");
        ageRU.add("25");
        ageRU.add("27");
        ageRU.add("30");
        ageRU.add("33");
        ageRU.add("35");
        ageRU.add("40");
        ageRU.add("43");
        ageRU.add("45");
        ageRU.add("49");
        ageRU.add("50");
        ageRU.add("55");
        ageRU.add("61");
        ageRU.add("67");
        ageRU.add("69");
        ageRU.add("70");
        ageRU.add("75");
        ageRU.add("88");
        ageRU.add("90");

        bioGenderRU = new ArrayList<>();
        bioGenderRU.add("Чайлдфри");
        bioGenderRU.add("Чайлдфри");
        bioGenderRU.add("Чайлдфри");
        bioGenderRU.add("Гомосексуал");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
        bioGenderRU.add("");
    }
}
