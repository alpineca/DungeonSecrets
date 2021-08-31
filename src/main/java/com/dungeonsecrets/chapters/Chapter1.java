package com.dungeonsecrets.chapters;

import com.dungeonsecrets.backEnd.gameGridObjects.Monster;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;

import java.util.ArrayList;

public class Chapter1 {

    ArrayList<GameObject> monsters = new ArrayList<>();
    Monster monster1 = new Monster(5, 10);
    Monster monster2 = new Monster(7, 12);
    Monster monster3 = new Monster(12, 10);


    public Chapter1(){
        monsters.add(monster1);
        monster1.setMaxHP(600);
        monster1.setCurrentHp(600);
        monsters.add(monster2);
        monster2.setMaxHP(700);
        monster2.setCurrentHp(700);
        monsters.add(monster3);
        monster3.setMaxHP(800);
        monster3.setCurrentHp(800);
    }

    public ArrayList<GameObject> getMonsters(){
        return monsters;
    }




}
