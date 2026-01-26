import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tienphatmoingay = 5000;
        int total = 0;
        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của cuốn thứ " + i + ": ");
            int soNgayTre = sc.nextInt();
            total += soNgayTre * tienphatmoingay;
        }
        System.out.println("===> Tổng tiền phạt: " + total + " VND");
    }
}