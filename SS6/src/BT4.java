public class BT4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("E02", "Nguyen Ngoc Thanh");
        Employee e3 = new Employee("E03", "Hoang Trung Dung", 15000000);
        e1.display();
        e2.display();
        e3.display();
    }
}

class Employee {

    private String empId;
    private String empName;
    private double salary;

    public Employee() {
        this.empId = "Không có";
        this.empName = "Không có";
        this.salary = 0;
    }

    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.salary = 0;
    }

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void display() {
        System.out.println("----- Thong tin nhan vien -----");
        System.out.println("Ma NV: " + empId);
        System.out.println("Ten NV: " + empName);
        System.out.println("Luong: " + salary);
        System.out.println("------------------------------");
    }
}
