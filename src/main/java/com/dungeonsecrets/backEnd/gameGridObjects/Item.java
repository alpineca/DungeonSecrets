package com.dungeonsecrets.backEnd.gameGridObjects;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class Item extends ItemObjects{

    private int row;
    private int col;
    private String name;
    private String type;
    private String dmg;
    private int AC;
    private boolean isEquipped = false;

    //temp
    private Image icon;

    public Item(int row, int col){

        super(row,col);
        this.row = row;
        this.col = col;

    }




    @Override
    public void render(Graphics g) {

        int height = (int)((ScreenResolution.getScreenHeight())*0.0546);
        int width  = (int)((ScreenResolution.getScreenWidth())*0.031);

//        int tileWidth   = mapWidth/31;
//        int tileHeight  = mapHeight/21;

        int tileX = this.col * width;
        int tileY = this.row * height;

        g.drawImage(icon, tileX, tileY, width, height, null);

    }

    @Override
    public String getName() {
        return name;
    }

    public String getDmg() {
        return dmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getIcon() {
        return icon;
    }

    public void setIcon(Image icon) {
        this.icon = icon;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }

    public void setDmg(String dmg) {
        this.dmg = dmg;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }
}
