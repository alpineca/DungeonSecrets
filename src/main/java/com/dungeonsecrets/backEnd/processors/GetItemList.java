package com.dungeonsecrets.backEnd.processors;

import com.dungeonsecrets.backEnd.GameInfo.CurrentUser;
import com.dungeonsecrets.backEnd.gameGridObjects.Character;
import com.dungeonsecrets.backEnd.objects.CharacterItems;
import com.dungeonsecrets.backEnd.utility.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetItemList {

    private static ArrayList<CharacterItems> items = new ArrayList<>();

    public static ArrayList<CharacterItems> getItems() {

        if(items.isEmpty()){
            items = extractFromDB();
        }
        return items;
    }

    private static ArrayList<CharacterItems> extractFromDB(){
        String itemQuery =  "SELECT * FROM `tm_items` WHERE hero_id = '" + Character.getInstance().getHeroId() + "'";
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement st = connection.prepareStatement(itemQuery);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int hero_id           = rs.getInt("hero_id");
                int item_id           = rs.getInt("item_id");
                String name           = rs.getString("name");
                String type           = rs.getString("type");
                int armor_class       = rs.getInt("armor_class");
                String damage         = rs.getString("damage");
                items.add(new CharacterItems(hero_id, item_id, name, type, armor_class, damage));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }
}
