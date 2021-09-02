package com.dungeonsecrets.backEnd.gameGridObjects;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class Item extends ItemObjects{

    private String name;
    private String type;
    private String dmg;
    private int AC;

    //temp
    Image icon = new ImageIcon("src/main/resources/imgs/Steel_Dagger.png").getImage();

    public Item(int row, int col){

        super(row,col);

    }




    @Override
    public void render(Graphics g) {

        int width    = 50;
        int height   = 50;

//        int tileWidth   = mapWidth/31;
//        int tileHeight  = mapHeight/21;

        int tileX = this.col * width;
        int tileY = this.row * height;

        g.drawImage(icon, tileX, tileY, width, height, null);

    }

    @Override
    public String getName() {
        return null;
    }
}
