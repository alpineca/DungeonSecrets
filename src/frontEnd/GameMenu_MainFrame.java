package frontEnd;

import backEnd.utility.ScreenResolution;

import javax.swing.*;

public class GameMenu_MainFrame{


    public static void GameMenuMainFrame() {
        //make the main frame


        JFrame GameMenuFrame = new JFrame();

//        GameMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        GameMenuFrame.setTitle("Chapter one");
        GameMenuFrame.setSize(ScreenResolution.getScreenWidth(), ScreenResolution.getScreenHeight());
        GameMenuFrame.setLayout(null);
        GameMenuFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
         GameMenuFrame.setUndecorated(true);
        GameMenuFrame.setVisible(true);

        //layering panels
        GameMenuFrame.add(MenuPanel.getMenuPanel());



//      1st try for game tile
//        GameBoard GameBoardTile = new GameBoard();
//        GameMenuFrame.add(GameBoardTile);




        // GameMenuFrame.add(MainPanel.getBackgroundLabel());
        // GameMenuFrame.add(MainPanel.getMainPanel());


        MainPanel mainPanel = new MainPanel();
        GameMenuFrame.add(mainPanel);

        BackGround background = new BackGround();
        GameMenuFrame.add(background);


        //hero health overlaps side panel. I dont know how to do this better
        GameMenuFrame.add(SidePanel.getHeroLabel());
        GameMenuFrame.add(SidePanel.getHeroHealth());
        GameMenuFrame.add(SidePanel.getHeroResources());

        GameMenuFrame.add(SidePanel.getEnemyLabel());
        GameMenuFrame.add(SidePanel.getEnemyHealth());
        GameMenuFrame.add(SidePanel.getEnemyResources());

        GameMenuFrame.add(SidePanel.getEmptyLabel());

        //adding side panel to the main frame .. bars should be added in the side panel class
        GameMenuFrame.add(SidePanel.getSidePanel());


        //refreshes the frame. otherwise the ui glitches    why is otherwise underlined?
        SwingUtilities.updateComponentTreeUI(GameMenuFrame);

    }


}
