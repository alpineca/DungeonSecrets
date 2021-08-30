package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.CurrentUser;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetHeroList {
//    private static int user_id = CurrentUser.getInstance().getUser_id();
//
//    private static String heroQuery = "SELECT * FROM heroes WHERE user_id = '"+ user_id +"'";
////    public static ArrayList<String> heroes = new ArrayList<>();
    private static ArrayList<String> heroes = new ArrayList<>();

    //Query = select * from heroes where user_id = 77

    public static ArrayList<String> getHeroes() {

//        int user_id = CurrentUser.getInstance().getUser_id();
//        int userId = CurrentUser.getInstance().getUser_id();
        String heroQuery = "SELECT * FROM `heroes` WHERE user_id = '" + CurrentUser.getInstance().getUser_id() + "'";
    System.out.println(CurrentUser.getInstance().getUser_id());
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st = connection.prepareStatement(heroQuery);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
//                String resString = rs.getString("character_name")
//                        + "--" + rs.getString("class")
//                        + "--" + rs.getInt("level")
//                        + "--" + rs.getInt("background")
//                        + "--" + rs.getInt("player_name")
//                        + "--" + rs.getInt("race")
//                        + "--" + rs.getInt("alignment")
//                        + "--" + rs.getInt("experience_points")
//                        + "--" + rs.getInt("strength")
//                        + "--" + rs.getInt("dexterity")
//                        + "--" + rs.getInt("constitution");

                heroes.add(rs.getString("character_name") + ", LVL." + rs.getInt("level"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//
//        if (heroes.isEmpty()) {
//            heroes.add("Clerko");
//            heroes.add("Soccre");
//        }

            return heroes;
        }

}
