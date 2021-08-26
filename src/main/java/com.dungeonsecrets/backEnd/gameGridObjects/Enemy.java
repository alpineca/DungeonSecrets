package com.dungeonsecrets.backEnd.gameGridObjects;

import com.dungeonsecrets.backEnd.enums.MoveDirection;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.frontEnd.SidePanel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Enemy extends GameObject{

    private static MoveDirection orientation = MoveDirection.UP;
    private Image iconToShow;
//    private Image iconUp    = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("imgs/enemyOneUp.png"))).getImage();
//    private Image iconDown  = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("imgs/enemyOneDown.png"))).getImage();
//    private Image iconLeft  = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("imgs/enemyOneLeft.png"))).getImage();
//    private Image iconRight = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("imgs/enemyOneRight.png"))).getImage();

    private Image iconUpp = new ImageIcon("src/main/resources/imgs/enemyOneUp.png").getImage();
    private Image iconDownn = new ImageIcon("src/main/resources/imgs/enemyOneDown.png").getImage();
    private Image iconLeftt = new ImageIcon("src/main/resources/imgs/enemyOneLeft.png").getImage();
    private Image iconRightt = new ImageIcon("src/main/resources/imgs/enemyOneRight.png").getImage();

    public Enemy(int row, int col) {

        super(row, col);
        //iconToShow = iconUp;
        iconToShow = iconUpp;
    }
    public void render(Graphics g) {
        int mapWidth    = (int)((ScreenResolution.getScreenWidth())*0.8);
        int mapHeight   = ScreenResolution.getScreenHeight();

        int tileWidth   = mapWidth/31;
        int tileHeight  = mapHeight/21;

        int tileX = this.col * tileWidth;
        int tileY = this.row * tileHeight;


        System.out.println("test:"+tileWidth);
        System.out.println("test:"+tileHeight);
        System.out.println("test:"+tileX);
        System.out.println("test:"+tileY);

        g.drawImage(iconToShow, tileX, tileY, tileWidth, tileHeight, null);
        g.setColor(Color.black);
        g.drawRect(tileX, tileY, tileWidth, tileHeight);

    }

    public void setOrientation(MoveDirection moveToDirection){
        if(moveToDirection.equals(MoveDirection.UP)){
            iconToShow = iconUpp;
        }
        if(moveToDirection.equals(MoveDirection.DOWN)){
            iconToShow = iconDownn;
        }
        if(moveToDirection.equals(MoveDirection.LEFT)){
            iconToShow = iconLeftt;
        }
        if(moveToDirection.equals(MoveDirection.RIGHT)){
            iconToShow = iconRightt;
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
