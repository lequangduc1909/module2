package MCV_quan_ly_san_pham.Controller;

import MCV_quan_ly_san_pham.Model.Product;

import java.text.Normalizer;
import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> sanpham = new ArrayList<>();

    public void themSanPham(String name, int id, double price) {
        Product p = new Product(name, id, price);
        sanpham.add(p);
    }

    public void suaTheoID(String name, int id, double price) {
        boolean found = false;

        for (int i = 0; i < sanpham.size(); i++) {
            if (sanpham.get(i).getId() == id) {
                Product p = new Product(name, id, price);
                sanpham.set(i, p);
                found = true;
                break;
            }
        }
        if (found == false) {
            throw new RuntimeException("Không tìm thấy ID");
        }
    }

    public void xoaTheoID(int id) {
        for (int i = 0; i < sanpham.size(); i++) {
            if (sanpham.get(i).getId() == id) {
                sanpham.remove(i);
                break;
            }
        }
    }

    public ArrayList<Product> traVeDanhSach() {
        return sanpham;
    }

    public String chuanHoaChuoi(String chuoiBatKi) {
        String temp = Normalizer.normalize(chuoiBatKi, Normalizer.Form.NFD);
        temp = temp.replaceAll("\\p{M}", "");
        temp = temp.replaceAll("đ", "d").replaceAll("Đ", "D");
        temp = temp.trim().toLowerCase();
        return temp;
    }

    public ArrayList<Product> timSanPhamTheoten(String name) {
        ArrayList<Product> ketQuaTraVe = new ArrayList<>();
        String sanPhamCanTim = chuanHoaChuoi(name);
        String ten;
        for (int i = 0; i < sanpham.size(); i++) {
            ten = chuanHoaChuoi(sanpham.get(i).getName());

            if (ten.contains(sanPhamCanTim)){
                ketQuaTraVe.add(sanpham.get(i));
            }
        }
        return ketQuaTraVe;
    }

    public ArrayList<Product> sapXepTheoGiaTangDan(){
        ArrayList<Product> danhSachSauSapXep = new ArrayList<>();
        for (int i = 0; i < sanpham.size(); i++){
            danhSachSauSapXep.add(sanpham.get(i));
        }
        danhSachSauSapXep.sort((a,b) -> Double.compare(a.getPrice(), b.getPrice()));
        return danhSachSauSapXep;
    }

    public ArrayList<Product> sapXepTheoGiaGiamDan(){
        ArrayList<Product> danhSachSauSapXep = new ArrayList<>();
        for (int i = 0; i < sanpham.size(); i++){
            danhSachSauSapXep.add(sanpham.get(i));
        }
        danhSachSauSapXep.sort((a,b) -> Double.compare(b.getPrice(), a.getPrice()));
        return danhSachSauSapXep;
    }

}
