package BT1;

public class Student extends Person{
    private String id;
    private double  scoreAvg;

    public Student() {
    }

    public Student(String fullName, int age, String id, double scoreAvg) {
        super(fullName, age);
        this.id = id;
        this.scoreAvg = scoreAvg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScoreAvg() {
        return scoreAvg;
    }

    public void setScoreAvg(double scoreAvg) {
        this.scoreAvg = scoreAvg;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Mã sinh viên: " + id);
        System.out.println("Điểm trung bình: " + scoreAvg);
        System.out.println("========================");
    }
}