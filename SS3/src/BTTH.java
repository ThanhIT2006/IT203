import java.util.Scanner;

public class BTTH {
    public static void main(String[] args) {
        int[] ids = new int[100];
        String[] title = new String[100];
        int[] quantity = new int[100];
        int current = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                    1. Xem danh sách: Hiển thị bảng danh sách sách dạng cột (Mã | Tên | Số lượng)
                    2. Thêm sách mới: Nhập thông tin sách mới (Kiểm tra nếu mã sách đã tồn tại thì báo lỗi, nếu mảng đầy thì báo lỗi)
                    3. Cập nhật số lượng: Nhập mã sách, tìm và cho phép sửa lại số lượng (Ví dụ: Nhập hàng thêm)
                    4. Xóa sách: Nhập mã sách, xóa sách đó khỏi hệ thống (Dồn mảng cả 3 mảng)
                    5. Tìm kiếm: Nhập một từ khóa, hiển thị tất cả sách mà tên có chứa từ khóa đó (Tìm kiếm gần đúng)
                    6. Sắp xếp theo số lượng: Sắp xếp danh sách giảm dần theo số lượng (Lưu ý: Khi đổi chỗ quantities, phải đổi chỗ cả ids và titles tương ứng)
                    7. Thoát
                    Lựa chọn của bạn:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (current == 0) {
                        System.err.println("Danh sách trống!");
                    } else {
                        for (int i = 0; i < current; i++) {
                            System.out.println("--------------------------");
                            System.out.println("ID: " + ids[i]);
                            System.out.println("Title: " + title[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("--------------------------");
                        }
                    }
                    break;
                case 2:
                    if (current == 100) {
                        System.err.println("Danh sách đầy");
                    } else {
                        System.out.println("Nhập số lượng muốn thêm: ");
                        int n = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < n; i++) {
                            System.out.println("Nhập ID: ");
                            int newid = Integer.parseInt(sc.nextLine());

                            boolean exists = false;
                            for (int j = 0; j < current; j++) {
                                if (ids[j] == newid) {
                                    exists = true;
                                    break;
                                }
                            }
                            if (exists) {
                                System.err.println("ID đã tồn tại, không thể thêm!");
                                continue;
                            }
                            System.out.println("Nhập tiêu đề: ");
                            String newTitle = sc.nextLine();
                            System.out.println("Nhập số lượng: ");
                            int newQuantity = Integer.parseInt(sc.nextLine());
                            ids[current] = newid;
                            title[current] = newTitle;
                            quantity[current] = newQuantity;
                            current++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã sách cần cập nhật số lượng: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    boolean foundUpdate = false;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == updateId) {
                            System.out.println("Số lượng hiện tại: " + quantity[i]);
                            System.out.println("Nhập số lượng mới: ");
                            quantity[i] = Integer.parseInt(sc.nextLine());
                            System.out.println("Cập nhật thành công!");
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.err.println("Không tìm thấy mã sách!");
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã sách cần xóa: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    boolean foundDelete = false;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == deleteId) {
                            // Dồn mảng
                            for (int j = i; j < current - 1; j++) {
                                ids[j] = ids[j + 1];
                                title[j] = title[j + 1];
                                quantity[j] = quantity[j + 1];
                            }
                            current--;
                            System.out.println("Xóa thành công!");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.err.println("Không tìm thấy mã sách!");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ!");
            }
        } while (true);
    }
}