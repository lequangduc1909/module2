import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            Triangle.checkTriangle(a, b, c);

            System.out.println("Đây là tam giác hợp lệ");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Dữ liệu không hợp lệ");
        }

        sc.close();
    }
}

