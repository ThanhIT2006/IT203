package BT3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Nguyễn Văn A", 20000);
        Manager manager = new Manager("Trần Thị B", 10000, "Kế toán");

        employee.display();
        manager.display();
    }
}
