package BT3;

public class Main {
    public static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
        System.out.println("\n>> Kết quả xử lý:");

        double avg = ScoreUtil.calculateAverage(scores);
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", avg);

        for (double s : scores) {
            if (ScoreUtil.checkPass(s)) {
                System.out.println("- Điểm " + s + ": Đạt");
            } else {
                System.out.println("- Điểm " + s + ": Trượt");
            }
        }
    }
}
