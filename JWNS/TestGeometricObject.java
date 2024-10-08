package JWNS;

public class TestGeometricObject {

    public static void main(String[] args) {
        SimpleTriangle t1 = new SimpleTriangle(new Vertex(10, 10), 10);
        System.out.println(t1.TH());
        System.out.println(t1);
        GeometricObject o1 = new GeometricObject(0, 0, 187, 187);
        System.out.println(o1);
        System.out.println(t1.distance(o1));
    }


}