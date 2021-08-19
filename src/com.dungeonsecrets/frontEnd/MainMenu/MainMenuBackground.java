package com.dungeonsecrets.frontEnd.MainMenu;

import javax.swing.*;
import java.awt.*;

public class MainMenuBackground extends JPanel {

    Image background;

    MainMenuBackground(){

        background = new ImageIcon("src/com.dungeonsecrets/resources/imgs/MainMenuBackground.jpg").getImage();

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

    }

    //Рисувам фона
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        int width = this.getWidth();
        int height = this.getHeight(); 
        g2D.drawImage(background,0,0,width,height,null);

    }

}
