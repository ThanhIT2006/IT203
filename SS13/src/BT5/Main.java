package BT5;

import java.util.*;

public class Main {
    static List<Patient> patientList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách bệnh nhân");
            System.out.println("5. Hiển thị danh sách bệnh nhân");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    removePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayPatients();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn sai!");
            }

        } while (choice != 6);
    }

    static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getId().equals(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }
        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Thêm bệnh nhân thành công.");
    }

    static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                patientList.get(i).setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân.");
    }

    static void removePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = sc.nextLine();
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getId().equals(id)) {
                patientList.remove(i);
                System.out.println("Đã xuất viện.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân.");
    }

    static void sortPatients() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge();
                }

                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("Danh sách đã được sắp xếp.");
    }

    static void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        System.out.println("===== Danh sách bệnh nhân =====");
        for (int i = 0; i < patientList.size(); i++) {
            System.out.println(patientList.get(i));
        }
    }
}