public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(2, "blue");
        System.out.println(c);
        System.out.println("Diện tích = " + c.getArea());

        System.out.println("----------------");

        Cylinder cy = new Cylinder(2, "green", 5);
        System.out.println(cy);
        System.out.println("Thể tích = " + cy.getVolume());
    }
}