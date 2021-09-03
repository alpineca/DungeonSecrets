package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class MenuButtons {

    private static JLabel menuButtonActions(){
        JLabel menuButtonActions = new JLabel("Action");
        ImageIcon actionIcon = new ImageIcon( "src/main/resources/imgs/ActionButton.png");
        menuButtonActions.setIcon(actionIcon);
        menuButtonActions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.885), (int) ((ScreenResolution.getScreenHeight())*0.34), 51,51);
        menuButtonActions.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
                ImageIcon actionIconPressed = new ImageIcon( "src/main/resources/imgs/ActionButtonPressed.png");
                menuButtonActions.setIcon(actionIconPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                MenuPanel.openMenuPanelActions();
                menuButtonActions.setIcon(actionIcon);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        return menuButtonActions;
    }
    public static JLabel getMenuButtonActions(){
        return menuButtonActions();
    }



    private static JLabel menuButtonLog(){
        JLabel menuButtonLog = new JLabel("Log");

        ImageIcon actionIcon = new ImageIcon( "src/main/resources/imgs/LogButton.png");
        menuButtonLog.setIcon(actionIcon);
        menuButtonLog.setBounds((int) ((ScreenResolution.getScreenWidth())*0.825), (int) ((ScreenResolution.getScreenHeight())*0.34), 51, 51);
        menuButtonLog.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
                ImageIcon actionIconPressed = new ImageIcon( "src/main/resources/imgs/LogButtonPressed.png");
                menuButtonLog.setIcon(actionIconPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                MenuPanel.openMenuPanelLog();
                menuButtonLog.setIcon(actionIcon);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        return menuButtonLog;
    }
    public static JLabel getMenuButtonLog(){
        return menuButtonLog();
    }

    //
    private static JLabel menuButtonOptions(){
        JLabel menuButtonOptions = new JLabel("Options");
        ImageIcon actionIcon = new ImageIcon( "src/main/resources/imgs/OptionsButton.png");
        menuButtonOptions.setIcon(actionIcon);
        menuButtonOptions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945), (int) ((ScreenResolution.getScreenHeight())*0.34), 51, 51);
        menuButtonOptions.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
                ImageIcon actionIconPressed = new ImageIcon( "src/main/resources/imgs/OptionsButtonPressed.png");
                menuButtonOptions.setIcon(actionIconPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                MenuPanel.openMenuPanelOptions();
                menuButtonOptions.setIcon(actionIcon);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        return menuButtonOptions;
    }
    public static JLabel getMenuButtonOptions(){
        return menuButtonOptions();
    }

    private static JLabel menuButtonInventory(){
        JLabel menuButtonInventory = new JLabel("Inventory");
        ImageIcon actionIcon = new ImageIcon( "src/main/resources/imgs/InventoryButton.png");
        menuButtonInventory.setIcon(actionIcon);
        menuButtonInventory.setBounds((int) ((ScreenResolution.getScreenWidth())*0.855), (int) ((ScreenResolution.getScreenHeight())*0.34), 51, 51);
        menuButtonInventory.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
                ImageIcon actionIconPressed = new ImageIcon( "src/main/resources/imgs/InventoryButtonPressed.png");
                menuButtonInventory.setIcon(actionIconPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                MenuPanel.openMenuPanelInventory();
                menuButtonInventory.setIcon(actionIcon);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        return menuButtonInventory;
    }
    public static JLabel getMenuButtonInventory(){
        return menuButtonInventory();
    }

    private static JLabel menuButtonEncyclopedia(){
        JLabel menuButtonEncyclopedia = new JLabel("Encyclopedia");
        ImageIcon actionIcon = new ImageIcon( "src/main/resources/imgs/EncyclopediaButton.png");
        menuButtonEncyclopedia.setIcon(actionIcon);
        menuButtonEncyclopedia.setBounds((int) ((ScreenResolution.getScreenWidth())*0.915), (int) ((ScreenResolution.getScreenHeight())*0.34), 51, 51);
        menuButtonEncyclopedia.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
                ImageIcon actionIconPressed = new ImageIcon( "src/main/resources/imgs/EncyclopediaButtonPressed.png");
                menuButtonEncyclopedia.setIcon(actionIconPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                MenuPanel.openMenuPanelEncyclopedia();
                menuButtonEncyclopedia.setIcon(actionIcon);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        return menuButtonEncyclopedia;
    }
    public static JLabel getMenuButtonEncyclopedia(){
        return menuButtonEncyclopedia();
    }


}


