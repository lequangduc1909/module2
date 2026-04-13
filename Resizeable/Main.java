import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        Random ngaunhien = new Random();

        for (int i = 0; i < shapes.length; i++) {

            Shape shape = shapes[i];

            System.out.println(shape);
            System.out.println("Diện tích trước: " + shape.area());

            double percent = ngaunhien.nextInt(100) + 1;

            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
                System.out.println("Resize: +" + percent + "%");
            }

            System.out.println(shape);
            System.out.println("Diện tích sau đó: " + shape.area());
            System.out.println("--------------------");
        }
    }
}