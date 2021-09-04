package com.dungeonsecrets.chapters;

import com.dungeonsecrets.backEnd.gameGridObjects.Item;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;

import javax.swing.*;
import java.util.ArrayList;

public class Chapter1 {

    //TODO: Spawn conflict with character for fix
    ArrayList<Monster> monsters = new ArrayList<>();
    Monster monster1 = new Monster(5, 12);
    Monster monster2 = new Monster(8, 12);
    Monster monster3 = new Monster(12, 6);
    Monster monster4 = new Monster(11, 5);
    Monster monster5 = new Monster(3, 5);
    Monster monster6 = new Monster(20, 1);
    Monster monster7 = new Monster(18, 11);
    Monster monster8 = new Monster(4, 14);
    Monster monster9 = new Monster(7, 15);
    Monster monster10 = new Monster(16, 7);

    ArrayList<Item> items = new ArrayList<>();
    Item steelDagger = new Item(0,0);


    public Chapter1(){

        items.add(steelDagger);
        steelDagger.setDmg("1d4");
        steelDagger.setName("Steel Dagger");
        steelDagger.setIcon(new ImageIcon("src/main/resources/imgs/Steel_Dagger.png").getImage());

        //TODO: Array and loop
        monsters.add(monster1);
        monster1.setMaxHP(600);
        monster1.setCurrentHp(600);

        monsters.add(monster2);
        monster2.setMaxHP(700);
        monster2.setCurrentHp(700);

        monsters.add(monster3);
        monster3.setMaxHP(800);
        monster3.setCurrentHp(800);

        monsters.add(monster4);
        monster4.setMaxHP(600);
        monster4.setCurrentHp(600);

        monsters.add(monster5);
        monster5.setMaxHP(700);
        monster5.setCurrentHp(700);

        monsters.add(monster6);
        monster6.setMaxHP(800);
        monster6.setCurrentHp(800);

        monsters.add(monster7);
        monster7.setMaxHP(600);
        monster7.setCurrentHp(600);

        monsters.add(monster8);
        monster8.setMaxHP(700);
        monster8.setCurrentHp(700);

        monsters.add(monster9);
        monster9.setMaxHP(800);
        monster9.setCurrentHp(800);

        monsters.add(monster10);
        monster10.setMaxHP(800);
        monster10.setCurrentHp(800);
    }

    public ArrayList<Monster> getMonsters(){
        return monsters;
    }

    public ArrayList<Item> getItems(){
        return items;
    }





}
