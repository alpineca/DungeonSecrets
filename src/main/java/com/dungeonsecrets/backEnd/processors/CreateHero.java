package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.CurrentUser;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateHero {

    public static void addToDB(String name, String heroClass) throws SQLException {
        String createHeroQuery  = "INSERT INTO `heroes` (`hero_id`, " +
                "`user_id`, " +
                "`row`, " +
                "`col`, " +
                "`character_name`, " +
                "`class`, " +
                "`level`, " +
                "`background`, " +
                "`player_name`, " +
                "`race`, " +
                "`alignment`, " +
                "`expirience_points`, " +
                "`strength`," +
                "`dexterity`, " +
                "`constitution`, " +
                "`intelligence`, " +
                "`wisdom`, " +
                "`charisma`, " +
                "`strength_modify`," +
                "`dexterity_modify`," +
                "`constitution_modify`, " +
                "`intelligence_modify`, " +
                "`wisdom_modify`, " +
                "`charisma_modify`, " +
                "`strength_saving_throw`, " +
                "`dexterity_saving_throw`, " +
                "`constitution_saving_throw`, " +
                "`intelligence_saving_throw`, " +
                "`wisdom_saving_throw`, " +
                "`charisma_saving_throw`, " +
                "`acrobatics`, " +
                "`animal_handling`, " +
                "`arcana`, " +
                "`athletics`, " +
                "`deception`, " +
                "`history`, " +
                "`insight`, " +
                "`intimidation`, " +
                "`investigation`, " +
                "`medicine`, " +
                "`nature`, " +
                "`perception`, " +
                "`performance`, " +
                "`persuasion`, " +
                "`religion`, " +
                "`sleight_of_hand`, " +
                "`stealth`, " +
                "`survival`, " +
                "`armor_class`, " +
                "`initiative`, " +
                "`speed`, " +
                "`current_hit_points`, " +
                "`hit_dice`, " +
                "`equipment`) VALUES " +
                "(NULL, ?, '5', '10', ?, ?, " +
                "'12', '5', '4', '6', '4', '5', '8', " +
                "'7', '9', '55', '1', '1', '2', '2', " +
                "'1', '0', '32', '2', '5', '4', '5', " +
                "'6', '5', '2', '4', '5', '5', '7', '8', " +
                "'7', '5', '4', '5', '9', '8', '7', '21', " +
                "'2', '5', '5', '5', '5', '4', '78', " +
                "'8', '9', '8', '7')";

        try {
            int userId = CurrentUser.getInstance().getUser_id();
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement pst = connection.prepareStatement(createHeroQuery);


            pst.setString(1, userId + "");
            pst.setString(2, name);
            pst.setString(3, heroClass);
            pst.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
