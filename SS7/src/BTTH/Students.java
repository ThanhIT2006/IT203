package BTTH;

public class Students {
    // Thuộc tính
    private String id;
    private String name;

    public static int studentCount;
    public static final String SCHOOL_NAME = "PTIT";

    // Phương thức
    public Students() {
    }

    public Students(String id, String name) {
        this.id = id;
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Students.studentCount = studentCount;
    }

    public void display(){
        System.out.println("-----------------------------------");
        System.out.println("School Name: " + SCHOOL_NAME);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("-----------------------------------");
    }

    public static void showTotalStudent(){
        System.out.println("Tổng số lượng sinh viên: " + studentCount);
    }
}