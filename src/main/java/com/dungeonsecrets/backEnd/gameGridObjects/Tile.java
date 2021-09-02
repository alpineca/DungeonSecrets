//package GameBoardObjects;
//
//public class Tile extends GameObject{
//
//    protected int height;
//    protected int width;
//
//    public Tile(int row, int col) {
//
//        super(row, col);
//        this.height = 10;
//        this.width = 10;
//
//    }
//
//    public  int getHeight(){
//        return this.height;
//    }
//    public  int getWidth(){
//        return this.width;
//    }
//}
package com.dungeonsecrets.backEnd.gameGridObjects;

import com.dungeonsecrets.backEnd.enums.MoveDirection;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import java.awt.*;

public class Tile extends GameObject{
    private int row;
    private int col;
    private int height;
    private int width;

    public Tile(int row, int col) {
        this.row = row;
        this.col = col;
        this.height = 10;
        this.width  = 10;
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getCol() {
        return this.col;
    }

    @Override
    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public void setOrientation(MoveDirection moveToDirection) {

    }

    public void render(Graphics g) {
        int mapWidth    = (int)((ScreenResolution.getScreenWidth())*0.8);
        int mapHeight   = ScreenResolution.getScreenHeight();

        int tileWidth   = mapWidth/31;
        int tileHeight  = mapHeight/21;


        int tileX = this.col * tileWidth;
        int tileY = this.row * tileHeight;

//FOR GRID COORDINATES DISPLAY
//
//        int placementCoefficientX = (tileWidth / 2) - 10;
//        int placementCoefficientY = (tileHeight / 2) + 7;
//        g.setColor(Color.gray);
//        g.drawRect(tileX, tileY, tileWidth, tileHeight);
//        g.setColor(Color.BLACK);
//        g.setFont(new Font("", Font.BOLD, 12));
//        g.drawString("" +this.row + "/" + this.col, tileX + placementCoefficientX, tileY  + placementCoefficientY);

    }

    @Override
    public String getName() {
        return null;
    }

    public  int getHeight(){
        return this.height;
    }
    public  int getWidth(){
        return this.width;
    }
}
