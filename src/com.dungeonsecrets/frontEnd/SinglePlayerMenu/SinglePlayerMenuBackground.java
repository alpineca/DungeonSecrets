package com.dungeonsecrets.frontEnd.SinglePlayerMenu;

import javax.swing.*;
import java.awt.*;

public class SinglePlayerMenuBackground extends JPanel {

    Image background;

    SinglePlayerMenuBackground(){

        background = new ImageIcon("/com.dungeonsecrets/resources/imgs/MainMenuBackground.jpg").getImage();

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        int width = this.getWidth();
        int height = this.getHeight();
        g2D.drawImage(background,0,0,width,height,null);

    }

}
