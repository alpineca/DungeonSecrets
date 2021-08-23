package com.dungeonsecrets.frontEnd.CharactersMenu;

import com.dungeonsecrets.backEnd.processors.CharacterCheck;
import com.dungeonsecrets.frontEnd.LoginMenu;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CharactersMenuPanel extends JPanel{

    CharactersMenuBackground background = new CharactersMenuBackground();
    CharactersMenuBackButton backButton = new CharactersMenuBackButton();

    JLabel title = new JLabel("Characters");

    public CharactersMenuPanel(){

        title.setBounds(540,0,200,50);
        title.setFont(new Font("Immortal",Font.BOLD,30));
        title.setHorizontalAlignment(JLabel.CENTER);

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        this.add(backButton);
        this.add(title);
        this.add(background);

    }

}
