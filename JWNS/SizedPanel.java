package JWNS;
import JWNS.util.ShowInFrame;
import javax.swing.*;
import java.awt.Dimension;

public class SizedPanel extends JPanel {
    int preferredWidth = 700;
    int preferredHeight = 600;

    public SizedPanel(int w, int h){
        preferredWidth = w;
        preferredHeight = h;
    }

    public SizedPanel() {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(preferredWidth, preferredHeight);
    }

    public static void main(String[] args) {
        ShowInFrame.show("Zweiter test", new SizedPanel());
    }
}