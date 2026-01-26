import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diemUyTin = 100;
        int soNgayTre;
        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---");
        System.out.println("(Nhập số ngày trễ. Nhập 999 để kết thúc)");
        while (true) {
            System.out.print("Số ngày trễ của lần này: ");
            soNgayTre = sc.nextInt();
            if (soNgayTre == 999) {
                break;
            }
            if (soNgayTre > 0) {
                int diemTru = soNgayTre * 2;
                diemUyTin -= diemTru;
                System.out.println("-> Trả trễ " + soNgayTre + " ngày: -" + diemTru + " điểm.");
            } else {
                diemUyTin += 5;
                System.out.println("-> Trả đúng hạn/sớm hạn: +5 điểm.");
            }
        }
        System.out.println("Tổng điểm uy tín: " + diemUyTin);
        if (diemUyTin > 120) {
            System.out.println("Xếp loại: ĐỘC GIẢ THÂN THIẾT");
        } else if (diemUyTin >= 80) {
            System.out.println("Xếp loại: ĐỘC GIẢ TIÊU CHUẨN");
        } else {
            System.out.println("Xếp loại: ĐỘC GIẢ CẦN LƯU Ý");
        }
    }
}