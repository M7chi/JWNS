package JWNS;

public class GeometricObject {

    public Vertex pos;
    public double width;
    public double hight;

    public GeometricObject(Vertex pos, double width, double hight) {
        this.pos = pos;
        if (width > 0) {
            this.width = Math.abs(width);
            this.pos.x = this.pos.x - this.width;
        } else {
            this.width = width;
        }

        if (width > 0) {
            this.width = Math.abs(width);
            this.pos.y = this.pos.y - this.width;
        } else {
            this.width = width;
        }

        if (hight > 0) {
            this.hight = Math.abs(hight);
            this.pos.x = this.pos.x - this.hight;
        } else {
            this.hight = hight;
        }

        if (hight > 0) {
            this.hight = Math.abs(hight);
            this.pos.y = this.pos.y - this.hight;
        } else {
            this.hight = hight;
        }

        this.pos = pos;
        this.width = width;
        this.hight = hight;
    }

    public GeometricObject(double posx, double posy, double width, double hight) {
        this(new Vertex(posx, posy), width, hight);
    }

    public GeometricObject(Vertex pos, double width) {
        this(pos, width, width);
    }

    public GeometricObject(double width, double hight) {
        this(0, 0, width, hight);
    }

    public GeometricObject() {
        this(10, 10);
    }
    
}