package JWNS;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleButton extends JPanel{
    JButton b = new JButton("Push this Button");
    JLabel l = new JLabel("000");

    SimpleButton(){
        add(b);
        add(l);
    }
    
}
