package frontEnd;

import backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class GameLayout extends JPanel{

    public GameLayout(){
        this.bootstrap();
    }

    private JPanel bootstrap() {
        //make the main frame


//        JPanel GameMenuPanel = new JPanel();
//        JPanel GameMenuPanel = new JPanel();
//        GameMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        GameMenuFrame.setTitle("Chapter one");
//        GameMenuPanel.setSize(ScreenResolution.getScreenWidth(), ScreenResolution.getScreenHeight());
//        GameMenuPanel.setLayout(null);
//        GameMenuPanel.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        GameMenuPanel.setUndecorated(true);
        this.setBounds(0, 0 , ScreenResolution.getScreenWidth(), ScreenResolution.getScreenHeight());
        this.setLayout(null);
        this.setBackground(Color.darkGray);
        this.setVisible(true);

        //layering panels
        this.add(MenuPanel.getMenuPanel());

//

//      1st try for game tile
//        GameBoard GameBoardTile = new GameBoard();
//        GameMenuFrame.add(GameBoardTile);




        // GameMenuFrame.add(MainPanel.getBackgroundLabel());
        // GameMenuFrame.add(MainPanel.getMainPanel());


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
