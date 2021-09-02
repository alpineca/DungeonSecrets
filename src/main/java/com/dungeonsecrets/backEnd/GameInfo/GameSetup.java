package com.dungeonsecrets.backEnd.GameInfo;

import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;

import java.util.ArrayList;

public class GameSetup {

    private ArrayList<Monster> monsters;
    private Monster focusedMonster;
//    private GameObject[][] grid;
    private static GameSetup instance;

    private GameSetup(){

    }

    public void setMonsters(ArrayList<Monster> monsters){
        this.monsters = monsters;
    }

    public ArrayList<Monster> getMonsters(){
        return this.monsters;
    }

//    public void setGrid(GameObject[][] grid){
//        this.grid = grid;
//    }
//
//    public GameObject[][] getGrid(){
//        return this.grid;
//    }

    public Monster getMonster(){
        return focusedMonster;
    }

    public static GameSetup getInstance(){
        if(instance == null){
            instance = new GameSetup();
        }

        return instance;
    }

    public void focusMonster(Monster thatMonster){
        focusedMonster = thatMonster;

        System.out.println("Focused monster: " + focusedMonster.getName());
    }
}
