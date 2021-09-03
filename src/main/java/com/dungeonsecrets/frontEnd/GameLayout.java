package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;

public class GameLayout extends JPanel{

    public GameLayout(){
        this.bootstrap();
    }

    public JPanel bootstrap() {
        //make the main frame

        this.setBounds(0, 0 , ScreenResolution.getScreenWidth(), ScreenResolution.getScreenHeight());
        this.setLayout(null);
       // this.setBackground(Color.darkGray);
        this.setVisible(true);

        //layering panels


        this.add(MenuButtons.getMenuButtonOptions());
        this.add(MenuButtons.getMenuButtonActions());
        this.add(MenuButtons.getMenuButtonLog());
        this.add(MenuButtons.getMenuButtonInventory());
        //this.add(MenuPanel.getMenuPanel());

        this.add(MenuPanel.getMenuPanelOptions());
        this.add(MenuPanel.getMenuPanelActions());
        this.add(MenuPanel.getMenuPanelLog());
        this.add(MenuPanel.getMenuPanelInventory());

        MainPanel mainPanel = new MainPanel();


        BackGround background = new BackGround();
        this.add(background);


        //hero health overlaps side panel. I dont know how to do this better
//        this.add(SidePanel.getHeroLabel());
//        this.add(SidePanel.getHeroName());
//        this.add(SidePanel.getHeroHealth());
//        this.add(SidePanel.getHeroResources());

        CharacterPanel characterPanel = new CharacterPanel();
        this.add(characterPanel);

        EnemyPanel enemyPanel = new EnemyPanel();
        this.add(enemyPanel);
//        this.add(SidePanel.getEnemyLabel());
//        this.add(SidePanel.getEnemyName());
//        this.add(SidePanel.getEnemyHealth());
//        this.add(SidePanel.getEnemyResources());



       // this.add(SidePanel.getEmptyLabel());

        //adding side panel to the main frame .. bars should be added in the side panel class
        this.add(SidePanel.getSidePanel());
        this.add(mainPanel);

        this.addKeyListener(mainPanel);

        this.add(background);



        //refreshes the frame. otherwise the ui glitches    why is otherwise underlined?
        SwingUtilities.updateComponentTreeUI(this);
        return this;
    }


}
