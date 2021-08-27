package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.sound.ButtonClickSound;
import com.dungeonsecrets.sound.MusicManager;
import com.dungeonsecrets.sound.MusicThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainMenuPanel extends JPanel {

    public static boolean isSinglePlayerSelectedOrCharacters    = false;
    BackgroundWithLogo mainMenuBackground                       = new BackgroundWithLogo();
    JLabel singlePlayerButton                                   = new JLabel();
    JLabel multiPlayerButton                                    = new JLabel();
    JLabel charactersButton                                     = new JLabel();
    JLabel EncyclopediaButton                                   = new JLabel();
    JLabel quitButton                                           = new JLabel();

    public MainMenuPanel(){

        //SINGLEPLAYER BUTTON

        singlePlayerButton.setForeground(new Color(111,0,0));
        singlePlayerButton.setText("Singleplayer");
        singlePlayerButton.setFont(new Font("Immortal",Font.BOLD,30));
        singlePlayerButton.setBackground(Color.BLACK);
        singlePlayerButton.setOpaque(false);
        singlePlayerButton.setBounds(ScreenResolution.getScreenWidth()/ 2 - 100,ScreenResolution.getScreenHeight()/ 2 + 1,200,40);
        singlePlayerButton.setHorizontalAlignment(JLabel.CENTER);
        singlePlayerButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                new ButtonClickSound();

                isSinglePlayerSelectedOrCharacters = true;
                MainFrame.closeMainMenu();
                MainFrame.openChooseCharacterMenu();


//        com.dungeonsecrets.frontEnd.MainFrame.openSinglePlayerMenu();
//        GameLayout mainLayout = new GameLayout();
//        this.add(mainLayout);

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                singlePlayerButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                singlePlayerButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        //MULTIPLAYER BUTTON

        multiPlayerButton.setForeground(new Color(111,0,0));
        multiPlayerButton.setText("Multiplayer");
        multiPlayerButton.setFont(new Font("Immortal",Font.BOLD,30));
        multiPlayerButton.setBackground(Color.BLACK);
        multiPlayerButton.setOpaque(false);
        multiPlayerButton.setBounds(ScreenResolution.getScreenWidth()/ 2 - 100,ScreenResolution.getScreenHeight()/ 2 + 62,200,40);
        multiPlayerButton.setHorizontalAlignment(JLabel.CENTER);
        multiPlayerButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();
                MainFrame.closeMainMenu();
                MainFrame.openMultiPlayerMenu();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                multiPlayerButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                multiPlayerButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        //CHARACTERS BUTTON

        charactersButton.setForeground(new Color(111,0,0));
        charactersButton.setText("Characters");
        charactersButton.setFont(new Font("Immortal",Font.BOLD,30));
        charactersButton.setBackground(Color.BLACK);
        charactersButton.setOpaque(false);
        charactersButton.setBounds(ScreenResolution.getScreenWidth()/ 2 - 100,ScreenResolution.getScreenHeight()/ 2 + 123,200,40);
        charactersButton.setHorizontalAlignment(JLabel.CENTER);
        charactersButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();
                MainFrame.closeMainMenu();
                MainFrame.openChooseCharacterMenu();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                charactersButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                charactersButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        //ENCYCLOPEDIA BUTTON

        EncyclopediaButton.setForeground(new Color(111,0,0));
        EncyclopediaButton.setText("Encyclopedia");
        EncyclopediaButton.setFont(new Font("Immortal",Font.BOLD,30));
        EncyclopediaButton.setBackground(Color.BLACK);
        EncyclopediaButton.setOpaque(false);
        EncyclopediaButton.setBounds(ScreenResolution.getScreenWidth()/ 2 - 100,ScreenResolution.getScreenHeight()/ 2 + 184,210,40);
        EncyclopediaButton.setHorizontalAlignment(JLabel.CENTER);
        EncyclopediaButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();
                MainFrame.closeMainMenu();
                MainFrame.openOptionsMenu();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                EncyclopediaButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                EncyclopediaButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        //QUIT BUTTON

        quitButton.setForeground(new Color(111,0,0));
        quitButton.setText("Quit");
        quitButton.setFont(new Font("Immortal",Font.BOLD,30));
        quitButton.setBackground(Color.BLACK);
        quitButton.setOpaque(false);
        quitButton.setBounds(ScreenResolution.getScreenWidth()/ 2 - 100,ScreenResolution.getScreenHeight()/ 2 + 245,200,40);
        quitButton.setHorizontalAlignment(JLabel.CENTER);
        quitButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                quitButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                quitButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        this.add(quitButton);
        this.add(EncyclopediaButton);
        this.add(charactersButton);
        this.add(multiPlayerButton);
        this.add(singlePlayerButton);
        this.add(mainMenuBackground);

    }

}
