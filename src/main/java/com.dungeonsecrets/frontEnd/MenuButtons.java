package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;

public class MenuButtons {

    private static JButton menuButtonQuit(){
        JButton menuButtonQuit = new JButton("Quit");
        menuButtonQuit.setBounds((int) ((ScreenResolution.getScreenWidth())*0.945), (int) ((ScreenResolution.getScreenHeight())*0.96), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonQuit.addActionListener(e -> System.exit(0));
        return menuButtonQuit;
    }
    public static JButton getMenuButtonQuit(){
        return menuButtonQuit();
    }


    private static JButton menuButtonOptions(){
        JButton menuButtonOptions = new JButton("Options");
        menuButtonOptions.setBounds((int) ((ScreenResolution.getScreenWidth())*0.885), (int) ((ScreenResolution.getScreenHeight())*0.96), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonOptions.addActionListener(e -> System.out.println("*Options menu opens*"));
        return menuButtonOptions;
    }
    public static JButton getMenuButtonOptions(){
        return menuButtonOptions();
    }



    private static JButton menuButtonLog(){
        JButton menuButtonLog = new JButton("Log");
        menuButtonLog.setBounds((int) ((ScreenResolution.getScreenWidth())*0.825), (int) ((ScreenResolution.getScreenHeight())*0.96), (int) ((ScreenResolution.getScreenWidth())*0.05), (int) ((ScreenResolution.getScreenHeight())*0.03));
        menuButtonLog.addActionListener(e -> System.out.println("*Options log opens*"));
        return menuButtonLog;
    }
    public static JButton getMenuButtonLog(){
        return menuButtonLog();
    }





}


