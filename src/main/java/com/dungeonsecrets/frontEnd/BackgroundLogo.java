package com.dungeonsecrets.frontEnd;

        import com.dungeonsecrets.backEnd.utility.ScreenResolution;

        import javax.swing.*;
        import java.awt.*;
        import java.util.Objects;

public class BackgroundLogo extends JLabel {


    BackgroundLogo() {
        this.setVisible(false);
        this.setBounds((int)(ScreenResolution.getScreenWidth()*0.30),(int)(ScreenResolution.getScreenHeight()*0.0),(int)(ScreenResolution.getScreenWidth()*0.40),(int)(ScreenResolution.getScreenHeight()*0.65));
        this.setLayout(null);

    }


    Image icon = new ImageIcon("src/main/resources/imgs/OnlyLogoOld.png").getImage();

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        int width = this.getWidth();
        int height = this.getHeight();
        g2D.drawImage(icon, 0, 0, width, height, null);

    }
}