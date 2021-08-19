package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.GameGridObjects.Hero;
import com.dungeonsecrets.backEnd.GameGridObjects.Tile;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class GameGrid extends JPanel {

    private int gameGridRows = 20;
    private int gameGridCols = 31;
    private GameObject[][] grid;

    public GameGrid(){
        int boundX = (int)((ScreenResolution.getScreenWidth())*0.05);
        int boundY = (int)((ScreenResolution.getScreenHeight())*0.05);
        this.setOpaque(false);
//        this.setAlignmentX(Component.CENTER_ALIGNMENT);
//        this.setAlignmentY(Component.CENTER_ALIGNMENT);
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

        grid[15][7] = new Hero(15, 7);

        return grid;
    }


}
