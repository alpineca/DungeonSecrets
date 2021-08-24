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

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import java.awt.*;

public class Tile extends GameObject{

    protected int height;
    protected int width;

    public Tile(int row, int col) {

        super(row, col);
        this.height = 10;
        this.width  = 10;

    }

    public void render(Graphics g) {
        int mapWidth    = (int)((ScreenResolution.getScreenWidth())*0.8);
        int mapHeight   = ScreenResolution.getScreenHeight();

        int tileWidth   = mapWidth/31;
        int tileHeight  = mapHeight/21;

        int tileX = this.col * tileWidth;
        int tileY = this.row * tileHeight;

        g.setColor(Color.darkGray);
        g.drawRect(tileX, tileY, tileWidth, tileHeight);

    }

    public  int getHeight(){
        return this.height;
    }
    public  int getWidth(){
        return this.width;
    }
}
