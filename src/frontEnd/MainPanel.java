package frontEnd;

import backEnd.utility.ScreenResolution;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{



    MainPanel(){

//        int width   = ScreenResolution.getScreenWidth()-350;
        int width   = (int) ((ScreenResolution.getScreenWidth())*0.82);
        int height  = ScreenResolution.getScreenHeight();

        this.setOpaque(false);
        this.setBounds(0,0, ScreenResolution.getScreenWidth()-350, ScreenResolution.getScreenHeight());
        this.setLayout(null);

        GameGrid grid = new GameGrid();
        grid.setVisible(true);
        grid.setForeground(new Color(255, 255, 255));
        grid.setBounds(0, 0, width, height);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setAlignmentY(Component.CENTER_ALIGNMENT);
        this.add(grid);

        System.out.println(width);
        System.out.println(height);



    }




//    Image icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("background.jpg"))).getImage();
//
//    public void paint(Graphics g) {
//        super.paint(g);
//
//        Graphics2D g2D = (Graphics2D) g;
//
//        int width = this.getWidth();
//        int height = this.getHeight();
//        g2D.drawImage(icon,0,0,width,height,null);
//
//    }

//    public static JPanel mainPanel(){
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setBackground(Color.pink);
//        mainPanel.setBounds(0,0,1570,1080);
//        mainPanel.setLayout(null);
//
//        return mainPanel;
//    }
//    public static JPanel getMainPanel (){
//        return  mainPanel();
//    }


//    private static JLabel backgroundLabel(){
//
//        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SidePanel.class.getResource("background.jpg")));
//        JLabel heroLabel = new JLabel();
//
//        heroLabel.setBounds(0,0,1570,1080);
//        heroLabel.setIcon(icon);
//
//        return heroLabel;
//    }
//    public static JLabel getBackgroundLabel() {
//        return backgroundLabel();
//    }




}
