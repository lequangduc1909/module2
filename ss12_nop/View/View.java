package MCV_quan_ly_san_pham.View;

import MCV_quan_ly_san_pham.Controller.ProductManager;
import MCV_quan_ly_san_pham.Model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private ProductManager controller = new ProductManager();
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("************ TẬP HÓA THANH KHÊ ************");
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Sắp xếp giá tăng dần");
            System.out.println("7. Sắp xếp giá giảm dần");
            System.out.println("0. Thoát");

            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    hienThi();
                    break;
                case 5:
                    timKiem();
                    break;
                case 6:
                    sapXepTang();
                    break;
                case 7:
                    sapXepGiam();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void them() {
        System.out.print("Nhập số lượng sản phẩm muốn thêm: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1));

            System.out.print("Tên: ");
            String name = sc.nextLine();

            if (name == null || name.trim().isEmpty()) {
                System.out.println("Tên không hợp lệ");
                i--;
                continue;
            }

            System.out.print("ID: ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("ID không hợp lệ");
                sc.nextLine();
                i--;
                continue;
            }

            System.out.print("Giá: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (price <= 0) {
                System.out.println("Giá không hợp lệ");
                i--;
                continue;
            }

            controller.themSanPham(name, id, price);
            System.out.println("Thêm thành công");
        }
    }

    private void sua() {
        System.out.print("ID cần sửa: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Tên mới: ");
        String name = sc.nextLine();

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Tên không hợp lệ");
            return;
        }

        System.out.print("Giá mới: ");
        double price = sc.nextDouble();
        sc.nextLine();

        if (price <= 0) {
            System.out.println("Giá không hợp lệ");
            return;
        }

        controller.suaTheoID(name, id, price);
        System.out.println("Sửa thành công");
    }

    private void xoa() {
        System.out.print("ID cần xóa: ");
        int id = sc.nextInt();
        sc.nextLine();

        controller.xoaTheoID(id);
        System.out.println("Đã xóa");
    }

    private void hienThi() {
        ArrayList<Product> list = controller.traVeDanhSach();

        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng bạn ei");
            return;
        }

        for (Product p : list) {
            System.out.println(p);
        }
    }

    private void timKiem() {
        System.out.print("Nhập tên sp cần tìm: ");
        String name = sc.nextLine();

        ArrayList<Product> result = controller.timSanPhamTheoten(name);

        if (result.isEmpty()) {
            System.out.println("Không tìm thấy");
        } else {
            for (Product p : result) {
                System.out.println(p);
            }
        }
    }

    private void sapXepTang() {
        ArrayList<Product> list = controller.sapXepTheoGiaTangDan();

        for (Product p : list) {
            System.out.println(p);
        }
    }

    private void sapXepGiam() {
        ArrayList<Product> list = controller.sapXepTheoGiaGiamDan();

        for (Product p : list) {
            System.out.println(p);
        }
    }
}