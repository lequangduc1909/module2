import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy nhập theo thứ tự số hàng và số cột trong ma trận. ");

        System.out.println("Số hàng:  ");
        int x = Integer.parseInt(sc.nextLine());

        System.out.println("Số cột:  ");
        int y = Integer.parseInt(sc.nextLine());

        double[][] matrix = new double[x][y];

        addValueForMatrix(x, y, matrix, sc);
        System.out.println("Giá trị lớn nhất là: "+ findMax(matrix));
        System.out.println("Index lớn nhất là" + Arrays.toString(findMaxIndex(matrix)));
    }


    public static double[][] addValueForMatrix(int soHang, int soCot, double[][] maTran, Scanner sc) {

        for (int i = 0; i < soHang; i++) {
            System.out.println("Hàng thứ " + (i + 1) + ":");
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập phần tử [" + i + "]" + "[" + j + "]");
                maTran[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        return maTran;

    }


    public static double findMax( double[][] maTran) {
        double maxValue = maTran[0][0];
        for (int a = 0; a < maTran.length; a++) {
            for (int b = 0; b < maTran[a].length; b++) {
                if (maTran[a][b] >= maxValue) {
                    maxValue = maTran[a][b];
                }
            }
        }
        return maxValue;
    }

    public static int[] findMaxIndex (double[][] maTran ){
        double maxValue = maTran[0][0];
        int[] maxIndex = {0,0};
        for (int a = 0; a < maTran.length; a++) {
            for (int b = 0; b < maTran[a].length; b++) {
                if (maTran[a][b] >= maxValue) {
                    maxValue = maTran[a][b];
                    maxIndex = new int[]{a, b};
                }
            }
        }
        return maxIndex;
    }

}
