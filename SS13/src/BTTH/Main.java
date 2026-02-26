package BTTH;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PatientManager manager = new PatientManager();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("""
                    ==== Menu ====
                    1. Thêm bệnh nhận
                    2. Xóa bệnh nhân
                    3. Cập nhật thông tin bệnh nhân
                    4. Tìm kiếm bệnh nhân
                    5. Hiển thị danh sách bệnh nhân
                    0. Thoát
                    Nhập lựa chọn: 
                    """);

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    deletePatient();
                    break;
                case 3:
                    updatePatient();
                    break;
                case 4:
                    searchPatient();
                    break;
                case 5:
                    manager.displayPatients();
                    break;
                case 0:
                    System.out.println("Ket thuc!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }

    public static void addPatient() {
        System.out.print("Nhap ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (manager.isIdExist(id)) {
            System.out.println("ID da ton tai!");
            return;
        }

        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        if (age <= 0) {
            System.out.println("Tuoi phai > 0!");
            return;
        }

        System.out.print("Nhap gioi tinh: ");
        String gender = sc.nextLine();

        System.out.print("Nhap benh ly: ");
        String disease = sc.nextLine();

        manager.addPatient(new Patient(id, name, age, gender, disease));
        System.out.println("Them thanh cong!");
    }

    public static void deletePatient() {
        System.out.print("Nhap ID can xoa: ");
        int id = sc.nextInt();

        if (manager.removePatient(id))
            System.out.println("Xoa thanh cong!");
        else
            System.out.println("Khong tim thay!");
    }

    public static void updatePatient() {
        System.out.print("Nhap ID can cap nhat: ");
        int id = sc.nextInt();
        sc.nextLine();

        Patient p = manager.findById(id);
        if (p == null) {
            System.out.println("Khong tim thay!");
            return;
        }

        System.out.print("Ten moi: ");
        p.setName(sc.nextLine());

        System.out.print("Tuoi moi: ");
        int age = sc.nextInt();
        sc.nextLine();
        if (age > 0) p.setAge(age);

        System.out.print("Gioi tinh moi: ");
        p.setGender(sc.nextLine());

        System.out.print("Benh ly moi: ");
        p.setDisease(sc.nextLine());

        System.out.println("Cap nhat thanh cong!");
    }

    public static void searchPatient() {
        System.out.print("Nhap ten can tim: ");
        String name = sc.nextLine();
        manager.searchByName(name);
    }
}