package BT3;

public class Employee {
    private String fullName;
    private double baseSalary;

    public Employee() {
    }

    public Employee(String fullName, double baseSalary) {
        this.fullName = fullName;
        this.baseSalary = baseSalary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void display(){
        System.out.println("--- THÔNG TIN CƠ BẢN ---");
        System.out.println("Tên: " + fullName);
        System.out.println("lương cơ bản: " + baseSalary);
        System.out.println("========================");
    }
}