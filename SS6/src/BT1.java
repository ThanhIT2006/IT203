public class BT1 {
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyen Ngoc Thanh", 2003, 8.5);
        Student sv2 = new Student("SV002", "Hoang Trung Dung", 2002, 7.9);
        sv1.displayInfo();
        sv2.displayInfo();
    }
}

class Student {

    private String studentId;
    private String fullName;
    private int yearOfBirth;
    private double gpa;

    public Student(String studentId, String fullName, int yearOfBirth, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("----- Thong tin sinh vien -----");
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Ho ten: " + fullName);
        System.out.println("Nam sinh: " + yearOfBirth);
        System.out.println("Diem trung binh: " + gpa);
        System.out.println("-------------------------------");
    }
}
