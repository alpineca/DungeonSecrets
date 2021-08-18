package frontEnd;

import javax.swing.*;
import java.awt.*;
//unnecessary
public class GameBoard extends JPanel {

    final int SIZE_OF_TILE = 100;

    public GameBoard(){

        this.setBounds(1000,500,SIZE_OF_TILE,SIZE_OF_TILE);
        //this.setBackground(Color.pink);
        this.setOpaque(false);
        this.setBorder(BorderFactory.createLineBorder(Color.black));

    }


}
