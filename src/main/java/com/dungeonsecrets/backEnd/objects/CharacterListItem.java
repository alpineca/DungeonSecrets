package com.dungeonsecrets.backEnd.objects;

public class CharacterListItem {
    private String character_name;
    private int hero_id;
    private int level;

    public CharacterListItem(String character_name, int hero_id, int level){
        this.character_name = character_name;
        this.hero_id        = hero_id;
        this.level          = level;
    }

    public int getHeroId() {
        return hero_id;
    }
    public int getLevel() {
        return level;
    }

    public String getCharacterName() {
        return character_name;
    }
}
