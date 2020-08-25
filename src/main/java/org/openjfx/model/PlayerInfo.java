package org.openjfx.model;

import lombok.Getter;

@Getter
public class PlayerInfo {
    private Catastrophe catastrophe;
    private AdditionalInfo additionalInfo;
    private GenderNAge genderNAge;
    private Health health;
    private Hobby hobby;
    private HumanQualities humanQualities;
    private Phobias phobias;
    private Professions professions;
    private SpecialAbilities specialAbilities;
    private Baggage baggage;
    private Bunker bunker;

    public PlayerInfo() {
        catastrophe = new Catastrophe();
        additionalInfo = new AdditionalInfo();
        genderNAge = new GenderNAge();
        health = new Health();
        hobby = new Hobby();
        humanQualities = new HumanQualities();
        phobias = new Phobias();
        professions = new Professions();
        specialAbilities = new SpecialAbilities();
        baggage = new Baggage();
        bunker = new Bunker();
    }
}
