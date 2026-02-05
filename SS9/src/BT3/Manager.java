package BT3;

public class Manager extends Employee{
    private String department;

    public Manager() {
    }

    public Manager(String fullName, double baseSalary, String department) {
        super(fullName, baseSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phòng ban: " + department);
    }
}