package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{



    MainPanel(){

//        int width   = ScreenResolution.getScreenWidth()-350;
        int width   = (int) ((ScreenResolution.getScreenWidth())*0.82);
        int height  = ScreenResolution.getScreenHeight();

        this.setOpaque(false);
        this.setBounds(0,0, ScreenResolution.getScreenWidth()-350, ScreenResolution.getScreenHeight());
        this.setLayout(null);

        GameGrid grid = new GameGrid();
        grid.setVisible(true);
        grid.setForeground(new Color(255, 255, 255));
        grid.setBounds(0, 0, width, height);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setAlignmentY(Component.CENTER_ALIGNMENT);
        this.add(grid);

        System.out.println(width);
        System.out.println(height);



    }




}
