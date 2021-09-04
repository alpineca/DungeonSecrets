package com.dungeonsecrets.backEnd.gameGridObjects;

import com.dungeonsecrets.backEnd.enums.MoveDirection;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import java.awt.*;

public class InventoryTile extends ItemObjects{


    protected int height;
    protected int width;

    public InventoryTile(int row, int col) {

        super(row, col);
        this.height = (int)((ScreenResolution.getScreenHeight())*0.046);
        this.width  = (int)((ScreenResolution.getScreenWidth())*0.026);

    }


    public void render(Graphics g) {
        int mapWidth    = (int)((ScreenResolution.getScreenWidth())*0.8);
        int mapHeight   = ScreenResolution.getScreenHeight();

//        int tileWidth   = mapWidth/width;
//        int tileHeight  = mapHeight/height;

        int tileX = this.col * width;
        int tileY = this.row * height;

        g.setColor(Color.black);
        g.drawRect(tileX, tileY, width, height);

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
