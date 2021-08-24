package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainPanel extends JPanel implements KeyListener {



    MainPanel(){

        int width   = (int) ((ScreenResolution.getScreenWidth())*0.82);
        int height  = ScreenResolution.getScreenHeight();

        this.setOpaque(false);
        this.setBounds(0,0, width, height);
        this.setLayout(null);

        GameGrid grid = new GameGrid();
        grid.setVisible(true);
        grid.setForeground(new Color(255, 255, 255));
        grid.setBounds(0, 0, width, height);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setAlignmentY(Component.CENTER_ALIGNMENT);

        this.add(grid);

        this.addKeyListener(this);
        this.requestFocus();

    }


    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(GameGrid.getInstance().getHero());
        System.out.println("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(GameGrid.getInstance().getHero());
        System.out.println("Key Typed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(GameGrid.getInstance().getHero());
        System.out.println("Key Typed");
    }
}
