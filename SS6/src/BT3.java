public class BT3 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setProductId("SP01");
        p.setProductName("Laptop");
        p.setPrice(15000000);
        p.display();
        System.out.println("===== Set gia khong hop le");
        p.setPrice(-5000000);
        p.display();
    }
}

class Product {

    private String productId;
    private String productName;
    private double price;

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Gia khong hop le! Gia phai > 0");
        }
    }

    public void display() {
        System.out.println("----- Thong tin san pham -----");
        System.out.println("Ma SP: " + productId);
        System.out.println("Ten SP: " + productName);
        System.out.println("Gia ban: " + price);
        System.out.println("-----------------------------");
    }
}
