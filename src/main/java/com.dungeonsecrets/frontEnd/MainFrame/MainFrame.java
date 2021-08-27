package com.dungeonsecrets.frontEnd.MainFrame;

import com.dungeonsecrets.frontEnd.CharactersMenu.ChooseCharacterPanel;
import com.dungeonsecrets.frontEnd.CharactersMenu.CreateCharacter;
import com.dungeonsecrets.frontEnd.MainMenuPanel;
import com.dungeonsecrets.frontEnd.MultiPlayerMenuPanel;
import com.dungeonsecrets.frontEnd.EncyclopediaMenuPanel;
import com.dungeonsecrets.frontEnd.GameLayout;
import com.dungeonsecrets.frontEnd.LoginMenu;
import com.dungeonsecrets.frontEnd.RegisterMenu;

import javax.swing.*;

public class MainFrame {


    private static JFrame mainFrame                                 = new JFrame();
    private static MainMenuPanel mainMenuPanel                      = new MainMenuPanel();
    private static MultiPlayerMenuPanel multiPlayerMenu             = new MultiPlayerMenuPanel();
    private static EncyclopediaMenuPanel encyclopediaMenu            = new EncyclopediaMenuPanel();
    private static LoginMenu loginMenu                              = new LoginMenu();
    private static RegisterMenu registerMenu                        = new RegisterMenu();
    private static GameLayout mainLayout                            = new GameLayout();
    private static CreateCharacter createCharactersMenu             = new CreateCharacter();
    private static ChooseCharacterPanel chooseCharacterMenu         = new ChooseCharacterPanel();

    public MainFrame(){

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setUndecorated(true);
        mainFrame.setLayout(null);

        mainFrame.add(chooseCharacterMenu);
        mainFrame.add(createCharactersMenu);
        mainFrame.add(mainLayout);
        mainFrame.add(registerMenu);
        mainFrame.add(loginMenu);
        mainFrame.add(mainMenuPanel);
        mainFrame.add(multiPlayerMenu);
        mainFrame.add(encyclopediaMenu);

        chooseCharacterMenu.setVisible(false);
        createCharactersMenu.setVisible(false);
        loginMenu.setVisible(true);
        mainLayout.setVisible(false);
        registerMenu.setVisible(false);
        multiPlayerMenu.setVisible(false);
        encyclopediaMenu.setVisible(false);
        mainMenuPanel.setVisible(false);

        mainFrame.setVisible(true);

    }

    public static void openChooseCharacterMenu(){

        chooseCharacterMenu.setVisible(true);

    }

    public static void openCreateCharactersMenu(){

        createCharactersMenu.setVisible(true);

    }

    public static void openRegisterMenu(){

        registerMenu.setVisible(true);

    }

    public static void openMainLayout(){

        mainLayout.setVisible(true);
        mainLayout.requestFocus();

    }

    public static void openLoginMenu(){

        loginMenu.setVisible(true);

    }

    public static void openMainMenu(){

        mainMenuPanel.setVisible(true);

    }

    public static void openMultiPlayerMenu(){

        multiPlayerMenu.setVisible(true);

    }

    public static void openOptionsMenu(){

        encyclopediaMenu.setVisible(true);

    }

    public static void closeChooseCharacterMenu(){

        chooseCharacterMenu.setVisible(false);

    }

    public static void closeCreateCharactersMenu(){

        createCharactersMenu.setVisible(false);

    }

    public static void closeRegisterMenu(){

        registerMenu.setVisible(false);

    }

    public static void closeLoginMenu(){

        loginMenu.setVisible(false);

    }

    public static void closeMainMenu(){

        mainMenuPanel.setVisible(false);

    }

    public static void closeMultiPlayerMenu(){

        multiPlayerMenu.setVisible(false);

    }

    public static void closeOptionsMenu(){

        encyclopediaMenu.setVisible(false);

    }
}
