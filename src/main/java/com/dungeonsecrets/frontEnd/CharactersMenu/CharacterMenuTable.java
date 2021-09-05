package com.dungeonsecrets.frontEnd.CharactersMenu;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class CharacterMenuTable {

    private static String data[][]   ={{"Name","Class","Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma"},
                                        {"Geralt","Witcher","99","99","99","99","99","99"},
                                        {"Click","The","Main","Menu","Logo","1","0","Times"}};

    private static String column[] ={"Name","Class","Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma"};

    private static JTable table    = new JTable(data,column);

    private static JTable table(){

        table.setBounds((int)(ScreenResolution.getScreenWidth()*0.162),(int)(ScreenResolution.getScreenHeight()*0.0),(int)(ScreenResolution.getScreenWidth()*0.85),(int)(ScreenResolution.getScreenHeight()*0.50));
        table.setFont(new Font("Immortal", Font.PLAIN,30));
        table.setForeground(new Color(111,0,0));
        table.setBackground(new Color(196,153,80));
        table.setRowHeight((int)(ScreenResolution.getScreenWidth()*0.05));
        table.setEnabled(false);
        table.setOpaque(false);

        return table;
    }

    public static JTable getTable(){
        return table();
    }


}
