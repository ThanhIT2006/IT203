import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = scanner.nextInt();

        int shelfNumber = (stt - 1) / 25 + 1;
        int positionOnShelf = (stt - 1) % 25 + 1;

        String area = (shelfNumber <= 10) ? "Khu Cận (Gần cửa)" : "Khu Viễn (Cuối kho)";

        System.out.println("\n--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelfNumber + " - Vị trí " + positionOnShelf);
        System.out.println("Phân khu: " + area);
    }
}