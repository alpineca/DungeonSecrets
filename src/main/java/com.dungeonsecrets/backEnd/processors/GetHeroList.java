package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.CurrentUser;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetHeroList {

    private static ArrayList<String> heroes = new ArrayList<>();

    public static ArrayList<String> getHeroes() {

        if(heroes.isEmpty()){
            heroes = extractFromDB();
        }

        return heroes;
    }

    private static ArrayList<String> extractFromDB(){
        String heroQuery = "SELECT * FROM `heroes` WHERE user_id = '" + CurrentUser.getInstance().getUser_id() + "'";
        System.out.println(CurrentUser.getInstance().getUser_id() + " ID");
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st = connection.prepareStatement(heroQuery);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                heroes.add(rs.getString("character_name") + ", LVL." + rs.getInt("level"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return heroes;
    }

}
