package com.dungeonsecrets.Chapter1;

import com.dungeonsecrets.backEnd.gameGridObjects.Enemy;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.frontEnd.GameGrid;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Chapter1 {

    ArrayList<GameObject> monsters = new ArrayList<>();
    Enemy monster1 = new Enemy(5, 10);
    Enemy monster2 = new Enemy(7, 12);
    Enemy monster3 = new Enemy(12, 10);


    public Chapter1(){
        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);
    }

    public ArrayList<GameObject> getMonsters(){
        return monsters;
    }




}
