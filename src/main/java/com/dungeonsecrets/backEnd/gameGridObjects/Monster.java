package com.dungeonsecrets.backEnd.gameGridObjects;

import com.dungeonsecrets.backEnd.enums.MoveDirection;
import com.dungeonsecrets.backEnd.processors.APIConnect;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Monster extends GameObject {

    private String name;
    private String type;
    private int row;
    private int col;
    private int armor_class;
    private int hit_points;
    private String hit_dice;
    private String url;


    private static MoveDirection orientation = MoveDirection.UP;
    private Image iconToShow;
    private Monster instance;
    private boolean isAlive = true;

    private Image iconUp    = new ImageIcon("src/main/resources/imgs/enemyOneUp.png").getImage();
    private Image iconDown  = new ImageIcon("src/main/resources/imgs/enemyOneDown.png").getImage();
    private Image iconLeft  = new ImageIcon("src/main/resources/imgs/enemyOneLeft.png").getImage();
    private Image iconRight = new ImageIcon("src/main/resources/imgs/enemyOneRight.png").getImage();
    int maxHP       = 1000;
    int currentHp   = 1000;

    public Monster(int row, int col) {
        monsterInit(row, col);
        this.iconToShow = iconRight;
        instance = this;
    }
    public void render(Graphics g) {
        int mapWidth    = (int)((ScreenResolution.getScreenWidth())*0.8);
        int mapHeight   = ScreenResolution.getScreenHeight();

        int tileWidth   = mapWidth/31;
        int tileHeight  = mapHeight/21;

        int tileX = this.col * tileWidth;
        int tileY = this.row * tileHeight;

        g.drawImage(iconToShow, tileX, tileY, tileWidth, tileHeight, null);
    }

    @Override
    public String getName() {
        return this.name;
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

    private String getIndex(){

        JSONArray indexes = APIConnect.getMonstersIndexList();

        int randomMonsterIndex = new Random().nextInt(indexes.length());
        JSONObject innerObj = indexes.getJSONObject(randomMonsterIndex);

        return innerObj.getString("index");
    }

    private void monsterInit(int row, int col){
        String index = getIndex();
        JSONObject monster = APIConnect.getMonster(index);
        orientation = MoveDirection.DOWN;

        this.row = row;
        this.col = col;

        this.name           = monster.getString("name");
        this.type           = monster.getString("type");
        this.armor_class    = monster.getInt("armor_class");
        this.hit_points     = monster.getInt("hit_points");
        this.hit_dice       = monster.getString("hit_dice");
        this.url            = monster.getString("url");

    }
    public void kill(){
        this.isAlive = false;
        this.row     = -1;
        this.col     = -1;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public void setRow(int row){
        this.row = row;
    }
    public void setCol(int col){
        this.col = col;
    }

}
