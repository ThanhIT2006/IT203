import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int n = scanner.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = scanner.nextInt();

        double totalFine = n * m * 5000;

        if (n > 7 && m >= 3) {
            totalFine *= 1.2;
        }

        boolean lockCard = totalFine > 50000;

        System.out.printf("Tiền phạt gốc: %.1f VNĐ\n", n * m * 5000.0);
        System.out.printf("Tiền phạt sau điều chỉnh: %.1f VNĐ\n", totalFine);
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);
    }
}