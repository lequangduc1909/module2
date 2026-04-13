public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius;
    }
}