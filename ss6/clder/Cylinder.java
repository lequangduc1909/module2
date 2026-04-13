public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1;
    }

    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    public Cylinder(double r, String c, double h) {
        super(r, c);
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public String toString() {
        return "Cylinder: " + super.toString() + ", height=" + height;
    }
}