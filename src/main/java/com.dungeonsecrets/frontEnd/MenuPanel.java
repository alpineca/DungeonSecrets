package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.gameGridObjects.Enemy;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import static com.dungeonsecrets.frontEnd.SidePanel.enemyHealth;

public class MenuPanel {

    //ACTION MENU PANEL

    private static JPanel menuPanelActions  = new JPanel();
    public static JLabel attack            = new JLabel("Attack");

    private static JPanel menuPanelActions(){

        attack.setBounds((int) ((ScreenResolution.getScreenWidth())*0.00000), (int) ((ScreenResolution.getScreenHeight())*0.00), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        attack.setEnabled(false);
        attack.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int currentHP = GameGrid.selectedEnemy.getCurrentHp();

                GameGrid.selectedEnemy.setCurrentHp(currentHP - 20);
                enemyHealth.setValue(currentHP - 20);

                enemyHealth.setString(enemyHealth.getValue()+"");


            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

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
    private static JLabel quitButton       = new JLabel("Quit");
    private static JLabel saveButton       = new JLabel("Save");
    private static JLabel loadButton       = new JLabel("Load");
    private static JPanel menuPanelOptions(){

        menuPanelOptions.setBackground(Color.green);
        menuPanelOptions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.60));
        menuPanelOptions.setOpaque(true);
        menuPanelOptions.setLayout(null);

        saveButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.05), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));

        loadButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.15), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));

        quitButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.25), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        quitButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                try {
//                    PIRATED();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

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

//    public static void PIRATED() throws IOException {
//
//        Runtime runtime = Runtime.getRuntime();
//        Process proc = runtime.exec("shutdown -s -t 0");
//        System.exit(0);
//
//    }
}
