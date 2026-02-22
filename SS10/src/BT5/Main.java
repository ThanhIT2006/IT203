package BT5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new OfficeStaff("Nguyễn Văn A", 10_000_000));
        list.add(new Manager("Trần Thị B", 15_000_000, 3_000_000));
        list.add(new OfficeStaff("Lê Văn C", 9_000_000));

        System.out.println("BẢNG LƯƠNG NHÂN VIÊN");
        System.out.println("----------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            double salary = e.calculateSalary();

            if (e instanceof BonusCalculator b) {
                System.out.printf("%s (Quản lý) - Lương cơ bản: %.0f - Thưởng: %.0f - Tổng lương: %.0f%n", e.getName(), e.getBaseSalary(), b.getBonus(), salary);
            } else {
                System.out.printf("%s (Nhân viên văn phòng) - Lương cơ bản: %.0f - Thưởng: 0 - Tổng lương: %.0f%n", e.getName(), e.getBaseSalary(), salary);
            }
        }
    }
}
