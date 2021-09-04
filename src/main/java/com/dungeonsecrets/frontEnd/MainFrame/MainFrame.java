package com.dungeonsecrets.frontEnd.MainFrame;

import com.dungeonsecrets.frontEnd.*;
import com.dungeonsecrets.frontEnd.CharactersMenu.ChooseCharacterPanel;
import com.dungeonsecrets.frontEnd.CharactersMenu.CreateCharacter;

import javax.swing.*;

public class MainFrame {


    private static JFrame mainFrame                         = new JFrame();
    private static MainMenuPanel mainMenuPanel;
    private static MultiPlayerMenuPanel multiPlayerMenu;
    private static EncyclopediaMenuPanel encyclopediaMenu;
    private static LoginMenu loginMenu;
    private static RegisterMenu registerMenu;
    private static GameLayout mainLayout;
    private static CreateCharacter createCharactersMenu;
    private static ChooseCharacterPanel chooseCharacterMenu;
    private static GameOverPanel gameOverPanel;

    public MainFrame(){

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setUndecorated(true);
        mainFrame.setLayout(null);

        openLoginMenu();

//        mainFrame.add(mainLayout);
//        chooseCharacterMenu.setVisible(false);
//        createCharactersMenu.setVisible(false);
//        loginMenu.setVisible(true);
//        mainLayout.setVisible(false);
//        registerMenu.setVisible(false);
//        multiPlayerMenu.setVisible(false);
//        encyclopediaMenu.setVisible(false);
//        mainMenuPanel.setVisible(false);
        mainFrame.setVisible(true);

    }
    public static void openGameOverMenu(){
        gameOverPanel = new GameOverPanel();
        mainFrame.add(gameOverPanel);
        gameOverPanel.setVisible(true);
    }

    public static void openChooseCharacterMenu(){
        chooseCharacterMenu = new ChooseCharacterPanel();
        mainFrame.add(chooseCharacterMenu);
        chooseCharacterMenu.setVisible(true);
    }

    public static void openCreateCharactersMenu(){
        createCharactersMenu = new CreateCharacter();
        mainFrame.add(createCharactersMenu);
        createCharactersMenu.setVisible(true);
    }

    public static void openRegisterMenu(){
        registerMenu = new RegisterMenu();
        mainFrame.add(registerMenu);
        registerMenu.setVisible(true);
    }

    public static void openMainLayout(){

        mainLayout = new GameLayout();
        mainFrame.add(mainLayout);
        mainLayout.setVisible(true);
        mainLayout.requestFocus();
    }

    public static void openLoginMenu(){
        loginMenu = new LoginMenu();
        mainFrame.add(loginMenu);
        loginMenu.setVisible(true);
    }

    public static void openMainMenu(){
        mainMenuPanel = new MainMenuPanel();
        mainFrame.add(mainMenuPanel);
        mainMenuPanel.setVisible(true);
    }

    public static void openMultiPlayerMenu(){
        multiPlayerMenu = new MultiPlayerMenuPanel();
        mainFrame.add(multiPlayerMenu);
        multiPlayerMenu.setVisible(true);
    }

    public static void openEncyclopediaMenu(){
        encyclopediaMenu = new EncyclopediaMenuPanel();
        mainFrame.add(encyclopediaMenu);
        encyclopediaMenu.setVisible(true);
    }

    public static void closeGameOverMenu(){
        gameOverPanel.setVisible(false);
        mainFrame.remove(gameOverPanel);
    }

    public static void closeChooseCharacterMenu(){
        chooseCharacterMenu.setVisible(false);
        mainFrame.remove(chooseCharacterMenu);
    }

    public static void closeCreateCharactersMenu(){
        createCharactersMenu.setVisible(false);
        mainFrame.remove(createCharactersMenu);
    }

    public static void closeRegisterMenu(){
        registerMenu.setVisible(false);
        mainFrame.remove(registerMenu);
    }

    public static void closeLoginMenu(){
        loginMenu.setVisible(false);
        mainFrame.remove(loginMenu);
    }

    public static void closeMainMenu(){
        mainMenuPanel.setVisible(false);
        mainFrame.remove(mainMenuPanel);
    }

    public static void closeMultiPlayerMenu(){
        multiPlayerMenu.setVisible(false);
        mainFrame.remove(multiPlayerMenu);
    }

    public static void closeEncyclopediaMenu(){
        encyclopediaMenu.setVisible(false);
        mainFrame.remove(encyclopediaMenu);
    }
}
