package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.GameInfo.GameSetup;
import com.dungeonsecrets.backEnd.gameGridObjects.*;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.chapters.Chapter1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class InventoryGrid extends JPanel implements MouseListener{
    private Chapter1 chapter            = new Chapter1();
    private static InventoryGrid instance;
    private int inventoryGridRows = 5;
    private int inventoryGridCols = 6;
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

        ArrayList<Item> items = chapter.getItems();
        for(ItemObjects item : items){
            int iRow = item.getRow();
            int iCol = item.getCol();
            inventory[iRow][iCol] = item;
        }
//
//        int itemRow = 0;
//        int itemCol = 0;
//        System.out.println("Current item row: " + itemRow);
//        System.out.println("Current item col: " + itemCol);
//        item = new Item(itemRow, itemCol);
//        inventory[itemRow][itemCol] = item;

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

        if(this.isItem(selectedElement)){
            selectedElement = this.getInventoryObject(row, col);
            System.out.println(selectedElement.getName() + " Row: " + row + " Col: " + col);

            if(SwingUtilities.isRightMouseButton(e) && selectedElement.isEquipped()){
                selectedElement.setEquipped(false);
                selectedElement.setIcon(new ImageIcon("src/main/resources/imgs/Itemz/"+selectedElement.getName()+".png").getImage());
                repaint();
            }else if(SwingUtilities.isRightMouseButton(e) && !selectedElement.isEquipped()){
                selectedElement.setEquipped(true);
                selectedElement.setIcon(new ImageIcon("src/main/resources/imgs/Itemz/"+selectedElement.getName()+" Equipped.png").getImage());
                repaint();
            }
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

        return coordinates / ((int)((ScreenResolution.getScreenHeight())*0.280)/5);
    }

    private int getInventoryColBasedOnCoordinates(int coordinates) {
        return coordinates / ((int) ((ScreenResolution.getScreenWidth())*0.185)/6);
    }

    private ItemObjects getInventoryObject(int row, int col) {
        return this.inventory[row][col];
    }

    private boolean isInventoryTile(ItemObjects instance) {
        return instance instanceof InventoryTile;
    }

    private boolean isItem(ItemObjects instance) {
        return instance instanceof Item;
    }


}

//((int) ((ScreenResolution.getScreenWidth())*0.817), (int) ((ScreenResolution.getScreenHeight())*0.40),