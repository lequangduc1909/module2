import java.util.Scanner;

public class SumOfCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập lần lượt số hàng và số cột để tạo ma trận theo ý của bạn:");
        System.out.println("Số hàng bạn muốn: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Số cột bạn muốn: ");
        int y = Integer.parseInt(sc.nextLine());

        double[][] yourArray = new double[x][y];

        System.out.println("Hãy nhập các phần tử:");
        for (int i = 0; i < yourArray.length; i++) {
            System.out.println("Hàng thứ " + (i + 1));
            for (int j = 0; j < yourArray[i].length; j++) {
                System.out.println("Mời nhập giá trị [" + i + "]" + "[" + j + "]");
                yourArray[i][j]= Double.parseDouble(sc.nextLine());

            }
        }
        System.out.println("Hãy chọn một chỉ số Column để tính tổng cột đó (Từ 1 đến " + yourArray[0].length+")");
        int col = Integer.parseInt(sc.nextLine()) - 1;
        System.out.println("Kết quả sum của các phần tử trong cột bạn đã chọn: " + countSum(yourArray,col));
    }

    public static double countSum (double[][] array, int column){
        double sum = 0;
        for (int i =0; i< array.length;i++){
            sum += array[i][column];
        }
        return sum;
    }
}
