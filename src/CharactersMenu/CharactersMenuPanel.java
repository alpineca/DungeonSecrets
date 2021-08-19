package CharactersMenu;

import javax.swing.*;
import java.awt.*;

public class CharactersMenuPanel extends JPanel{

    CharactersMenuBackground background;
    CharactersMenuBackButton backButton = new CharactersMenuBackButton();
    JLabel title = new JLabel("Characters");

    public CharactersMenuPanel(){

        title.setBounds(540,0,200,50);
        title.setFont(new Font("Immortal",Font.BOLD,30));
        title.setHorizontalAlignment(JLabel.CENTER);

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        background = new CharactersMenuBackground();

        this.add(backButton);
        this.add(title);
        this.add(background);

        this.setVisible(true);


    }

}
