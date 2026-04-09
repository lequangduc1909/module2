import java.util.Scanner;

public class QuadraticEquation {

    double a;
    double b;
    double c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a,b,c lần lượt: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        QuadraticEquation pt = new QuadraticEquation(x, y, z);

        double d = pt.getDelta();

        if (d > 0) {
            System.out.println("2 nghiệm: " + pt.root1() + " và " + pt.root2());
        } else if (d == 0) {
            System.out.println("1 nghiện: " + pt.root1());
        } else {
            System.out.println("vô nghiệm.");
        }

    }

    public QuadraticEquation(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    public double getDelta() {
        double d = b * b - 4 * a * c;
        return d;
    }

    public double root1() {
        double d = getDelta();
        if (d >= 0) {
            return (-b + Math.sqrt(d)) / (2 * a);
        }
        return 0;
    }

    public double root2() {
        double d = getDelta();
        if (d >= 0) {
            return (-b - Math.sqrt(d)) / (2 * a);
        }
        return 0;
    }


}