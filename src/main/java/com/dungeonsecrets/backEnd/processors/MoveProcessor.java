package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.enums.MoveDirection;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;
import com.dungeonsecrets.backEnd.gameGridObjects.Tile;
import com.dungeonsecrets.frontEnd.GameGrid;

import java.awt.event.KeyEvent;
import java.util.Random;

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

        System.out.println(" *******  *********  ******** ");
        System.out.println(hero.getName() + " moved to:");
        System.out.println("ROW: " + lastHeroRow + " , COL: " + lastHeroCol);

        if(newHeroCol < 0 || newHeroCol > gameGridCols) {
            newHeroCol = lastHeroCol;
        }
        if(newHeroRow < 0 || newHeroRow > gameGridRows) {
            newHeroRow = lastHeroRow;
        }

        boolean isFreeTile = grid[newHeroRow][newHeroCol] instanceof Tile;

        if(isFreeTile){
            grid[lastHeroRow][lastHeroCol] = new Tile(lastHeroRow, lastHeroCol);

            hero.setCol(newHeroCol);
            hero.setRow(newHeroRow);

            grid[newHeroRow][newHeroCol] = hero;
        }
    }

    public static void doMoveMonsters(Monster monster, GameObject[][] grid, int keyCode){
        int gameGridRows    = grid.length - 1;
        int gameGridCols    = (grid[0].length) - 1;;

        direction           = selectDirection(keyCode);

        int lastMonsterRow     = monster.getRow();
        int lastMonsterCol     = monster.getCol();

        int newMonsterRow      = lastMonsterRow;
        int newMonsterCol      = lastMonsterCol;

        if(direction.equals(MoveDirection.LEFT)){
            newMonsterCol = lastMonsterCol - 1;
            monster.setOrientation(direction);
        }
        if(direction.equals(MoveDirection.RIGHT)){
            newMonsterCol = lastMonsterCol + 1;
            monster.setOrientation(direction);
        }
        if(direction.equals(MoveDirection.UP)){
            newMonsterRow = lastMonsterRow - 1;
            monster.setOrientation(direction);
        }
        if(direction.equals(MoveDirection.DOWN)){
            newMonsterRow = lastMonsterRow + 1;
            monster.setOrientation(direction);
        }

        System.out.println(" *******  *********  ******** ");
        System.out.println(monster.getName() + " moved to:");
        System.out.println("ROW: " + lastMonsterRow + " , COL: " + lastMonsterCol);

        if(newMonsterCol < 0 || newMonsterCol > gameGridCols) {
            newMonsterCol = lastMonsterCol;
        }
        if(newMonsterRow < 0 || newMonsterRow > gameGridRows) {
            newMonsterRow = lastMonsterRow;
        }

        boolean isFreeTile = grid[newMonsterRow][newMonsterCol] instanceof Tile;

        if(isFreeTile){
            grid[lastMonsterRow][lastMonsterCol] = new Tile(lastMonsterRow, lastMonsterCol);

            monster.setCol(newMonsterCol);
            monster.setRow(newMonsterRow);

            grid[newMonsterRow][newMonsterCol] = monster;
        }
        GameGrid.getInstance().repaint();
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
        if(keyCode == 666){
            int randomDirection = new Random().nextInt(4);
            if(randomDirection == 0){
                return MoveDirection.LEFT;
            }
            if(randomDirection == 1){
                return MoveDirection.RIGHT;
            }
            if(randomDirection == 2){
                return MoveDirection.UP;
            }
            if(randomDirection == 3){
                return MoveDirection.DOWN;
            }
        }
        return MoveDirection.IDKNW;
    }



}
