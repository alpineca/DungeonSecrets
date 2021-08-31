package com.dungeonsecrets.backEnd.processors;

public class Character {

    private String characterName;
    private String characterClass;

    public Character(String characterName, String characterClass) {
        this.characterName = characterName;
        this.characterClass = characterClass;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterNameAndClass(String characterName, String characterClass) {
        this.characterName = characterName;
        this.characterClass = characterClass;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    @Override
    public String toString() {
        return characterName;
    }
}
