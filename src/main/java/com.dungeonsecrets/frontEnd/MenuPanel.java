package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class MenuPanel {

    private static JLayeredPane menuPanel(){

        JLayeredPane menuPanel = new JLayeredPane();
        menuPanel.setBackground(Color.yellow);

        menuPanel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.50), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.50));
        menuPanel.setOpaque(true);
        return menuPanel;

    }
    public static JLayeredPane getMenuPanel (){
        return  menuPanel();
    }



    private static JLayeredPane menuMenu(){

        JLayeredPane menuPanel = new JLayeredPane();
        menuPanel.setBackground(Color.blue);
        menuPanel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.50), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.50));
        menuPanel.setOpaque(true);
        return menuPanel;

    }
    public static JLayeredPane getMenuMenu (){
        return  menuMenu();
    }



//    private static JButton optionsButton(){
//
//        JButton options = new JButton();
//
//        options.setText("Options");
//        options.setHorizontalTextPosition(JLabel.CENTER);
//        options.setVerticalTextPosition(JLabel.BOTTOM);
//
//        options.setBounds((int) ((ScreenResolution.getScreenWidth())*0.90), (int) ((ScreenResolution.getScreenHeight())*0.50), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.05));
//
//        return options;
//    }
//    public static JButton getOptionsButton() {
//        return optionsButton();
//    }

}
