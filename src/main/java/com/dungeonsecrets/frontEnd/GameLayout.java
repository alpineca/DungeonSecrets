package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;

public class GameLayout extends JPanel{

    public GameLayout(){
        this.bootstrap();
    }

    public JPanel bootstrap() {

        this.setBounds(0, 0 , ScreenResolution.getScreenWidth(), ScreenResolution.getScreenHeight());
        this.setLayout(null);
        this.setVisible(true);


        //ADDING MENU BUTTONS
        this.add(MenuButtons.getMenuButtonOptions());
        this.add(MenuButtons.getMenuButtonActions());
        this.add(MenuButtons.getMenuButtonLog());
        this.add(MenuButtons.getMenuButtonInventory());
        this.add(MenuButtons.getMenuButtonEncyclopedia());

        //ADDING MENU PANELS
        this.add(MenuPanel.getMenuPanelOptions());
        this.add(MenuPanel.getMenuPanelActions());
        this.add(MenuPanel.getMenuPanelLog());
        this.add(MenuPanel.getMenuPanelInventory());
        this.add(MenuPanel.getMenuPanelEncyclopedia());

        // GAME ELEMENTS
        MainPanel mainPanel = new MainPanel();
        BackGround background = new BackGround();
        this.add(background);

        CharacterPanel characterPanel = new CharacterPanel();
        this.add(characterPanel);
        EnemyPanel enemyPanel = new EnemyPanel();
        this.add(enemyPanel);


        this.add(SidePanel.getSidePanel());
        this.add(mainPanel);

        this.addKeyListener(mainPanel);

        this.add(background);



        //refreshes the frame. otherwise the ui glitches    why is otherwise underlined?
        SwingUtilities.updateComponentTreeUI(this);
        return this;
    }


}
