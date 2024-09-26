package JWNS;

public class SimpleSquare extends SimpleRectangle {
    public SimpleSquare (Vertex pos, double width) {
        super(pos, width, width);
    }

    public SimpleSquare(double posx, double posy, double width){
        
        super(new Vertex(posx, posy), width, width);
    }

    @Override public String toString() {
        return "Simple Square " + super.toString();
    }

}
