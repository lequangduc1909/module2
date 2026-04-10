package access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Bán kính: " + c1.getRadius());
        System.out.println("Diện tích: " + c1.getArea());
        System.out.println("-------------------------------");

        Circle c2 = new Circle(9.8765);
        System.out.println("bán kinh: " + c2.getRadius());
        System.out.println("Diện tích: " + c2.getArea());
    }
}