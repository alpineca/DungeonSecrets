package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.gameGridObjects.Enemy;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import static com.dungeonsecrets.frontEnd.SidePanel.enemyHealth;

public class MenuPanel {

    //ACTION MENU PANEL

    private static JPanel menuPanelActions  = new JPanel();
    public static JButton attack            = new JButton("Attack");

    private static JPanel menuPanelActions(){

        attack.setBounds((int) ((ScreenResolution.getScreenWidth())*0.00000), (int) ((ScreenResolution.getScreenHeight())*0.00), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        attack.setEnabled(false);
        attack.addActionListener(e -> new ButtonClickSound());
        attack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentHP = GameGrid.selectedEnemy.getCurrentHp();

                GameGrid.selectedEnemy.setCurrentHp(currentHP - 20);
                enemyHealth.setValue(currentHP - 20);

                enemyHealth.setString(enemyHealth.getValue()+"");

            }
        });

        menuPanelActions.setBackground(Color.yellow);
        menuPanelActions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.60));
        menuPanelActions.setOpaque(true);
        menuPanelActions.add(attack);
        menuPanelActions.setVisible(false);

        return menuPanelActions;

    }
    public static JPanel getMenuPanelActions(){
        return  menuPanelActions();
    }
    public static void openMenuPanelActions(){

        if (menuPanelOptions.isVisible()){
            menuPanelOptions.setVisible(false);
        }

        if (menuPanelLog.isVisible()){
            menuPanelLog.setVisible(false);
        }

        if (menuPanelActions.isVisible()){
            menuPanelActions.setVisible(false);
        }
        else{
            menuPanelActions.setVisible(true);
        }

    }

    //LOG MENU PANEL

    private static JPanel menuPanelLog = new JPanel();
    private static JPanel menuPanelLog(){

        menuPanelLog.setBackground(Color.blue);
        menuPanelLog.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.60));
        menuPanelLog.setOpaque(true);
        menuPanelLog.setVisible(false);
        return menuPanelLog;

    }
    public static JPanel getMenuPanelLog (){
        return  menuPanelLog();
    }


    public static void openMenuPanelLog(){

        if (menuPanelOptions.isVisible()){
            menuPanelOptions.setVisible(false);
        }

        if (menuPanelActions.isVisible()){
            menuPanelActions.setVisible(false);
        }

        if (menuPanelLog.isVisible()){
            menuPanelLog.setVisible(false);
        }
        else{
            menuPanelLog.setVisible(true);
        }

    }


    //OPTIONS MENU PANEL

    private static JPanel menuPanelOptions  = new JPanel();
    private static JButton quitButton       = new JButton("Quit");
    private static JButton saveButton       = new JButton("Save");
    private static JButton loadButton       = new JButton("Load");
    private static JPanel menuPanelOptions(){

        menuPanelOptions.setBackground(Color.green);
        menuPanelOptions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.60));
        menuPanelOptions.setOpaque(true);
        menuPanelOptions.setLayout(null);

        saveButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.05), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == saveButton){
                    new ButtonClickSound();

                    GameGrid.getInstance().saveHero();

                }
            }
        });
        loadButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.15), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == loadButton){
                    new ButtonClickSound();
                }
            }
        });
        quitButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.25), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == quitButton){
                    System.exit(0);
                }
            }
        });

        menuPanelOptions.add(saveButton);
        menuPanelOptions.add(loadButton);
        menuPanelOptions.add(quitButton);

        menuPanelOptions.setVisible(false);

        return menuPanelOptions;

    }
    public static JPanel getMenuPanelOptions (){
        return  menuPanelOptions();
    }

    public static void openMenuPanelOptions(){

        if (menuPanelActions.isVisible()){
            menuPanelActions.setVisible(false);
        }

        if (menuPanelLog.isVisible()){
            menuPanelLog.setVisible(false);
        }

        if (menuPanelOptions.isVisible()){
            menuPanelOptions.setVisible(false);
        }
        else{
            menuPanelOptions.setVisible(true);
        }

    }
}
