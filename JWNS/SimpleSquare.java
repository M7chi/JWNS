package JWNS;
import java.awt.Color;

public class SimpleSquare extends SimpleRectangle {
    public SimpleSquare (Vertex pos, double width, Color color) {
        super(pos, width, width, color);
    }

    public SimpleSquare(double posx, double posy, double width){
        
        super(new Vertex(posx, posy), width, width, new Color(0,0,0));
    }

    @Override public String toString() {
        return "Simple Square " + super.toString();
    }

}
