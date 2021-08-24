package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.processors.MoveProcessor;
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

    }


    @Override
    public void keyTyped(KeyEvent e) {
//        GameObject hero     = GameGrid.getInstance().getHero();
//        GameObject[][] grid = GameGrid.getInstance().getGrid();
//
//        MoveProcessor.doMove(hero, grid, e.getKeyChar());
//        this.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        GameObject hero     = GameGrid.getInstance().getHero();
        GameObject[][] grid = GameGrid.getInstance().getGrid();

        MoveProcessor.doMove(hero, grid, e.getKeyCode());
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println(GameGrid.getInstance().getHero().getRow());
//        System.out.println("keyReleased");
    }
}
