import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhập số sách đang giữ: ");
        int soSachDangGiu = sc.nextInt();
        if (tuoi >= 18 && soSachDangGiu < 3) {
            System.out.println("Cho phép mượn sách");
        } else {
            if (tuoi < 18) {
                System.out.println("Bạn chưa đủ tuổi");
            }
            if (soSachDangGiu >= 3) {
                System.out.println("Bạn đã mượn quá số lượng cho phép");
            }
        }
    }
}