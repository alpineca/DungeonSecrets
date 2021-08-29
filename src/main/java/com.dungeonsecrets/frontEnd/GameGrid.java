package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.Chapter1.Chapter1;
import com.dungeonsecrets.backEnd.gameGridObjects.Enemy;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.gameGridObjects.Hero;
import com.dungeonsecrets.backEnd.gameGridObjects.Tile;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static com.dungeonsecrets.frontEnd.SidePanel.enemyHealth;

public class GameGrid extends JPanel implements MouseListener{
    private Chapter1 chapter            = new Chapter1();
    private static GameGrid instance;
    private int gameGridRows = 21;
    private int gameGridCols = 32;
    private GameObject[][] grid;
    private GameObject hero;

    public GameGrid(){

        this.addMouseListener(this);
        this.setOpaque(false);
        this.bootstrap();
        instance = this;

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < gameGridRows; row++) {
            for(int col = 0; col < gameGridCols; col++) {
                grid[row][col].render(g);
            }
        }
    }
    public static GameGrid getInstance(){ 
        return instance;
    }

    public GameObject[][] getGrid(){
        return grid;
    }

    public GameObject getHero(){
        return hero;
    }

    private void bootstrap(){
        this.generateGrid();
    }

    private GameObject[][] generateGrid(){
        grid = new GameObject[gameGridRows][gameGridCols];

        for(int row = 0; row < gameGridRows; row++) {
            for(int col = 0; col < gameGridCols; col++) {
                grid[row][col] = new Tile(row, col);
            }
        }
        spawnHero();
        spawnEnemy();
        return grid;
    }

    private void spawnHero(){
        hero = new Hero(15, 7);
        grid[15][7] = hero;

    }

    private void spawnEnemy(){
//        enemy = new Enemy(7, 7);
//        grid[7][7] = enemy;
//        enemy2 = new Enemy(8, 7);
//        grid[8][7] = enemy2;
        ArrayList<GameObject> monsters = chapter.getMonsters();
        for(GameObject monster : monsters){
            int mRow = monster.getRow();
            int mCol = monster.getCol();
            grid[mRow][mCol] = monster;
        }

    }

    public static GameObject selectedEnemy;
    @Override
    public void mouseClicked(MouseEvent e) {

        int row = getGameBoardRowBasedOnCoordinates(e.getY());
        int col = getGameBoardColBasedOnCoordinates(e.getX());

        GameObject selectedElement = this.getGameBoardObject(row, col);

        MenuPanel.attack.setEnabled(false);
        if(this.isHero(selectedElement)){
            selectedElement = this.getGameBoardObject(row, col);
            System.out.println("Hero " + "Row: " + row + " Col: " + col);
        }
        if(this.isEnemy(selectedElement)){
            selectedElement = this.getGameBoardObject(row, col);
            System.out.println("Enemy " + "Row: " + row + " Col: " + col);
            MenuPanel.attack.setEnabled(true);

            enemyHealth.setMaximum(selectedElement.getMaxHP());
            enemyHealth.setValue(selectedElement.getCurrentHp());
            selectedEnemy = selectedElement;
            enemyHealth.setString(enemyHealth.getValue()+"");

        }
        if(this.isTile(selectedElement)){
            selectedElement = this.getGameBoardObject(row, col);
            System.out.println("Tile " + "Row: " + row + " Col: " + col);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private int getGameBoardRowBasedOnCoordinates(int coordinates) {

        return coordinates / (ScreenResolution.getScreenHeight()/21);
    }

    private int getGameBoardColBasedOnCoordinates(int coordinates) {
        return coordinates / ((int)((ScreenResolution.getScreenWidth())*0.8)/31);
    }

    private GameObject getGameBoardObject(int row, int col) {
        return this.grid[row][col];
    }

    private boolean isTile(GameObject instance) {
        return instance instanceof Tile;
    }

    private boolean isHero(GameObject instance) {
        return instance instanceof Hero;
    }

    private boolean isEnemy(GameObject instance) {
        return instance instanceof Enemy;
    }
}