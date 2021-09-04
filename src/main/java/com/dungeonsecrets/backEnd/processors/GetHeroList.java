package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.CurrentUser;
import com.dungeonsecrets.backEnd.objects.CharacterListItem;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetHeroList {

    private static ArrayList<CharacterListItem> heroes = new ArrayList<>();

    public static ArrayList<CharacterListItem> getHeroes() {

        if(heroes.isEmpty()){
            heroes = extractFromDB();
        }

        return heroes;
    }

    private static ArrayList<CharacterListItem> extractFromDB(){
        String heroQuery = "SELECT * FROM `heroes` WHERE user_id = '" + CurrentUser.getInstance().getUserId() + "'";
        System.out.println(CurrentUser.getInstance().getUserId() + " ID");
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st = connection.prepareStatement(heroQuery);
            ResultSet rs = st.executeQuery();


            while (rs.next()) {
                String character_name   = rs.getString("character_name");
                int hero_id             = rs.getInt("hero_id");
                int level               = rs.getInt("level");
                heroes.add(new CharacterListItem(character_name, hero_id, level));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return heroes;
    }

}
