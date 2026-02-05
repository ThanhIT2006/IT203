package BT5;

public class OfficeEmployee extends Employee {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return name + " (Office) - Lương: " + String.format("%,.0f", baseSalary);
    }
}


