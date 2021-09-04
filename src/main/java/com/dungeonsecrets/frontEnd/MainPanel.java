package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameInfo.CurrentHero;
import com.dungeonsecrets.backEnd.GameInfo.GameSetup;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.processors.MonsterAction;
import com.dungeonsecrets.backEnd.processors.MonsterMoveProcessor;
import com.dungeonsecrets.backEnd.processors.MoveProcessor;
import com.dungeonsecrets.backEnd.processors.TurnSelector;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainPanel extends JPanel implements KeyListener {
    MonsterAction move = new MonsterAction();

    Thread monsterAction = new Thread(move);



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
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.add(grid);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        GameObject hero     = GameSetup.getInstance().getCharacter();
        GameObject[][] grid = GameGrid.getInstance().getGrid();

        if(TurnSelector.getInstance().isItsPlayerTurn()){
//            monsterAction = new Thread(move);
            MoveProcessor.doMove(hero, grid, e.getKeyCode());
            this.repaint();
            TurnSelector.getInstance().toggle();
            moveMonsters();
        }
//        MonsterAction.moveMonsters();
        GameGrid.getInstance().repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println(GameGrid.getInstance().getHero().getRow());
//        System.out.println("keyReleased");
    }

    private void moveMonsters(){
        new Thread(() -> {
            MonsterAction.moveMonsters();
            this.repaint();
        }).start();
    }
}
