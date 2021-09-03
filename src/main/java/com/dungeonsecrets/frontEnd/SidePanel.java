package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class SidePanel {

    private static String selectedEnemyName = "";


    //Side Panel
    private static JPanel sidePanel() {

        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(Color.DARK_GRAY);
        sidePanel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.00), (int) ((ScreenResolution.getScreenWidth())*0.20), (int) ((ScreenResolution.getScreenHeight())*1.00));
        sidePanel.setLayout(null);

        CharacterPanel enemyPanel = new CharacterPanel();
        sidePanel.add(enemyPanel);

        return sidePanel;

    }

    public static void setEnemyName(String name){
        selectedEnemyName = name;
    }


    public static JPanel getSidePanel() {
        return sidePanel();
    }



    //HERO PANEL
//    private static JLabel heroLabel(){
//
//        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/imgs/hero_avatar.png")));
//
//        JLabel heroLabel = new JLabel();
////        heroLabel.setText("Hero Name");
////        heroLabel.setHorizontalTextPosition(JLabel.CENTER);
////        heroLabel.setVerticalTextPosition(JLabel.BOTTOM);
//        heroLabel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945),(int) ((ScreenResolution.getScreenHeight())*0.01),(int) ((ScreenResolution.getScreenWidth())*0.05),(int) ((ScreenResolution.getScreenHeight())*0.11));
//
//        heroLabel.setIcon(icon);
//
//        return heroLabel;
//    }
//    public static JLabel getHeroLabel() {
//        return heroLabel();
//    }
//
//    private static JLabel heroName(){
//
//        JLabel heroName = new JLabel();
//
//        heroName.setText(CurrentHero.getInstance().getCharacter_name());
//        heroName.setFont(new Font("Immortal",Font.BOLD,20));
//        heroName.setForeground(new Color(245, 170, 7));
//        heroName.setBounds((int) ((ScreenResolution.getScreenWidth())*0.82),(int) ((ScreenResolution.getScreenHeight())*0.04),(int) ((ScreenResolution.getScreenWidth())*0.05),(int) ((ScreenResolution.getScreenHeight())*0.11));
//
//        return heroName;
//    }
//    public static JLabel getHeroName() {
//        return heroName();
//    }
//
//    private static JProgressBar heroHealth(){
//        JProgressBar heroHealth = new JProgressBar(0,100);  //Min/Max Health
//
//        heroHealth.setValue(100);
//        heroHealth.setBounds((int) ((ScreenResolution.getScreenWidth())*0.82),(int) ((ScreenResolution.getScreenHeight())*0.02),(int) ((ScreenResolution.getScreenWidth())*0.12),(int) ((ScreenResolution.getScreenHeight())*0.023));
//        heroHealth.setStringPainted(true);
//        heroHealth.setForeground(Color.red);
//        heroHealth.setBackground(Color.black);
//
//        return heroHealth;
//    }
//    public static JProgressBar getHeroHealth() {
//        return heroHealth();
//    }
//
//    private static JProgressBar heroResources(){
//        JProgressBar heroResources = new JProgressBar(0,100);
//        heroResources.setValue(100);
//        heroResources.setBounds((int) ((ScreenResolution.getScreenWidth())*0.82),(int) ((ScreenResolution.getScreenHeight())*0.05),(int) ((ScreenResolution.getScreenWidth())*0.12),(int) ((ScreenResolution.getScreenHeight())*0.023));
//        heroResources.setStringPainted(true);
//        heroResources.setForeground(Color.blue);
//        heroResources.setBackground(Color.black);
//
//        return heroResources;
//    }
//    public static JProgressBar getHeroResources() {
//        return heroResources();
//    }

}