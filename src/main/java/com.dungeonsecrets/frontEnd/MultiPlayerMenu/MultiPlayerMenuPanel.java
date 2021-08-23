package com.dungeonsecrets.frontEnd.MultiPlayerMenu;

import javax.swing.*;
import java.awt.*;

public class MultiPlayerMenuPanel extends JPanel{

    MultiPlayerMenuBackground background;
    MultiPlayerMenuBackButton backButton = new MultiPlayerMenuBackButton();
    JLabel title = new JLabel("MultiPlayer");

    public MultiPlayerMenuPanel(){

        title.setBounds(540,0,200,50);
        title.setFont(new Font("Immortal",Font.BOLD,30));
        title.setHorizontalAlignment(JLabel.CENTER);

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        background = new MultiPlayerMenuBackground();

        this.add(backButton);
        this.add(title);
        this.add(background);

        this.setVisible(true);

    }
}
