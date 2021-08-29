package com.dungeonsecrets.backEnd.GameInfo;

import com.dungeonsecrets.backEnd.enums.LoginResult;
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
    public void setHero(String heroName) {
        int user_id         = CurrentUser.getInstance().getUser_id();
        String selectHero   = "SELECT * FROM heroes WHERE user_id = '" + user_id +
                                                        "' and character_name = '"+ heroName +"'";
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(selectHero);

//            st.setString(1, username);
//            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                this.col                = rs.getInt("col");
                this.row                = rs.getInt("row");
                this.hero_id            = hero_id;
                this.character_name     = heroName;
                System.out.println("*****************");
                System.out.println("Hero name: " + character_name + "; Hero ID: " + hero_id);
                System.out.println("Hero col: "  + col + "; Hero Col: " + row);
                System.out.println("*****************");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}
