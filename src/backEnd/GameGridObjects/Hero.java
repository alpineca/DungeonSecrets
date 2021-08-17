//package GameBoardObjects;
//
//public class Tile extends GameObject{
//
//    protected int height;
//    protected int width;
//
//    public Tile(int row, int col) {
//
//        super(row, col);
//        this.height = 10;
//        this.width = 10;
//
//    }
//
//    public  int getHeight(){
//        return this.height;
//    }
//    public  int getWidth(){
//        return this.width;
//    }
//}
package backEnd.GameGridObjects;


import frontEnd.SidePanel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Hero extends GameObject{

    protected int height;
    protected int width;

    public Hero(int row, int col) {

        super(row, col);
        this.height = 10;
        this.width = 10;

    }
    Image icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("/resources/imgs/hero.PNG"))).getImage();
    public void render(Graphics g) {
        int tileWidth   = 1570/31;
        int tileHeight  = 1080/21;

        int tileX = this.col * tileWidth;
        int tileY = this.row * tileHeight;



//        g.setColor(Color.black);
//        g.fillRect(tileX, tileY, tileWidth, tileHeight);
        g.drawImage(icon, tileX, tileY, tileWidth, tileHeight, null);
        g.setColor(Color.black);
        g.drawRect(tileX, tileY, tileWidth, tileHeight);

    }

    public  int getHeight(){
        return this.height;
    }
    public  int getWidth(){
        return this.width;
    }
}

