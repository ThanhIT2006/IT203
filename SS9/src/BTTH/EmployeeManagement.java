package BTTH;

import java.util.Scanner;

public class EmployeeManagement {
    static Employee[] employees = new Employee[100];
    static int current = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*************** MENU ***************");
            System.out.println("1. Nhập thông tin nhân viên");
            System.out.println("2. Nhập thông tin quản lý");
            System.out.println("3. Tính lương nhân viên và quản lý");
            System.out.println("4. Hiển thị thông tin nhân sự");
            System.out.println("5. Sắp xếp theo lương giảm dần");
            System.out.println("6. Đếm số nhân viên và quản lý");
            System.out.println("7. Tìm kiếm theo tên");
            System.out.println("8. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    addManager(sc);
                    break;
                case 3:
                    calcSalaryAll();
                    break;
                case 4:
                    displayAll();
                    break;
                case 5:
                    sortBySalaryDesc();
                    break;
                case 6:
                    countEmployeeAndManager();
                    break;
                case 7:
                    searchByName(sc);
                    break;
                case 8:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Chọn sai!");
            }
        } while (choice != 8);
    }

    static void addEmployee(Scanner sc) {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            Employee e = new Employee();
            e.inputData(sc);
            employees[current++] = e;
        }
    }

    static void addManager(Scanner sc) {
        System.out.print("Nhập số lượng quản lý: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            Manager m = new Manager();
            m.inputManager(sc);
            employees[current++] = m;
        }
    }

    static void calcSalaryAll() {
        for (int i = 0; i < current; i++) {
            employees[i].calcSalary();
        }
        System.out.println("Đã tính lương xong!");
    }

    static void displayAll() {
        for (int i = 0; i < current; i++) {
            employees[i].displayData();
        }
    }

    static void sortBySalaryDesc() {
        for (int i = 0; i < current - 1; i++) {
            for (int j = i + 1; j < current; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp theo lương giảm dần!");
    }

    static void countEmployeeAndManager() {
        int empCount = 0;
        int mgrCount = 0;

        for (int i = 0; i < current; i++) {
            if (employees[i] instanceof Manager) {
                mgrCount++;
            } else {
                empCount++;
            }
        }

        System.out.println("Số nhân viên: " + empCount);
        System.out.println("Số quản lý: " + mgrCount);
    }

    static void searchByName(Scanner sc) {
        System.out.print("Nhập tên cần tìm: ");
        String keyword = sc.nextLine();

        for (int i = 0; i < current; i++) {
            if (employees[i].getName().toLowerCase().contains(keyword.toLowerCase())) {
                employees[i].displayData();
            }
        }
    }
}

