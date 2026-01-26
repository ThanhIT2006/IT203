import java.util.Scanner;

public class BTTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;
        System.out.println("Nhập số lượng sách phải trả: ");
        int quantity = sc.nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Nhập vào số ngày trả: ");
            int lateDay = sc.nextInt();
            if (lateDay > 0 && lateDay <= 5) {
                totalPrice += lateDay * 2000;
            } else if (lateDay >= 6) {
                totalPrice += 5 * 2000 + (lateDay - 5) * 5000;
            }
        }
        System.out.println("Tổng tiền phạt phải trả: " + totalPrice + " VNĐ");


        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập số lượng sách đã mượn: ");
        int quantityborrow = sc.nextInt();
        System.out.println("Có thẻ ưu tiên hay không (0 or 1): ");
        int isPriority = sc.nextInt();
        if ((age >= 18 && quantityborrow >= 10) || isPriority == 1) {
            System.out.println("Đủ điều kiện Vip");
        } else {
            System.out.println("Chưa đủ tiêu chuẩn");
        }

        int count = 0;
        int bookID;
        do {
            System.out.print("Nhập mã số sách (0 để kết thúc): ");
            bookID = sc.nextInt();
            if (bookID < 0) {
                System.out.println("Mã không hợp lệ, nhập lại!");
                continue;
            } else if (bookID == 0) {
                break;
            } else {
                count++;
            }
        } while (true);
        System.out.println("Số sách nhập kho là: "+ count);
    }
}