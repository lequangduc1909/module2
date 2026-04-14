public class Square extends Shape implements Colorable {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <=0){
            System.out.println("Cạnh không hợp lệ");
            return;
        }
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double area() {
        return side * side;
    }
}
