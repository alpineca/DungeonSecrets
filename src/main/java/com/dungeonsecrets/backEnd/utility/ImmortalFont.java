package com.dungeonsecrets.backEnd.utility;

import java.awt.*;
import java.io.File;
import java.net.URL;

public class ImmortalFont {

    public Font getFont() throws Exception {
        URL url = getClass().getResource("/fonts/IMMORTAL.ttf");
        Font newFont = Font.createFont(Font.TRUETYPE_FONT, new File(url.toURI()));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(newFont);


        return newFont;
    }
}
