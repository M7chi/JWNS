package JWNS;

import java.awt.Graphics;

public interface GameObject extends Movable {

    double getWidth();
    double getHeight();
    Vertex getPos();
    Vertex getDeltaPos();
    void setDeltaPos(Vertex v);
    boolean isLargerThan(GameObject that);
    boolean isLeftOf(GameObject that);
    boolean isAbove(GameObject that);
    boolean touches(GameObject that);
    void paintTo(Graphics g);

}
