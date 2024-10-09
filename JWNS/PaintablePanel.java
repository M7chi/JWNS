package JWNS;

import java.awt.Color;
import JWNS.util.ShowInFrame;

public class PaintablePanel extends SizedPanel {

    Paintable pa;

    public PaintablePanel(Paintable pa) {
        this.pa = pa;
    }

    public void paintComponent(java.awt.Graphics g) {
        pa.paintTo(g);
    }

    public static void main(String[] args) {

        ShowInFrame.show(new PaintablePanel(new PaintableOval(100, 50, 300, 500, new Color(255, 100, 100))));
        // ShowInFrame.show(new PaintablePanel(new PaintableOval(10, 10, 300, 400)));
        // ShowInFrame.show(new PaintablePanel(new PaintableRectangle(10, 10, 400,
        // 200)));
    }
}
