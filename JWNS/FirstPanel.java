package JWNS;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstPanel extends JPanel{
    @Override
    public void paintComponent(java.awt.Graphics g){
        g.fillRect(50, 50, 200, 200);
        g.fillOval(100, 100, 300, 100);
    }
 
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
    }
}