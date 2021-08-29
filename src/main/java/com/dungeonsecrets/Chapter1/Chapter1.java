package com.dungeonsecrets.Chapter1;

import com.dungeonsecrets.backEnd.gameGridObjects.Enemy;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;

import java.util.ArrayList;

public class Chapter1 {

    ArrayList<GameObject> monsters = new ArrayList<>();
    Enemy monster1 = new Enemy(5, 10);
    Enemy monster2 = new Enemy(7, 12);
    Enemy monster3 = new Enemy(12, 10);


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
