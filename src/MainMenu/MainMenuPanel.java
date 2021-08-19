package MainMenu;

import javax.swing.*;
import java.awt.*;

public class MainMenuPanel extends JPanel {

    MainMenuBackground mainMenuBackground;
    MainMenuSinglePlayerButton singlePlayerButton;
    MainMenuMultiPlayerButton multiPlayerButton;
    MainMenuCharactersButton charactersButton;
    MainMenuOptionsButton optionsButton;
    MainMenuQuitButton quitButton;

    public MainMenuPanel(){

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        mainMenuBackground = new MainMenuBackground();
        singlePlayerButton = new MainMenuSinglePlayerButton();
        multiPlayerButton = new MainMenuMultiPlayerButton();
        charactersButton = new MainMenuCharactersButton();
        optionsButton = new MainMenuOptionsButton();
        quitButton = new MainMenuQuitButton();

        this.add(quitButton);
        this.add(optionsButton);
        this.add(charactersButton);
        this.add(multiPlayerButton);
        this.add(singlePlayerButton);
        this.add(mainMenuBackground);

    }

}
