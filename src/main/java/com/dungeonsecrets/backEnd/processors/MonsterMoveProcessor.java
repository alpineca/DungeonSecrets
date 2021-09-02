package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.GameSetup;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;
import com.dungeonsecrets.frontEnd.GameGrid;

import java.util.ArrayList;
import java.util.Random;

public class MonsterMoveProcessor {

    public static void moveAllMonsters(){
        ArrayList<Monster> monsters = GameSetup.getInstance().getMonsters();
        GameObject[][] grid         = GameGrid.getInstance().getGrid();

        for(Monster monster : monsters){
            int randomMoveKeyCode = 666;
            MoveProcessor.doMoveMonsters(monster, grid, randomMoveKeyCode);
        }


    }

    private static void randomMove(Monster monster, GameObject[][] grid){

    }
}
