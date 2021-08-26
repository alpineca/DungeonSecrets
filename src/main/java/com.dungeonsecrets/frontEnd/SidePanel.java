package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class SidePanel {


    //Side Panel
    private static JPanel sidePanel() {

        JPanel sidePanel = new JPanel();

        sidePanel.setBackground(Color.gray);
        sidePanel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.00), (int) ((ScreenResolution.getScreenWidth())*0.20), (int) ((ScreenResolution.getScreenHeight())*1.00));
       // sidePanel.setBounds(1570, 0, 370, 1080);
        sidePanel.setLayout(null);

        return sidePanel;

    }


    public static JPanel getSidePanel() {
        return sidePanel();
    }



    //HERO PANEL
    private static JLabel heroLabel(){

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/imgs/hero_avatar.png")));

        JLabel heroLabel = new JLabel();
//        heroLabel.setText("Hero Name");
//        heroLabel.setHorizontalTextPosition(JLabel.CENTER);
//        heroLabel.setVerticalTextPosition(JLabel.BOTTOM);
        heroLabel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945),(int) ((ScreenResolution.getScreenHeight())*0.01),(int) ((ScreenResolution.getScreenWidth())*0.05),(int) ((ScreenResolution.getScreenHeight())*0.11));

        heroLabel.setIcon(icon);

        return heroLabel;
    }
    public static JLabel getHeroLabel() {
        return heroLabel();
    }

    private static JLabel heroName(){

        JLabel heroName = new JLabel();

        heroName.setText("Hero Name");
        heroName.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945),(int) ((ScreenResolution.getScreenHeight())*0.07),(int) ((ScreenResolution.getScreenWidth())*0.05),(int) ((ScreenResolution.getScreenHeight())*0.11));

        return heroName;
    }
    public static JLabel getHeroName() {
        return heroName();
    }

    private static JProgressBar heroHealth(){
        JProgressBar heroHealth = new JProgressBar(0,100);  //Min/Max Health

        heroHealth.setValue(100);
        heroHealth.setBounds((int) ((ScreenResolution.getScreenWidth())*0.82),(int) ((ScreenResolution.getScreenHeight())*0.02),(int) ((ScreenResolution.getScreenWidth())*0.12),(int) ((ScreenResolution.getScreenHeight())*0.023));
        heroHealth.setStringPainted(true);
        heroHealth.setForeground(Color.red);
        heroHealth.setBackground(Color.black);

        return heroHealth;
    }
    public static JProgressBar getHeroHealth() {
        return heroHealth();
    }

    private static JProgressBar heroResources(){
        JProgressBar heroResources = new JProgressBar(0,100);
        heroResources.setValue(100);
        heroResources.setBounds((int) ((ScreenResolution.getScreenWidth())*0.82),(int) ((ScreenResolution.getScreenHeight())*0.05),(int) ((ScreenResolution.getScreenWidth())*0.12),(int) ((ScreenResolution.getScreenHeight())*0.023));
        heroResources.setStringPainted(true);
        heroResources.setForeground(Color.blue);
        heroResources.setBackground(Color.black);

        return heroResources;
    }
    public static JProgressBar getHeroResources() {
        return heroResources();
    }



    //ENEMY PANEL
    private static JLabel enemyLabel(){

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/imgs/enemy.PNG")));
        JLabel enemyLabel = new JLabel();

       // enemyLabel.setText("Enemy Name");
       // enemyLabel.setHorizontalTextPosition(JLabel.CENTER);
       // enemyLabel.setVerticalTextPosition(JLabel.BOTTOM);

        enemyLabel.setIcon(icon);
        enemyLabel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945),(int) ((ScreenResolution.getScreenHeight())*0.19),(int) ((ScreenResolution.getScreenWidth())*0.05),(int) ((ScreenResolution.getScreenHeight())*0.11));
        return enemyLabel;
    }
    public static JLabel getEnemyLabel() {
        return enemyLabel();
    }

    private static JLabel enemyName(){

        JLabel enemyName = new JLabel();

        enemyName.setText("Enemy Name 6");
        enemyName.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945),(int) ((ScreenResolution.getScreenHeight())*0.25),(int) ((ScreenResolution.getScreenWidth())*0.05),(int) ((ScreenResolution.getScreenHeight())*0.11));

        return enemyName;
    }
    public static JLabel getEnemyName() {
        return enemyName();
    }

    private static JProgressBar enemyHealth(){
        JProgressBar enemyHealth = new JProgressBar(0,100);  //Min/Max Health

        enemyHealth.setValue(100);
        enemyHealth.setBounds((int) ((ScreenResolution.getScreenWidth())*0.82),(int) ((ScreenResolution.getScreenHeight())*0.20),(int) ((ScreenResolution.getScreenWidth())*0.12),(int) ((ScreenResolution.getScreenHeight())*0.023));
        enemyHealth.setStringPainted(true);
        enemyHealth.setForeground(Color.red);
        enemyHealth.setBackground(Color.black);

        return enemyHealth;
    }
    public static JProgressBar getEnemyHealth() {
        return enemyHealth();
    }

    private static JProgressBar enemyResources(){
        JProgressBar enemyResources = new JProgressBar(0,100);
        enemyResources.setValue(100);
        enemyResources.setBounds((int) ((ScreenResolution.getScreenWidth())*0.82),(int) ((ScreenResolution.getScreenHeight())*0.23),(int) ((ScreenResolution.getScreenWidth())*0.12),(int) ((ScreenResolution.getScreenHeight())*0.023));
        enemyResources.setStringPainted(true);
        enemyResources.setForeground(Color.blue);
        enemyResources.setBackground(Color.black);

        return enemyResources;
    }
    public static JProgressBar getEnemyResources() {
        return enemyResources();
    }





    //SPACE FOR CHAT, COMBAT LOG, ETC....


//    private static JLabel emptyLabel(){
//
//        JLabel emptyLabel = new JLabel();
//
//        emptyLabel.setText("Space for chat,combat log, etc");
//        emptyLabel.setHorizontalTextPosition(JLabel.CENTER);
//        emptyLabel.setVerticalTextPosition(JLabel.BOTTOM);
//
//        emptyLabel.setBounds((int) ((ScreenResolution.getScreenWidth())*0.84),(int) ((ScreenResolution.getScreenHeight())*0.66),(int) ((ScreenResolution.getScreenWidth())*0.10),(int) ((ScreenResolution.getScreenHeight())*0.10));
//
//        return emptyLabel;
//    }
//    public static JLabel getEmptyLabel() {
//        return emptyLabel();
//    }
}