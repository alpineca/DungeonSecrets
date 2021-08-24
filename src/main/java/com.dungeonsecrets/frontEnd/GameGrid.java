package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.GameGridObjects.Hero;
import com.dungeonsecrets.backEnd.GameGridObjects.Tile;
import com.dungeonsecrets.backEnd.processors.MoveProcessor;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameGrid extends JPanel{

    private static GameGrid instance = new GameGrid();
    private int gameGridRows = 21;
    private int gameGridCols = 31;
    private GameObject[][] grid;
    private GameObject hero;

    public GameGrid(){
//        int boundX = (int)((ScreenResolution.getScreenWidth())*0.05);
//        int boundY = (int)((ScreenResolution.getScreenHeight())*0.05);

        this.setOpaque(false);
        this.bootstrap();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < gameGridRows; row++) {
            for(int col = 0; col < gameGridCols; col++) {
                grid[row][col].render(g);
            }
        }
    }
    
    public static GameGrid getInstance(){ 
        return instance;
    }

    public GameObject[][] getGrid(){
        return grid;
    }

    public GameObject getHero(){
        return hero;
    }

    private void bootstrap(){
        this.generateGrid();
    }

    private GameObject[][] generateGrid(){
        grid = new GameObject[gameGridRows][gameGridCols];

        for(int row = 0; row < gameGridRows; row++) {
            for(int col = 0; col < gameGridCols; col++) {
                grid[row][col] = new Tile(row, col);
            }
        }
        spawnHero();
        return grid;
    }

    private void spawnHero(){
        grid[15][7] = new Hero(15, 7);

    }
//
//
//    @Override
//    public void keyTyped(KeyEvent e) {
////        GameObject hero         = GameGrid.getInstance().getHero();
////        GameObject[][] grid     = GameGrid.getInstance().getGrid();
//
////        MoveProcessor.doMove(hero, grid, e.getKeyChar());
////        this.repaint();
//        System.out.println("Hey");
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
}
