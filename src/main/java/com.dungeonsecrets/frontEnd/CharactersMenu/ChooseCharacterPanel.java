package com.dungeonsecrets.frontEnd.CharactersMenu;

import com.dungeonsecrets.backEnd.processors.Character;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.frontEnd.BackgroundWithoutLogo;
import com.dungeonsecrets.frontEnd.LoginMenu;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.frontEnd.MainMenuPanel;
import com.dungeonsecrets.sound.ButtonClickSound;
import com.dungeonsecrets.sound.MusicManager;
import com.dungeonsecrets.sound.MusicThread;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseCharacterPanel extends JPanel {

    BackgroundWithoutLogo background = new BackgroundWithoutLogo();

//    String username = LoginMenu.getUsername();
    public static JList<Character> characterList                = new JList<>();
    public static DefaultListModel<Character> characterModel    = new DefaultListModel<>();
    JButton selectButton                                        = new JButton("Select");
    JButton createButton                                        = new JButton("Create New Character");
    JPanel characterInfoPanel                                   = new JPanel();
    JLabel characterInfoLabel                                   = new JLabel();
    JSplitPane characterSplitPane                               = new JSplitPane();
    JScrollPane characterScrollPane                             = new JScrollPane(characterList);

    public ChooseCharacterPanel(){

        characterList.setModel(characterModel);
        characterList.setOpaque(false);
        characterList.setBackground(new Color(196,153,80));
        characterList.setForeground(new Color(111,0,0));
        characterList.setBorder(BorderFactory.createLineBorder(new Color(196,153,80)));
        characterList.setFont(new Font("Immortal",Font.BOLD,30));

        characterList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Character chosenCharacter = characterList.getSelectedValue();
                characterInfoLabel.setText("Name: " + chosenCharacter.getCharacterName()+ " Class: " + chosenCharacter.getCharacterClass());

                selectButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        MusicThread.stopMusic();
                        MusicManager.music = new MusicThread();
                        MusicManager.music.startMusic("soundResources/CalmOutdoors.wav");

                        new ButtonClickSound();
                        if(e.getSource() == selectButton){
                            if(MainMenuPanel.isSinglePlayerSelectedOrCharacters) {
                                MainFrame.closeChooseCharacterMenu();
                                MainFrame.openMainLayout();
                            }
                            else{
                                MainFrame.closeChooseCharacterMenu();
                                MainFrame.openMainMenu();
                            }
                        }
                    }
                });
            }
        });

        selectButton.setBounds(1080,670,200,50);
        selectButton.setForeground(new Color(111,0,0));
        selectButton.setBackground(new Color(196,153,80));
        selectButton.setFocusable(false);

        createButton.setBounds(880,670,200,50);
        createButton.setForeground(new Color(111,0,0));
        createButton.setBackground(new Color(196,153,80));
        createButton.setFocusable(false);
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new ButtonClickSound();
                if(e.getSource() == createButton){
                    MainFrame.closeChooseCharacterMenu();
                    MainFrame.openCreateCharactersMenu();
                }
            }
        });

        characterInfoPanel.setOpaque(false);
        characterInfoPanel.setLayout(new FlowLayout());

        characterInfoLabel.setOpaque(false);
        characterInfoLabel.setForeground(new Color(111,0,0));
        characterInfoLabel.setFont(new Font("Immortal",Font.BOLD,30));

        characterScrollPane.setOpaque(false);
        characterScrollPane.getViewport().setOpaque(false);
        characterScrollPane.setBorder(BorderFactory.createLineBorder(new Color(196,153,80)));

        characterSplitPane.setBounds(0,0, ScreenResolution.getScreenWidth(),ScreenResolution.getScreenHeight());
        characterSplitPane.setForeground(new Color(111,0,0));
        characterSplitPane.setFont(new Font("Immortal",Font.BOLD,30));
        characterSplitPane.setBorder(BorderFactory.createLineBorder(new Color(196,153,80)));
        characterSplitPane.setLeftComponent(characterScrollPane);
        characterSplitPane.setDividerLocation(300);
        characterSplitPane.setOpaque(false);
        characterInfoPanel.add(characterInfoLabel);
        characterSplitPane.setRightComponent(characterInfoPanel);

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        this.add(createButton);
        this.add(selectButton);
        this.add(characterSplitPane);
        this.add(background);

    }


}
