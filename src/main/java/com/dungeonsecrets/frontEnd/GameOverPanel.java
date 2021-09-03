package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOverPanel extends JPanel {

    JLabel messageLabel                        = new JLabel();
    BackgroundWithoutLogo mainMenuBackground   = new BackgroundWithoutLogo();
    JButton quitGameButton = new JButton("Quit Game");
    JButton backToMainMenuButton = new JButton("Back to Main Menu");

    public GameOverPanel(){

        messageLabel.setBounds((int)(ScreenResolution.getScreenWidth()*0.20),(int)(ScreenResolution.getScreenHeight()*0.20),(int)(ScreenResolution.getScreenWidth()*0.60),(int)(ScreenResolution.getScreenHeight()*0.60));
        messageLabel.setText("YOU DON'T LOSE");
        messageLabel.setForeground(new Color(111,0,0));
        messageLabel.setFont(new Font("Immortal",Font.BOLD,100));
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        quitGameButton.setBounds((int)(ScreenResolution.getScreenWidth()*0.30),(int)(ScreenResolution.getScreenHeight()*0.94),(int)(ScreenResolution.getScreenWidth()*0.20),(int)(ScreenResolution.getScreenHeight()*0.05));
        quitGameButton.setForeground(new Color(111,0,0));
        quitGameButton.setFont(new Font("Immortal",Font.BOLD,30));
        quitGameButton.setHorizontalAlignment(JLabel.CENTER);
        quitGameButton.setBackground(new Color(196,153,80));
        quitGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        backToMainMenuButton.setBounds((int)(ScreenResolution.getScreenWidth()*0.50),(int)(ScreenResolution.getScreenHeight()*0.94),(int)(ScreenResolution.getScreenWidth()*0.20),(int)(ScreenResolution.getScreenHeight()*0.05));
        backToMainMenuButton.setForeground(new Color(111,0,0));
        backToMainMenuButton.setFont(new Font("Immortal",Font.BOLD,30));
        backToMainMenuButton.setHorizontalAlignment(JLabel.CENTER);
        backToMainMenuButton.setBackground(new Color(196,153,80));
        backToMainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.closeGameOverMenu();
                MainFrame.openMainMenu();
            }
        });

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        this.add(backToMainMenuButton);
        this.add(quitGameButton);
        this.add(messageLabel);
        this.add(mainMenuBackground);

    }

}
