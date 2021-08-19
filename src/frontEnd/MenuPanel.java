package frontEnd;

import javax.swing.*;
import java.awt.*;

public class MenuPanel {

    private static JPanel menuPanel(){

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.yellow);
        //Temporary positioning since we have not decided on it yet
        menuPanel.setBounds(1000,1000,500,30);
        menuPanel.setOpaque(true);
        return menuPanel;

    }
    public static JPanel getMenuPanel (){
        return  menuPanel();
    }


}
