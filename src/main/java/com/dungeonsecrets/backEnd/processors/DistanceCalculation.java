package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.CurrentHero;
import com.dungeonsecrets.backEnd.GameInfo.GameSetup;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;

public class DistanceCalculation {

    public static boolean isCloseToHero(Monster selectedMonster){
        GameObject character        = GameSetup.getInstance().getCharacter();
        int minimalDistanceToAttack = 2;

        int charRow             = character.getRow();
        int charCol             = character.getCol();

        int monsterRow          = selectedMonster.getRow();
        int monsterCol          = selectedMonster.getCol();

        int rowsDistance        = rowsDistance(charRow, monsterRow);
        int colsDistance        = colsDistance(charCol, monsterCol);


        int distanceCoeficient  = rowsDistance + colsDistance;
        if(distanceCoeficient <= minimalDistanceToAttack){
            return true;
        }
//
//        System.out.println("***************************");
//        System.out.println("Monster possition:   " +monsterRow+"/"+monsterCol);
//        System.out.println("Character possition: " +charRow+"/"+charCol);
//        System.out.println("Distance: " +distanceCoeficient);


        return false;
    }

    private static int rowsDistance(int a, int b){
        return Math.abs((a - b));
    }
    private static int colsDistance(int a, int b){
        return Math.abs((a - b));
    }
}
