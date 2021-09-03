package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.enums.Character;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteCharacter {


    public static Character deleteHeroes(int user_id, int hero_id, int unique_item_id) {
        String heroQuery = "DELETE FROM `heroes` WHERE hero_id = ? and user_id = ?";
//        String itemQuery = "DELETE FROM `td_items` WHERE hero_id = ? and unique_item_id = ?";

        try {
            Connection connection = ConnectDatabase.getConnection();

            PreparedStatement st  = connection.prepareStatement(heroQuery);
            st.setInt(1, hero_id);
            st.setInt(2, user_id);

//            PreparedStatement stm  = connection.prepareStatement(itemQuery);
//            st.setInt(1, hero_id);
//            st.setInt(2, unique_item_id);

            int sqlHeroResult = st.executeUpdate();
//            int sqlItemResult = stm.executeUpdate();

            if (sqlHeroResult >= 1) {
                System.out.println("Deleted from database "+ hero_id);
                return Character.SUCCESSFUL_DELETE;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Character.DELETE_FAILED;
    }
}


