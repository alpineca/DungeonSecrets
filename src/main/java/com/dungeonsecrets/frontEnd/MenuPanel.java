package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.gameGridObjects.InventoryTile;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.dungeonsecrets.frontEnd.SidePanel.enemyHealth;

public class MenuPanel {

    //ACTION MENU PANEL

    private static JPanel menuPanelActions  = new JPanel();
    public static JLabel attack            = new JLabel("Attack");

    private static JPanel menuPanelActions(){

        ImageIcon actionAttackIcon = new ImageIcon( "src/main/resources/imgs/AttackButton.png");
        attack.setIcon(actionAttackIcon);
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
                ImageIcon actionAttackIconPressed = new ImageIcon( "src/main/resources/imgs/AttackButtonPressed.png");
                attack.setIcon(actionAttackIconPressed);

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                attack.setIcon(actionAttackIcon);
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
        if (menuPanelEncyclopedia.isVisible()){
            menuPanelEncyclopedia.setVisible(false);
        }
        if (menuPanelInventory.isVisible()){
            menuPanelInventory.setVisible(false);
        }
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
        if (menuPanelEncyclopedia.isVisible()){
            menuPanelEncyclopedia.setVisible(false);
        }
        if (menuPanelInventory.isVisible()){
            menuPanelInventory.setVisible(false);
        }

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

        ImageIcon menuSaveIcon = new ImageIcon( "src/main/resources/imgs/SaveButton.png");
        saveButton.setIcon(menuSaveIcon);
        saveButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.05), 140, 51);
        saveButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
                ImageIcon menuSaveIconPressed = new ImageIcon( "src/main/resources/imgs/SaveButtonPressed.png");
                saveButton.setIcon(menuSaveIconPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                saveButton.setIcon(menuSaveIcon);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        ImageIcon menuLoadIcon = new ImageIcon( "src/main/resources/imgs/LoadButton.png");
        loadButton.setIcon(menuLoadIcon);
        loadButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.15), 140, 51);
        loadButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
                ImageIcon menuLoadIconPressed = new ImageIcon( "src/main/resources/imgs/LoadButtonPressed.png");
                loadButton.setIcon(menuLoadIconPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                loadButton.setIcon(menuLoadIcon);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        ImageIcon menuQuitIcon = new ImageIcon( "src/main/resources/imgs/QuitButton.png");
        quitButton.setIcon(menuQuitIcon);
        quitButton.setBounds((int) ((menuPanelOptions.getWidth())*0.37), (int) ((menuPanelOptions.getHeight())*0.25), 140, 51);
        quitButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                new ButtonClickSound();
                ImageIcon menuQuitIconPressed = new ImageIcon( "src/main/resources/imgs/QuitButtonPressed.png");
                quitButton.setIcon(menuQuitIconPressed);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                quitButton.setIcon(menuQuitIcon);
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
        if (menuPanelEncyclopedia.isVisible()){
            menuPanelEncyclopedia.setVisible(false);
        }
        if (menuPanelInventory.isVisible()){
            menuPanelInventory.setVisible(false);
        }
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

    private static InventoryGrid inventory;
    private static JPanel menuPanelInventory  = new JPanel();
    private static JPanel menuPanelInventory(){


        inventory = new InventoryGrid();
        inventory.setVisible(true);
        inventory.setForeground(new Color(255, 255, 255));
        inventory.setBounds(0, 0, (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.60));

        menuPanelInventory.setBackground(Color.pink);
        menuPanelInventory.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.60));
        menuPanelInventory.setOpaque(true);
        menuPanelInventory.setLayout(null);

        menuPanelInventory.add(inventory);
        menuPanelInventory.setVisible(false);

        return menuPanelInventory;

    }
    public static JPanel getMenuPanelInventory (){
        return  menuPanelInventory();
    }

    public static void openMenuPanelInventory(){

        if (menuPanelEncyclopedia.isVisible()){
            menuPanelEncyclopedia.setVisible(false);
        }
        if (menuPanelActions.isVisible()){
            menuPanelActions.setVisible(false);
        }

        if (menuPanelLog.isVisible()){
            menuPanelLog.setVisible(false);
        }

        if (menuPanelOptions.isVisible()){
            menuPanelOptions.setVisible(false);
        }
        if (menuPanelInventory.isVisible()){
            menuPanelInventory.setVisible(false);
        }
        else{
            menuPanelInventory.setVisible(true);
        }

    }
//

    private static JPanel menuPanelEncyclopedia  = new JPanel();
    private static JPanel menuPanelEncyclopedia(){

        menuPanelEncyclopedia.setBackground(new Color(191,191,191));
        menuPanelEncyclopedia.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.60));
        menuPanelEncyclopedia.setOpaque(true);
        menuPanelEncyclopedia.setLayout(null);
        menuPanelEncyclopedia.setVisible(false);

        return menuPanelEncyclopedia;

    }
    public static JPanel getMenuPanelEncyclopedia (){
        return  menuPanelEncyclopedia();
    }

    public static void openMenuPanelEncyclopedia(){
        if (menuPanelInventory.isVisible()){
            menuPanelInventory.setVisible(false);
        }

        if (menuPanelActions.isVisible()){
            menuPanelActions.setVisible(false);
        }

        if (menuPanelLog.isVisible()){
            menuPanelLog.setVisible(false);
        }

        if (menuPanelOptions.isVisible()){
            menuPanelOptions.setVisible(false);
        }
        if (menuPanelEncyclopedia.isVisible()){
            menuPanelEncyclopedia.setVisible(false);
        }
        else{
            menuPanelEncyclopedia.setVisible(true);
        }

    }

//    Proceed with caution
//    public static void PIRATED() throws IOException {
//        Runtime runtime = Runtime.getRuntime();
//        Process proc = runtime.exec("shutdown -s -t 0");
//        System.exit(0);
//
//    }
}
