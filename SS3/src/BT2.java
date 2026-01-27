import java.util.Scanner;

public class BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Lập trình Java cơ bản",
                "Cấu trúc dữ liệu và giải thuật",
                "Hệ điều hành",
                "Mạng máy tính",
                "Cơ sở dữ liệu"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String keyword = sc.nextLine();

        int index = searchBooks(books, keyword);

        if (index != -1) {
            System.out.println("Tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Sách không tồn tại");
        }
    }

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }
}