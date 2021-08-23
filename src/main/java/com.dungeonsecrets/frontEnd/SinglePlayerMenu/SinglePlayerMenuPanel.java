package com.dungeonsecrets.frontEnd.SinglePlayerMenu;

import javax.swing.*;
import java.awt.*;

public class SinglePlayerMenuPanel extends JPanel {

    SinglePlayerMenuBackground background;
    SinglePlayerMenuBackButton backButton = new SinglePlayerMenuBackButton();
    JLabel title = new JLabel("SinglePlayer");

    public SinglePlayerMenuPanel(){

        title.setBounds(540,0,200,50);
        title.setFont(new Font("Immortal",Font.BOLD,30));
        title.setHorizontalAlignment(JLabel.CENTER);

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        background = new SinglePlayerMenuBackground();

        this.add(backButton);
        this.add(title);
        this.add(background);

        this.setVisible(true);


    }

}
