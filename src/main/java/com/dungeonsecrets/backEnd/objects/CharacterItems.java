package com.dungeonsecrets.backEnd.objects;

public class CharacterItems {
    private int hero_id;
    private int item_id;
    private String name;
    private String type;;
    private int armor_class;

    private String damage;


    public CharacterItems(int hero_id, int item_id, String name, String type, int armorClass, String damage){
        this.hero_id         = hero_id;
        this.item_id         = item_id;
        this.name            = name;
        this.type            = type;
        this.armor_class     = armorClass;
        this.damage          = damage;

    }

    public int getHero_id() {
        return hero_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getArmor_class() {
        return armor_class;
    }

    public String getDamage() {
        return damage;
    }

}


