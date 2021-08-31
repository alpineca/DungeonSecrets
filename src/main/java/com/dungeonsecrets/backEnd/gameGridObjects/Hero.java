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
import com.dungeonsecrets.frontEnd.SidePanel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Hero extends GameObject{

    private static MoveDirection orientation = MoveDirection.UP;
    private Image iconToShow;
    private Image iconUp = new ImageIcon("src/main/resources/imgs/hero1Up.png").getImage();
    private Image iconDown = new ImageIcon("src/main/resources/imgs/hero1Down.png").getImage();
    private Image iconLeft = new ImageIcon("src/main/resources/imgs/hero1Left.png").getImage();
    private Image iconRight = new ImageIcon("src/main/resources/imgs/hero1Right.png").getImage();


    public Hero(int row, int col) {

        super(row, col);
        iconToShow = iconUp;
    }
    public void render(Graphics g) {
        int mapWidth    = (int)((ScreenResolution.getScreenWidth())*0.8);
        int mapHeight   = ScreenResolution.getScreenHeight();

        int tileWidth   = mapWidth/31;
        int tileHeight  = mapHeight/21;

        int tileX = this.col * tileWidth;
        int tileY = this.row * tileHeight;

        g.drawImage(iconToShow, tileX, tileY, tileWidth, tileHeight, null);
//        g.setColor(Color.black);
//        g.drawRect(tileX, tileY, tileWidth, tileHeight);

    }

    public void setOrientation(MoveDirection moveToDirection){
        if(moveToDirection.equals(MoveDirection.UP)){
            iconToShow = iconUp;
        }
        if(moveToDirection.equals(MoveDirection.DOWN)){
            iconToShow = iconDown;
        }
        if(moveToDirection.equals(MoveDirection.LEFT)){
            iconToShow = iconLeft;
        }
        if(moveToDirection.equals(MoveDirection.RIGHT)){
            iconToShow = iconRight;
        }
    }
    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public void setRow(int row){
        super.row = row;
    }
    public void setCol(int col){
        super.col = col;
    }
}

