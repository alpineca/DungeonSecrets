package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;

public class MenuButtons {

    private static JButton menuButtonActions(){
        JButton menuButtonActions = new JButton("Actions");
        menuButtonActions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.885), (int) ((ScreenResolution.getScreenHeight())*0.36), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonActions.addActionListener(e -> new ButtonClickSound());
        menuButtonActions.addActionListener(e -> MenuPanel.openMenuPanelActions());
        return menuButtonActions;
    }
    public static JButton getMenuButtonActions(){
        return menuButtonActions();
    }



    private static JButton menuButtonLog(){
        JButton menuButtonLog = new JButton("Log");
        menuButtonLog.setBounds((int) ((ScreenResolution.getScreenWidth())*0.825), (int) ((ScreenResolution.getScreenHeight())*0.36), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonLog.addActionListener(e -> new ButtonClickSound());
        menuButtonLog.addActionListener(e -> MenuPanel.openMenuPanelLog());
        return menuButtonLog;
    }
    public static JButton getMenuButtonLog(){
        return menuButtonLog();
    }

    //
    private static JButton menuButtonOptions(){
        JButton menuButtonOptions = new JButton("Options");
        menuButtonOptions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945), (int) ((ScreenResolution.getScreenHeight())*0.36), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonOptions.addActionListener(e -> new ButtonClickSound());
        menuButtonOptions.addActionListener(e -> MenuPanel.openMenuPanelOptions());
        return menuButtonOptions;
    }
    public static JButton getMenuButtonOptions(){
        return menuButtonOptions();
    }







}


