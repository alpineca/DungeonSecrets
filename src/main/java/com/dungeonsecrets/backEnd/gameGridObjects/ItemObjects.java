package com.dungeonsecrets.backEnd.gameGridObjects;

import com.dungeonsecrets.backEnd.enums.MoveDirection;

import java.awt.*;

public abstract class ItemObjects {

    protected int row;
    protected int col;



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


    public abstract void render(Graphics g);

    public abstract String getName();

}
