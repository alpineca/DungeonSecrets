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
package com.dungeonsecrets.backEnd.GameGridObjects;


import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.frontEnd.SidePanel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Hero extends GameObject{

    public Hero(int row, int col) {

        super(row, col);

    }
    Image icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/imgs/hero.png"))).getImage();
    public void render(Graphics g) {
        int tileWidth   = (int)((ScreenResolution.getScreenWidth())*0.82)/31;
        int tileHeight  = ScreenResolution.getScreenHeight()/21;

        int tileX = this.col * tileWidth;
        int tileY = this.row * tileHeight;


        System.out.println("test:"+tileWidth);
        System.out.println("test:"+tileHeight);
        System.out.println("test:"+tileX);
        System.out.println("test:"+tileY);


        g.setColor(Color.black);
        g.fillRect(tileX, tileY, tileWidth, tileHeight);
        g.drawImage(icon, tileX, tileY, tileWidth, tileHeight, null);
        g.setColor(Color.black);
        g.drawRect(tileX, tileY, tileWidth, tileHeight);

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

