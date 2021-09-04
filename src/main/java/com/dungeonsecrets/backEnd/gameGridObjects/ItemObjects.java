package com.dungeonsecrets.backEnd.gameGridObjects;

import com.dungeonsecrets.backEnd.enums.MoveDirection;

import java.awt.*;

public abstract class ItemObjects {

    protected int row;
    protected int col;
    private String name;
    private String type;
    private String dmg;
    private int AC;
    private boolean isEquipped = false;

    private Image icon;


    public ItemObjects(int row, int col) {

        this.row    = row;
        this.col    = col;

    }


    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }

    public void setRow(int row){
        this.row = row;
    }
    public void setCol(int col){
        this.col = col;
    }

    public String getDmg() {
        return dmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDmg(String dmg) {
        this.dmg = dmg;
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

    public abstract void render(Graphics g);

    public abstract String getName();

}
