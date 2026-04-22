package MCV_quan_ly_san_pham.Model;

public class Product {
    private String name;
    private int id;
    private double price;

    public Product() {
    }

    public Product(String name, int id, double price) {
        setName(name);
        setId(id);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isBlank()) {
            throw new RuntimeException("Tên không hợp lệ");
        }
            this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new RuntimeException("ID không hợp lệ");
        }
            this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <=0) {
            throw new RuntimeException("Giá không hợp lệ");
        }
            this.price = price;
    }
}
