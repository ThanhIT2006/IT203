package BTTH;

import java.util.Scanner;

public class Employee {
    protected String id;
    protected String name;
    protected int age;
    protected double credit;
    protected double baseSalary = 1_300_000;
    protected double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, double credit) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void inputData(Scanner sc) {
        System.out.print("Nhập mã nhân viên (E***): ");
        id = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập hệ số lương: ");
        credit = Double.parseDouble(sc.nextLine());
    }

    public void calcSalary() {
        salary = credit * baseSalary;
    }

    public void displayData() {
        System.out.println("ID: " + id
                + " | Name: " + name
                + " | Age: " + age
                + " | Credit: " + credit
                + " | Salary: " + String.format("%,.0f", salary));
    }
}

