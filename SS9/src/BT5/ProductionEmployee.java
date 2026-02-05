package BT5;

public class ProductionEmployee extends Employee {
    private int numOfProducts;
    private double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }

    @Override
    public String toString() {
        return name + " (Production) - Lương: " + String.format("%,.0f", calculateSalary()) + " (" + numOfProducts + " sản phẩm * " + String.format("%,.0f", price) + ")";
    }
}


