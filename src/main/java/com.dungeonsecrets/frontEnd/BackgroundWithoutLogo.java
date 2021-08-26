package com.dungeonsecrets.frontEnd;

import javax.swing.*;
import java.awt.*;

public class BackgroundWithoutLogo extends JPanel {


    Image background;

    public BackgroundWithoutLogo(){

        background = new ImageIcon("src/main/resources/imgs/MainMenuBackground.jpg").getImage();

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
