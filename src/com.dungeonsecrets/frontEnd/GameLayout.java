package com.dungeonsecrets.frontEnd;

import com.dungeonsecrets.backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class GameLayout extends JPanel{

    public GameLayout(){
        this.bootstrap();
    }

    private JPanel bootstrap() {
        //make the main frame

        this.setBounds(0, 0 , ScreenResolution.getScreenWidth(), ScreenResolution.getScreenHeight());
        this.setLayout(null);
        this.setBackground(Color.darkGray);
        this.setVisible(true);

        //layering panels
        this.add(MenuPanel.getMenuPanel());

        MainPanel mainPanel = new MainPanel();
        this.add(mainPanel);

        BackGround background = new BackGround();
        this.add(background);


        //hero health overlaps side panel. I dont know how to do this better
        this.add(SidePanel.getHeroLabel());
        this.add(SidePanel.getHeroHealth());
        this.add(SidePanel.getHeroResources());

        this.add(SidePanel.getEnemyLabel());
        this.add(SidePanel.getEnemyHealth());
        this.add(SidePanel.getEnemyResources());

        this.add(SidePanel.getEmptyLabel());

        //adding side panel to the main frame .. bars should be added in the side panel class
        this.add(SidePanel.getSidePanel());


        //refreshes the frame. otherwise the ui glitches    why is otherwise underlined?
        SwingUtilities.updateComponentTreeUI(this);
        return this;
    }


}
