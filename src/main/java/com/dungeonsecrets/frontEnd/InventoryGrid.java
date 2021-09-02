package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.gameGridObjects.*;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.dungeonsecrets.frontEnd.SidePanel.enemyHealth;

public class InventoryGrid extends JPanel implements MouseListener{

    private static InventoryGrid instance;
    private int inventoryGridRows = 13;
    private int inventoryGridCols = 7;
    private ItemObjects[][] inventory;
    private ItemObjects item;

    public InventoryGrid(){

        this.addMouseListener(this);
        this.setOpaque(false);
        this.bootstrap();
        instance = this;
        this.repaint();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < inventoryGridRows; row++) {
            for(int col = 0; col < inventoryGridCols; col++) {
                inventory[row][col].render(g);
            }
        }
    }
    public static InventoryGrid getInstance(){
        return instance;
    }

    public ItemObjects[][] getInventory(){
        return inventory;
    }

    public ItemObjects getItem(){
        return item;
    }

    private void bootstrap(){
        this.generateInventory();
    }

    private ItemObjects[][] generateInventory(){
        inventory = new ItemObjects[inventoryGridRows][inventoryGridCols];

        for(int row = 0; row < inventoryGridRows; row++) {
            for(int col = 0; col < inventoryGridCols; col++) {
                inventory[row][col] = new InventoryTile(row, col);
            }
        }
        spawnItem();
        return inventory;
    }


    private void spawnItem(){

        int itemRow = 0;
        int itemCol = 0;
        System.out.println("Current item row: " + itemRow);
        System.out.println("Current item col: " + itemCol);
        item = new Item(itemRow, itemCol);
        inventory[itemRow][itemCol] = item;

    }

//    public static GameObject selectedEnemy;
    @Override
    public void mouseClicked(MouseEvent e) {

        int row = getInventoryRowBasedOnCoordinates(e.getY());
        int col = getInventoryColBasedOnCoordinates(e.getX());

        ItemObjects selectedElement = this.getInventoryObject(row, col);


        if(this.isInventoryTile(selectedElement)){
            selectedElement = this.getInventoryObject(row, col);
            System.out.println("Inventory Tile " + "Row: " + row + " Col: " + col);
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

    private int getInventoryRowBasedOnCoordinates(int coordinates) {

        return coordinates / ((int) ((ScreenResolution.getScreenHeight())*0.60)/13);
    }

    private int getInventoryColBasedOnCoordinates(int coordinates) {
        return coordinates / ((int) ((ScreenResolution.getScreenWidth())*0.19)/7);
    }

    private ItemObjects getInventoryObject(int row, int col) {
        return this.inventory[row][col];
    }

    private boolean isInventoryTile(ItemObjects instance) {
        return instance instanceof InventoryTile;
    }

}

//((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40),