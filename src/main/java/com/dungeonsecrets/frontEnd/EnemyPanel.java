package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.frontEnd.SidePanel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class EnemyPanel extends JPanel {


    protected static JLabel enemyName;
    protected static JProgressBar enemyHealth;
    protected static JProgressBar enemyResources;
    private static int height;
    private static int width;
    EnemyPanel(){
        this.setBounds((int) ((ScreenResolution.getScreenWidth())*0.82), (int) ((ScreenResolution.getScreenHeight())*0.17), (int) ((ScreenResolution.getScreenWidth())*0.20), (int) ((ScreenResolution.getScreenHeight())*0.15));
        height = this.getHeight();
        width  = this.getWidth();
        this.setLayout(null);
        this.setVisible(true);
        this.setOpaque(true);
        this.setBackground(Color.red);

        this.add(getEnemyLabel());

        this.add(getEnemyName());

        this.add(getEnemyHealth());

        this.add(getEnemyResources());

    }



    private static JLabel enemyLabel(){
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/imgs/enemy.PNG")));
        JLabel enemyLabel = new JLabel();
        enemyLabel.setIcon(icon);
        enemyLabel.setBounds((int)(width*0.65),(int)(height*0.03),(int)(width*0.30),(int)(height*0.70));
        return enemyLabel;
    }
    public static JLabel getEnemyLabel() {
        return enemyLabel();
    }

    private static JLabel enemyName(){
        enemyName = new JLabel();
        enemyName.setText("Enemy");
        enemyName.setFont(new Font("Immortal",Font.PLAIN,15));
        enemyName.setForeground(new Color(245, 170, 7));
        enemyName.setBounds((int)(width*0.05),(int)(height*0.65),(int)(width*0.30),(int)(height*0.40));
        return enemyName;
    }
    public static JLabel getEnemyName() {
        return enemyName();
    }



    private static JProgressBar enemyHealth(){
        enemyHealth = new JProgressBar(0,500);
        enemyHealth.setValue(500);
        enemyHealth.setBounds((int) (width*0.01),(int) (height*0.10),(int) (width*0.60),(int) (height*0.20)); enemyHealth.setStringPainted(true);
        enemyHealth.setString(enemyHealth.getValue()+"");
        enemyHealth.setForeground(Color.red);
        enemyHealth.setBackground(Color.black);
        enemyHealth.setVisible(true);

        System.out.println(enemyHealth.getValue());

        return enemyHealth;
    }
    public static JProgressBar getEnemyHealth() {
        return enemyHealth();
    }

    private static JProgressBar enemyResources(){
        //JProgressBar enemyResources = new JProgressBar(0,100);
        enemyResources = new JProgressBar(0,100);
        enemyResources.setValue(100);
        enemyResources.setBounds((int) (width*0.01),(int) (height*0.40),(int) (width*0.60),(int) (height*0.20));
        enemyResources.setStringPainted(true);
        enemyResources.setForeground(Color.blue);
        enemyResources.setBackground(Color.black);

        return enemyResources;
    }
    public static JProgressBar getEnemyResources() {
        return enemyResources();
    }

}
