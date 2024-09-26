package JWNS;


public class SimpleRectangle extends GeometricObject {
    public SimpleRectangle (Vertex pos, double width, double height) {
        super(pos, width, height);
    }

    public SimpleRectangle(double posx, double posy, double width, double height){
        
        super(new Vertex(posx, posy), width, height);
    }

    @Override public String toString() {
        return "Simple Rectangle " + super.toString();
    }

}

    

