package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.GameGridObjects.Hero;
import com.dungeonsecrets.backEnd.GameGridObjects.Tile;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameGrid extends JPanel{

    private int gameGridRows = 21;
    private int gameGridCols = 31;
    private GameObject[][] grid;
    private GameObject hero;

    public GameGrid(){
        int boundX = (int)((ScreenResolution.getScreenWidth())*0.05);
        int boundY = (int)((ScreenResolution.getScreenHeight())*0.05);
        this.setOpaque(false);
        this.setBounds(boundX, boundY, 0, 0);
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

    public GameObject[][] getGrid(){
        return grid;
    }

    public GameObject getHero(){
        return hero;
    }

    private void bootstrap(){
        this.generateGrid();
        // this.repaint();
    }

    private GameObject[][] generateGrid(){
        grid = new GameObject[gameGridRows][gameGridCols];

        for(int row = 0; row < gameGridRows; row++) {
            for(int col = 0; col < gameGridCols; col++) {
                grid[row][col] = new Tile(row, col);
            }
        }
        return grid;
    }

    private void spawnHero(){
        grid[15][7] = new Hero(15, 7);
    }



}
