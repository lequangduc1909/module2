public class main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 8);
        shapes[2] = new Square(4);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("------------------");
            System.out.println("Hình thứ " + (i+1));
            System.out.println("Diện tích: " + shapes[i].area());

            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
        }
    }
}