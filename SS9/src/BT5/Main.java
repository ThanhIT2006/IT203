package BT5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("Nguyen Van A", 10_000_000);
        employees[1] = new ProductionEmployee("Tran Thi B", 300, 20_000);
        employees[2] = new ProductionEmployee("Le Van C", 150, 30_000);

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i]);
            totalSalary += employees[i].calculateSalary();
        }

        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: "
                + String.format("%,.0f", totalSalary));
    }
}



