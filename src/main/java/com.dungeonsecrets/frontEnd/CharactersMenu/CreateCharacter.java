package com.dungeonsecrets.frontEnd.CharactersMenu;

import com.dungeonsecrets.backEnd.processors.Character;
import com.dungeonsecrets.backEnd.utility.ScreenResolution;
import com.dungeonsecrets.frontEnd.MainFrame.MainFrame;
import com.dungeonsecrets.sound.ButtonClickSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CreateCharacter extends JPanel {

    CharactersMenuBackground background = new CharactersMenuBackground();
    JLabel backButton = new JLabel();
    JLabel chooseName = new JLabel("Choose Name: ");
    JLabel chooseClass = new JLabel("Choose Class: ");
    JLabel createButton = new JLabel();
    static JTextField nameField = new JTextField();
    JComboBox classBox = new JComboBox();

    public CreateCharacter(){

        chooseName.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)-25,300,30);
        chooseName.setForeground(new Color(111,0,0));
        chooseName.setFont(new Font("Immortal",Font.BOLD,30));
        chooseName.setOpaque(false);
        chooseName.setHorizontalAlignment(JLabel.RIGHT);

        chooseClass.setBounds((ScreenResolution.getScreenWidth()/2)-300,(ScreenResolution.getScreenHeight()/2)+15,300,30);
        chooseClass.setForeground(new Color(111,0,0));
        chooseClass.setFont(new Font("Immortal",Font.BOLD,30));
        chooseClass.setOpaque(false);
        chooseClass.setHorizontalAlignment(JLabel.RIGHT);

        nameField.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)-25,200,30);
        nameField.setOpaque(true);
        nameField.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        nameField.setForeground(new Color(111,0,0));
        nameField.setBackground(new Color(196,153,80));
        nameField.setFont(new Font("Immortal",Font.BOLD,30));

        classBox.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+15,200,30);
        classBox.setOpaque(true);
        classBox.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        classBox.setForeground(new Color(111,0,0));
        classBox.setBackground(new Color(196,153,80));
        classBox.setFont(new Font("Immortal",Font.BOLD,30));
        classBox.addItem("Warrior");
        classBox.addItem("Mage");
        classBox.addItem("Archer");
        classBox.addItem("Priest");

        backButton.setForeground(new Color(111,0,0));
        backButton.setText("Back");
        backButton.setFont(new Font("Immortal",Font.BOLD,30));
        backButton.setBackground(Color.BLACK);
        backButton.setOpaque(false);
        backButton.setBounds((ScreenResolution.getScreenWidth()/2)-200,(ScreenResolution.getScreenHeight()/2)+80,200,30);
        backButton.setHorizontalAlignment(JLabel.CENTER);
        backButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();
                MainFrame.closeCreateCharactersMenu();
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
                backButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                backButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        createButton.setForeground(new Color(111,0,0));
        createButton.setText("Create");
        createButton.setFont(new Font("Immortal",Font.BOLD,30));
        createButton.setBackground(Color.BLACK);
        createButton.setOpaque(false);
        createButton.setBounds((ScreenResolution.getScreenWidth()/2),(ScreenResolution.getScreenHeight()/2)+80,200,30);
        createButton.setHorizontalAlignment(JLabel.CENTER);
        createButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ButtonClickSound();

                ChooseCharacterPanel.characterModel.addElement(new Character(nameField.getText(), classBox.getSelectedItem().toString()));

                MainFrame.closeCreateCharactersMenu();
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
                createButton.setFont(new Font("Immortal",Font.BOLD,31));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                createButton.setFont(new Font("Immortal",Font.BOLD,30));
            }
        });

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        this.add(createButton);
        this.add(classBox);
        this.add(nameField);
        this.add(chooseClass);
        this.add(chooseName);
        this.add(backButton);
        this.add(background);

    }


}
