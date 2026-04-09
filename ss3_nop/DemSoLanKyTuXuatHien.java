import java.util.Scanner;

public class DemSoLanKyTuXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.print("Nhập ký tự cần đếm: ");
        char kyTu = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện: " + count);
    }
}