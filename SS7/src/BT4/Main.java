package BT4;

public class Main {
    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Thanh");
        ClassRoom sv2 = new ClassRoom("Dung");
        ClassRoom sv3 = new ClassRoom("Phuong");

        sv1.payFund(100_000);
        sv2.payFund(200_000);
        sv3.payFund(150_000);

        System.out.println("\nTổng quỹ lớp hiện tại: " + ClassRoom.getClassFund() + " VND");
    }
}
