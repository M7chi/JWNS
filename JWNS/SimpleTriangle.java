package JWNS;

public class SimpleTriangle extends GeometricObject {
    public SimpleTriangle (Vertex pos, double width) {
        super(pos, width, Math.sqrt(3) / 2 * width);

    }

    public double TH(){
        return Math.sqrt(3) / 2 * width;
    }
    @Override public String toString() {
        return "Simple Triangle " + super.toString();
    }
}
