package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameInfo.GameSetup;
import com.dungeonsecrets.backEnd.processors.DistanceCalculation;
import com.dungeonsecrets.backEnd.processors.GridObjectSelector;
import com.dungeonsecrets.chapters.Chapter1;
import com.dungeonsecrets.backEnd.GameInfo.CurrentHero;
import com.dungeonsecrets.backEnd.gameGridObjects.Monster;
import com.dungeonsecrets.backEnd.gameGridObjects.GameObject;
import com.dungeonsecrets.backEnd.gameGridObjects.Character;
import com.dungeonsecrets.backEnd.gameGridObjects.Tile;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static com.dungeonsecrets.frontEnd.EnemyPanel.enemyHealth;
import static com.dungeonsecrets.frontEnd.EnemyPanel.enemyName;

public class GameGrid extends JPanel implements MouseListener{
    private Chapter1 chapter            = new Chapter1();
    private static GameGrid instance;
    private int gameGridRows = 21;
    private int gameGridCols = 32;
    private GameObject[][] grid;
    private Character character = Character.getInstance();

    public GameGrid(){

        this.addMouseListener(this);
        this.setOpaque(false);
        this.bootstrap();
        instance = this;
        this.repaint();

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
    public void setGrid(GameObject[][] updatedGrid){
        this.grid = updatedGrid;
        this.repaint();
    }

    public GameObject getHero(){
        return character;
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
        this.repaint();
        return grid;
    }

    public void spawnHero(){
//        int heroRow = CurrentHero.getInstance().getRow();
//        int heroCol = CurrentHero.getInstance().getCol();

        int characterRow = Character.getInstance().getRow();
        int characterCol = Character.getInstance().getCol();
        grid[characterRow][characterCol] = character;
        GameSetup.getInstance().setCharacter(character);

    }

    private void spawnEnemy(){
        ArrayList<Monster> monsters = chapter.getMonsters();
        GameSetup.getInstance().setMonsters(monsters);
        for(GameObject monster : monsters){
            int mRow = monster.getRow();
            int mCol = monster.getCol();
            grid[mRow][mCol] = monster;
        }

    }

    public void saveHero(){
        CurrentHero.getInstance().saveHero(character.getRow(), character.getCol());
        System.out.println("FOR SAVE: hero.getRow: "+ character.getRow() +", hero.getCol: "+ character.getCol());
    }

    public static GameObject selectedEnemy;
    @Override
    public void mouseClicked(MouseEvent e) {

        int row = getGameBoardRowBasedOnCoordinates(e.getY());
        int col = getGameBoardColBasedOnCoordinates(e.getX());


        GameObject selectedElement = GridObjectSelector.selectedGridObject(row, col);
        MenuPanel.attack.setEnabled(false);
//        if(this.isHero(selectedElement)){
//            selectedElement = this.getGameBoardObject(row, col);
//            System.out.println("Hero " + "Row: " + row + " Col: " + col);
//        }
        if(this.isEnemy(selectedElement)){
            boolean isCloseToHero = DistanceCalculation.isCloseToHero((Monster) selectedElement);
            GameSetup.getInstance().focusMonster((Monster) selectedElement);
            if(isCloseToHero){
                MenuPanel.attack.setEnabled(true);
            }
            enemyHealth.setMaximum(selectedElement.getMaxHP());
            enemyHealth.setValue(selectedElement.getCurrentHp());
            selectedEnemy = selectedElement;
            enemyHealth.setString(enemyHealth.getValue()+"");
            enemyName.setText(selectedElement.getName());
//
////            SidePanel.setEnemyName(GameSetup.getInstance().getMonster().getName());
//
//
        }
//        if(this.isTile(selectedElement)){
//            selectedElement = this.getGameBoardObject(row, col);
//            System.out.println("Tile " + "Row: " + row + " Col: " + col);
//        }

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

    private boolean isTile(GameObject instance) {
        return instance instanceof Tile;
    }

    private boolean isHero(GameObject instance) {
        return instance instanceof Character;
    }

    private boolean isEnemy(GameObject instance) {
        return instance instanceof Monster;
    }
}