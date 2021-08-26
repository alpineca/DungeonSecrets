package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.frontEnd.BackgroundWithLogo;
import com.dungeonsecrets.frontEnd.BackgroundWithoutLogo;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MultiPlayerMenuPanel extends JPanel{

    BackgroundWithoutLogo background = new BackgroundWithoutLogo();
    JLabel backButton = new JLabel();
    JLabel title = new JLabel("MultiPlayer");

    public MultiPlayerMenuPanel(){

        backButton.setForeground(new Color(111,0,0));
        backButton.setText("Back");
        backButton.setFont(new Font("Immortal",Font.BOLD,30));
        backButton.setBackground(Color.BLACK);
        backButton.setOpaque(false);
        backButton.setBounds(ScreenResolution.getScreenWidth() / 2 - 100,ScreenResolution.getScreenHeight() / 2 + 184,200,40);
        backButton.setHorizontalAlignment(JLabel.CENTER);
        backButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();
                MainFrame.closeMultiPlayerMenu();
                MainFrame.openMainMenu();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                backButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                backButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        title.setBounds(540,0,200,50);
        title.setFont(new Font("Immortal",Font.BOLD,30));
        title.setHorizontalAlignment(JLabel.CENTER);

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        this.add(backButton);
        this.add(title);
        this.add(background);

        this.setVisible(true);

    }
}
