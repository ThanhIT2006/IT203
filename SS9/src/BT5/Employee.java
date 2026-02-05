package BT5;

public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}


