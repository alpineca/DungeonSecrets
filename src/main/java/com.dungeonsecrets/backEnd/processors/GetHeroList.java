package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.utility.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetHeroList {

    private static final String heroQuery = "SELECT * FROM heroes WHERE user_id = '77'";
    public static ArrayList<String> heroes = new ArrayList<>();

    public static ArrayList<String> getHeroes() {

        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st  = connection.prepareStatement(heroQuery);
            ResultSet rs          = st.executeQuery();

            while (rs.next()) {
                String resString = rs.getString("character_name")
                          + "--" + rs.getString("class")
                          + "--" + rs.getInt("level")
                          + "--" + rs.getInt("background")
                          + "--" + rs.getInt("player_name")
                          + "--" + rs.getInt("race")
                          + "--" + rs.getInt("alignment")
                          + "--" + rs.getInt("experience_points")
                          + "--" + rs.getInt("strength")
                          + "--" + rs.getInt("dexterity")
                          + "--" + rs.getInt("constitution");
                heroes.add(resString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return heroes;
    }
}