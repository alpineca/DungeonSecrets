package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.GameSetup;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;
import com.dungeonsecrets.frontEnd.GameGrid;

import java.util.ArrayList;

public class GridObjectSelector {
    public static GameObject selectedGridObject(int row, int col){
//        GameObject selectedObject = null;
        ArrayList<Monster> monsters = GameSetup.getInstance().getMonsters();

        for(Monster thatMonster : monsters){
            int monsterRow = thatMonster.getRow();
            int monsterCol = thatMonster.getCol();

            if(monsterRow == row && monsterCol == col){
                return thatMonster;
            }
        }

        return null;

    }
}
