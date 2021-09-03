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


import com.dungeonsecrets.backEnd.GameInfo.CurrentUser;
import com.dungeonsecrets.backEnd.enums.MoveDirection;
import com.dungeonsecrets.backEnd.objects.characterListItem;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Character extends GameObject{
    private String character_name;
    private int hero_id;
    private int row;
    private int col;
    private int hitPoints;
    private int armorPoints;
    private int maxHP       = 1000;
    private int currentHp   = 1000;

    private static MoveDirection orientation = MoveDirection.UP;
    private Image iconToShow;
    private Image iconUp    = new ImageIcon("src/main/resources/imgs/hero1Up.png"   ).getImage();
    private Image iconDown  = new ImageIcon("src/main/resources/imgs/hero1Down.png" ).getImage();
    private Image iconLeft  = new ImageIcon("src/main/resources/imgs/hero1Left.png" ).getImage();
    private Image iconRight = new ImageIcon("src/main/resources/imgs/hero1Right.png").getImage();

    private static Character instance;


    private Character(){

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

    public static Character getInstance(){
        if(instance == null){
            instance = new Character();
        }
        return instance;
    }

    public void setHero(characterListItem hero) {
        int user_id         = CurrentUser.getInstance().getUserId();
        System.out.println("Current user id: " + user_id);
        String selectHero   = "SELECT * FROM heroes WHERE hero_id = '" + hero.getHeroId() +
                "' and character_name = '"+ hero.getCharacterName() +"'";
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(selectHero);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                this.row                = rs.getInt("row");
                this.col                = rs.getInt("col");
                this.hero_id            = rs.getInt("hero_id");
                this.character_name     = rs.getString("character_name");
                this.setOrientation(orientation);


            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }

    @Override
    public String getName() {
        return this.character_name;
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
        this.row = row;
    }
    public void setCol(int col){
        this.col = col;
    }
}

