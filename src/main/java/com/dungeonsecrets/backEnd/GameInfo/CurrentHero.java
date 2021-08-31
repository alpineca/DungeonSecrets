package com.dungeonsecrets.backEnd.GameInfo;

import com.dungeonsecrets.backEnd.enums.LoginResult;
import com.dungeonsecrets.backEnd.objects.characterListItem;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;
import com.dungeonsecrets.backEnd.utility.PasswordHash;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrentHero {
    private String character_name;
    private int hero_id;

    private int row;
    private int col;

    private static CurrentHero instance = new CurrentHero();


    private CurrentHero(){

    }

    public void heroInit(String character_name, int hero_id, int row, int col){
        this.character_name = character_name;
        this.hero_id = hero_id;
        this.row = row;
        this.col = col;
    }

    public static CurrentHero getInstance(){
        return instance;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public int getHero_id() {
        return hero_id;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public void setRow(int newRow) {
        this.row = newRow;
    }
    public void setCol(int newCol) {
        this.col = newCol;
    }
    public void setHero(characterListItem hero) {
        int user_id         = CurrentUser.getInstance().getUser_id();
        System.out.println("Current user id: " + user_id);
        String selectHero   = "SELECT * FROM heroes WHERE hero_id = '" + hero.getHeroId() +
                                                        "' and character_name = '"+ hero.getCharacterName() +"'";
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(selectHero);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                this.col                = rs.getInt("col");
                this.row                = rs.getInt("row");
                this.hero_id            = rs.getInt("hero_id");
                this.character_name     = hero.getCharacterName();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }

    public void saveHero(int row, int col) {
        String selectHero   = "UPDATE `heroes` SET `row` = '" + row
                            + "', `col` = '" + col + "' WHERE `hero_id` = '"
                            + this.hero_id + "'";
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(selectHero);

            st.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
