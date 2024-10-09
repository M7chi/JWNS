package JWNS;
import java.awt.Color;

public class SimpleTriangle extends GeometricObject {
    public SimpleTriangle (Vertex pos, double width, Color color) {
        super(pos, width, Math.sqrt(3) / 2 * width, color);

    }

    public double TH(){
        return Math.sqrt(3) / 2 * width;
    }
    @Override public String toString() {
        return "Simple Triangle " + super.toString();
    }
}
