package backEnd.utility;

import java.awt.*;

public class ScreenResolution {

//    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//    int width = (int) screenSize.getWidth();
//    int height = (int) screenSize.getHeight();
//
    public static int getScreenWidth(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return (int) screenSize.getWidth();
    }
    public static int getScreenHeight(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return (int) screenSize.getHeight();
    }

}
