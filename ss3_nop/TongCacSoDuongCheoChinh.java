import java.util.Arrays;
import java.util.Scanner;

public class TongCacSoDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chào pạn");
        System.out.println("Đầu tiên, hãy nhập số hàng (hoăc số cột) của ma trận vuông mà bạn muốn:");
        int x = Integer.parseInt(sc.nextLine());

        double[][] maTranVuong = new double[x][x];

        System.out.println("Tiếp theo, hãy nhập các giá trị phần tử cho ma trận trên");
        for (int i = 0; i < maTranVuong.length; i++) {
            System.out.println("Hãy nhập giá trị cho các cột trong hàng thứ " + (i+1));
            for (int j = 0; j < maTranVuong.length; j++) {
                System.out.println("Cột " + (j+1));
                maTranVuong[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        System.out.println("Mảng của bạn là: " + Arrays.deepToString(maTranVuong));

        System.out.println("Tổng của đường chéo chính cho mảng của bạn là: " + countSum(maTranVuong));
    }

    public static double countSum(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
