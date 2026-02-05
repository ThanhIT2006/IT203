package BTTH;

import java.util.Scanner;

public class Manager extends Employee {
    private String position;
    private String department;

    public Manager() {
    }

    public Manager(String id, String name, int age, double credit,
                   String position, String department) {
        super(id, name, age, credit);
        this.position = position;
        this.department = department;
    }

    public void inputManager(Scanner sc) {
        super.inputData(sc);
        System.out.print("Nhập vị trí: ");
        position = sc.nextLine();

        System.out.print("Nhập phòng ban: ");
        department = sc.nextLine();
    }

    @Override
    public void calcSalary() {
        salary = credit * baseSalary * 1.2;
    }

    @Override
    public void displayData() {
        System.out.println("ID: " + id
                + " | Name: " + name
                + " | Age: " + age
                + " | Credit: " + credit
                + " | Position: " + position
                + " | Department: " + department
                + " | Salary: " + String.format("%,.0f", salary));
    }
}

