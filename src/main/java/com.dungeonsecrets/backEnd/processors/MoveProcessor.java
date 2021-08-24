package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.enums.MoveDirection;

import java.awt.event.KeyEvent;

public class MoveProcessor {
    private static MoveDirection direction;


    public static void doMove(GameObject hero, GameObject[][] grid, int keyCode){
        int gameGridRows    = grid.length - 1;
        int gameGridCols    = (grid[0].length) - 1;;

        direction           = selectDirection(keyCode);

        int lastHeroRow     = hero.getRow();
        int lastHeroCol     = hero.getCol();

        int newHeroRow      = lastHeroRow;
        int newHeroCol      = lastHeroCol;

        if(direction.equals(MoveDirection.LEFT)){
            newHeroCol = lastHeroCol - 1;
            hero.setOrientation(direction);
        }
        if(direction.equals(MoveDirection.RIGHT)){
            newHeroCol = lastHeroCol + 1;
            hero.setOrientation(direction);
        }
        if(direction.equals(MoveDirection.UP)){
            newHeroRow = lastHeroRow - 1;
            hero.setOrientation(direction);
        }
        if(direction.equals(MoveDirection.DOWN)){
            newHeroRow = lastHeroRow + 1;
            hero.setOrientation(direction);
        }

        System.out.println(lastHeroCol + " " + lastHeroRow);
        if(newHeroCol < 0 || newHeroCol > gameGridCols) {
            newHeroCol = lastHeroCol;
        }
        if(newHeroRow < 0 || newHeroRow > gameGridRows) {
            newHeroRow = lastHeroRow;
        }

        hero.setCol(newHeroCol);
        hero.setRow(newHeroRow);
    }

    private static MoveDirection selectDirection(int keyCode) {
        if(keyCode == KeyEvent.VK_A){
            return MoveDirection.LEFT;
        }
        if(keyCode == KeyEvent.VK_D){
            return MoveDirection.RIGHT;
        }
        if(keyCode == KeyEvent.VK_W){
            return MoveDirection.UP;
        }
        if(keyCode == KeyEvent.VK_S){
            return MoveDirection.DOWN;
        }
        return MoveDirection.IDKNW;
    }



}
