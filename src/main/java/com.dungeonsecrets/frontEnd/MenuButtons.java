package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;

public class MenuButtons {

    private static JButton menuButtonQuit(){
        JButton menuButtonQuit = new JButton("Quit");
        menuButtonQuit.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945), (int) ((ScreenResolution.getScreenHeight())*0.96), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonQuit.addActionListener(e -> new ButtonClickSound());
        menuButtonQuit.addActionListener(e -> System.exit(0));
        return menuButtonQuit;
    }
    public static JButton getMenuButtonQuit(){
        return menuButtonQuit();
    }


    private static JButton menuButtonOptions(){
        JButton menuButtonOptions = new JButton("Options");
        menuButtonOptions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.885), (int) ((ScreenResolution.getScreenHeight())*0.96), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonOptions.addActionListener(e -> new ButtonClickSound());
        menuButtonOptions.addActionListener(e -> MenuPanel.openMenuPanelYellow());
        return menuButtonOptions;
    }
    public static JButton getMenuButtonOptions(){
        return menuButtonOptions();
    }



    private static JButton menuButtonLog(){
        JButton menuButtonLog = new JButton("Log");
        menuButtonLog.setBounds((int) ((ScreenResolution.getScreenWidth())*0.825), (int) ((ScreenResolution.getScreenHeight())*0.96), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonLog.addActionListener(e -> new ButtonClickSound());
        menuButtonLog.addActionListener(e -> MenuPanel.openMenuPanelBlue());
        return menuButtonLog;
    }
    public static JButton getMenuButtonLog(){
        return menuButtonLog();
    }





}


