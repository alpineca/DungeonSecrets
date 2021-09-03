package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CharacterPanel extends JPanel {


    protected static JLabel characterName;
    protected static JProgressBar characterHealth;
    protected static JProgressBar characterResources;
    private static int height;
    private static int width;
    CharacterPanel(){
        this.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.01), (int) ((ScreenResolution.getScreenWidth())*0.20), (int) ((ScreenResolution.getScreenHeight())*0.15));
        height = this.getHeight();
        width  = this.getWidth();
        this.setLayout(null);
        this.setVisible(true);
        this.setOpaque(true);
        this.setBackground(Color.green);

        this.add(getCharacterLabel());

        this.add(getCharacterName());

        this.add(getCharacterHealth());

        this.add(getCharacterResources());

    }



    private static JLabel characterLabel(){
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/imgs/hero_avatar.PNG")));
        JLabel characterLabel = new JLabel();
        characterLabel.setIcon(icon);
        characterLabel.setBounds((int)(width*0.65),(int)(height*0.03),(int)(width*0.30),(int)(height*0.70));
        return characterLabel;
    }
    public static JLabel getCharacterLabel() {
        return characterLabel();
    }

    private static JLabel characterName(){
        characterName = new JLabel();
        characterName.setText("Character");
        characterName.setFont(new Font("Immortal",Font.PLAIN,15));
        characterName.setForeground(new Color(245, 170, 7));
        characterName.setBounds((int)(width*0.65),(int)(height*0.70),(int)(width*0.30),(int)(height*0.40));
        return characterName;
    }
    public static JLabel getCharacterName() {
        return characterName();
    }



    private static JProgressBar characterHealth(){
        characterHealth = new JProgressBar(0,500);
        characterHealth.setValue(500);
        characterHealth.setBounds((int) (width*0.01),(int) (height*0.10),(int) (width*0.60),(int) (height*0.20)); characterHealth.setStringPainted(true);
        characterHealth.setString(characterHealth.getValue()+"");
        characterHealth.setForeground(Color.red);
        characterHealth.setBackground(Color.black);
        characterHealth.setVisible(true);

        System.out.println(characterHealth.getValue());

        return characterHealth;
    }
    public static JProgressBar getCharacterHealth() {
        return characterHealth();
    }

    private static JProgressBar characterResources(){
        //JProgressBar enemyResources = new JProgressBar(0,100);
        characterResources = new JProgressBar(0,100);
        characterResources.setValue(100);
        characterResources.setBounds((int) (width*0.01),(int) (height*0.40),(int) (width*0.60),(int) (height*0.20));
        characterResources.setStringPainted(true);
        characterResources.setForeground(Color.blue);
        characterResources.setBackground(Color.black);

        return characterResources;
    }
    public static JProgressBar getCharacterResources() {
        return characterResources();
    }

}
