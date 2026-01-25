import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double priceUSD = scanner.nextDouble();

        System.out.print("Nhập tỷ giá (VNĐ/USD - kiểu float): ");
        float exchangeRate = scanner.nextFloat();

        double priceVND = priceUSD * exchangeRate;

        long roundedPrice = (long) priceVND;

        System.out.println("Giá chính xác (số thực): " + priceVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedPrice);
    }
}