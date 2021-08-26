package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class MenuPanel {

    private static JPanel menuPanelYellow = new JPanel();
    private static JPanel menuPanelYellow(){

        menuPanelYellow.setBackground(Color.yellow);
        //menuPanelYellow.setBounds(0,0,200,200);
        menuPanelYellow.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.50), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.50));
        menuPanelYellow.setOpaque(true);
        menuPanelYellow.setVisible(false);

        return menuPanelYellow;

    }
    public static JPanel getMenuPanelYellow (){
        return  menuPanelYellow();
    }
    public static void openMenuPanelYellow(){

        if (menuPanelBlue.isVisible()){
            menuPanelBlue.setVisible(false);
        }

        if (menuPanelYellow.isVisible()){
            menuPanelYellow.setVisible(false);
        }
        else{
            menuPanelYellow.setVisible(true);
        }

    }



    private static JPanel menuPanelBlue = new JPanel();
    private static JPanel menuPanelBlue(){

        menuPanelBlue.setBackground(Color.blue);
        menuPanelBlue.setBounds((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.50), (int) ((ScreenResolution.getScreenWidth())*0.19), (int) ((ScreenResolution.getScreenHeight())*0.50));
        menuPanelBlue.setOpaque(true);
        menuPanelBlue.setVisible(false);
        return menuPanelBlue;

    }
    public static JPanel getMenuPanelBlue (){
        return  menuPanelBlue();
    }


    public static void openMenuPanelBlue(){

        if (menuPanelYellow.isVisible()){
            menuPanelYellow.setVisible(false);
        }

        if (menuPanelBlue.isVisible()){
            menuPanelBlue.setVisible(false);
        }
        else{
            menuPanelBlue.setVisible(true);
        }

    }


//    private static JButton optionsButton(){
//
//        JButton options = new JButton();
//
//        options.setText("Options");
//        options.setHorizontalTextPosition(JLabel.CENTER);
//        options.setVerticalTextPosition(JLabel.BOTTOM);
//
//        options.setBounds((int) ((ScreenResolution.getScreenWidth())*0.90), (int) ((ScreenResolution.getScreenHeight())*0.50), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.05));
//
//        return options;
//    }
//    public static JButton getOptionsButton() {
//        return optionsButton();
//    }

}
