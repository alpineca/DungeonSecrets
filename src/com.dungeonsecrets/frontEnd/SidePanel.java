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
        sidePanel.setBounds(ScreenResolution.getScreenWidth()-370, 0, 370, ScreenResolution.getScreenHeight());
       // sidePanel.setBounds(1570, 0, 370, 1080);
        sidePanel.setLayout(null);

        return sidePanel;

    }


    public static JPanel getSidePanel() {
        return sidePanel();
    }



    //HERO PANEL
    private static JLabel heroLabel(){

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/resources/imgs/hero.PNG")));

        JLabel heroLabel = new JLabel();
        heroLabel.setText("Hero Name");
        heroLabel.setHorizontalTextPosition(JLabel.CENTER);
        heroLabel.setVerticalTextPosition(JLabel.BOTTOM);
        heroLabel.setBounds(ScreenResolution.getScreenWidth()-100,10,90,120);

        heroLabel.setIcon(icon);

        return heroLabel;
    }
    public static JLabel getHeroLabel() {
        return heroLabel();
    }

    private static JProgressBar heroHealth(){
        JProgressBar heroHealth = new JProgressBar(0,100);  //Min/Max Health

        heroHealth.setValue(100);
        heroHealth.setBounds(ScreenResolution.getScreenWidth()-340,15,230,25);
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
        heroResources.setBounds(ScreenResolution.getScreenWidth()-340,55,230,25);
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

        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/resources/imgs/enemy.PNG")));
        JLabel enemyLabel = new JLabel();

        enemyLabel.setText("Enemy Name");
        enemyLabel.setHorizontalTextPosition(JLabel.CENTER);
        enemyLabel.setVerticalTextPosition(JLabel.BOTTOM);

        enemyLabel.setIcon(icon);
        enemyLabel.setBounds(ScreenResolution.getScreenWidth()-100,210,90,120);

        return enemyLabel;
    }
    public static JLabel getEnemyLabel() {
        return enemyLabel();
    }

    private static JProgressBar enemyHealth(){
        JProgressBar enemyHealth = new JProgressBar(0,100);  //Min/Max Health

        enemyHealth.setValue(100);
        enemyHealth.setBounds(ScreenResolution.getScreenWidth()-340,215,230,25);
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
        enemyResources.setBounds(ScreenResolution.getScreenWidth()-340,255,230,25);
        enemyResources.setStringPainted(true);
        enemyResources.setForeground(Color.blue);
        enemyResources.setBackground(Color.black);

        return enemyResources;
    }
    public static JProgressBar getEnemyResources() {
        return enemyResources();
    }





    //SPACE FOR CHAT, COMBAT LOG, ETC....
    private static JLabel emptyLabel(){

        JLabel emptyLabel = new JLabel();

        emptyLabel.setText("Space for chat,combat log, etc");
        emptyLabel.setHorizontalTextPosition(JLabel.CENTER);
        emptyLabel.setVerticalTextPosition(JLabel.BOTTOM);

        emptyLabel.setBounds(ScreenResolution.getScreenWidth()-300,710,200,110);

        return emptyLabel;
    }
    public static JLabel getEmptyLabel() {
        return emptyLabel();
    }
}