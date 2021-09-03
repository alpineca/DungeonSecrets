package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameInfo.CurrentHero;
import com.dungeonsecrets.backEnd.GameInfo.GameSetup;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SidePanel {

    private static String selectedEnemyName = "";


    //Side Panel
    private static JPanel sidePanel() {

        JPanel sidePanel = new JPanel();

        sidePanel.setBackground(Color.DARK_GRAY);
        sidePanel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.00), (int) ((ScreenResolution.getScreenWidth())*0.20), (int) ((ScreenResolution.getScreenHeight())*1.00));
        sidePanel.setLayout(null);

        return sidePanel;

    }

    public static void setEnemyName(String name){
        selectedEnemyName = name;
    }


    public static JPanel getSidePanel() {
        return sidePanel();
    }


}