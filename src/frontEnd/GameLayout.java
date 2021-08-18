package frontEnd;

import backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class GameLayout{

    public GameLayout(){
        this.bootstrap();
    }

    private JFrame bootstrap() {
        //make the main frame


        JFrame GameMenuPanel = new JFrame();
//        JPanel GameMenuPanel = new JPanel();
//        GameMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        GameMenuFrame.setTitle("Chapter one");
//        GameMenuPanel.setSize(ScreenResolution.getScreenWidth(), ScreenResolution.getScreenHeight());
//        GameMenuPanel.setLayout(null);
//        GameMenuPanel.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        GameMenuPanel.setUndecorated(true);
        GameMenuPanel.setBounds(0, 0 , ScreenResolution.getScreenWidth(), ScreenResolution.getScreenHeight());
        GameMenuPanel.setLayout(null);
        GameMenuPanel.setBackground(Color.darkGray);
        GameMenuPanel.setVisible(true);

        //layering panels
        GameMenuPanel.add(MenuPanel.getMenuPanel());



//      1st try for game tile
//        GameBoard GameBoardTile = new GameBoard();
//        GameMenuFrame.add(GameBoardTile);




        // GameMenuFrame.add(MainPanel.getBackgroundLabel());
        // GameMenuFrame.add(MainPanel.getMainPanel());


        MainPanel mainPanel = new MainPanel();
        GameMenuPanel.add(mainPanel);

        BackGround background = new BackGround();
        GameMenuPanel.add(background);


        //hero health overlaps side panel. I dont know how to do this better
        GameMenuPanel.add(SidePanel.getHeroLabel());
        GameMenuPanel.add(SidePanel.getHeroHealth());
        GameMenuPanel.add(SidePanel.getHeroResources());

        GameMenuPanel.add(SidePanel.getEnemyLabel());
        GameMenuPanel.add(SidePanel.getEnemyHealth());
        GameMenuPanel.add(SidePanel.getEnemyResources());

        GameMenuPanel.add(SidePanel.getEmptyLabel());

        //adding side panel to the main frame .. bars should be added in the side panel class
        GameMenuPanel.add(SidePanel.getSidePanel());


        //refreshes the frame. otherwise the ui glitches    why is otherwise underlined?
//        SwingUtilities.updateComponentTreeUI(GameMenuPanel);
        return GameMenuPanel;
    }


}
