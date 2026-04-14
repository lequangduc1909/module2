public class Rectangle extends Shape {
    private double witdh;
    private double length;

    public Rectangle(double witdh, double length) {
        setLength(length);
        setWitdh(witdh);
    }

    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh ) {
        if (witdh <=0){
            System.out.println("Độ dài không hợp lê");
            return;
        }
        this.witdh = witdh;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <=0){
            System.out.println("Độ dài không hợp lệ");
            return;
        }
        this.length = length;
    }

    @Override
    public double area() {
        return length * witdh;
    }
}
