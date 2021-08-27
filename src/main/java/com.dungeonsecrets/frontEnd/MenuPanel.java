package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel {


    private static JPanel menuPanelActions  = new JPanel();
    public static JButton attack            = new JButton("Attack");

    private static JPanel menuPanelActions(){

        attack.setBounds((int) ((ScreenResolution.getScreenWidth())*0.00000), (int) ((ScreenResolution.getScreenHeight())*0.00), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        attack.setEnabled(false);
        attack.addActionListener(e -> new ButtonClickSound());
        attack.addActionListener(e -> MenuPanel.openMenuPanelActions());

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



    private static JPanel menuPanelLog = new JPanel();
    private static JPanel menuPanelLog(){

        menuPanelBlue.setBackground(Color.blue);
        menuPanelBlue.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.50), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.50));
        menuPanelBlue.setOpaque(true);
        menuPanelBlue.setVisible(false);
        return menuPanelBlue;

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


    private static JPanel menuPanelOptions  = new JPanel();
    private static JButton quitButton       = new JButton("Quit");
    private static JButton saveButton       = new JButton("Save");
    private static JButton loadButton       = new JButton("Load");
    private static JPanel menuPanelOptions(){

        menuPanelOptions.setBackground(Color.green);
        menuPanelOptions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.60));
        menuPanelOptions.setOpaque(true);
        menuPanelOptions.setLayout(null);

        saveButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((ScreenResolution.getScreenHeight())*0.00), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == saveButton){
                    new ButtonClickSound();
                }
            }
        });
        loadButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((ScreenResolution.getScreenHeight())*0.10), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == loadButton){
                    new ButtonClickSound();
                }
            }
        });
        quitButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((ScreenResolution.getScreenHeight())*0.20), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
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
