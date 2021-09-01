package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.GameSetup;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;

import java.util.ArrayList;
import java.util.Random;

public class MonsterMoveProcessor {

    public static void moveAllMonsters(){
        ArrayList<Monster> monsters = GameSetup.getInstance().getMonsters();
        GameObject[][] grid         = GameSetup.getInstance().getGrid();

        for(Monster monster : monsters){
            int keyCode = 666;
            MoveProcessor.doMoveMonsters(monster, grid, keyCode);
        }


    }

//    private static int pickRandomDirection(){
//        //Keycodes
//        int keyCode[] = {65, 68, 83, 87};
//        int i         = new Random().nextInt(4);
//
//        return keyCode[i];
//    }

    private static void randomMove(Monster monster, GameObject[][] grid){

    }
}
