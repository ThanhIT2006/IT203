import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        Pattern pa = Pattern.compile("Kệ:\\s*([^,]+)");
        Matcher ma = pa.matcher(description);

        if (ma.find()) {
            String position = ma.group(1).trim();
            System.out.println("Vị trí tìm thấy: " + position);

            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mô tả mới: " + newDescription);
        } else {
            System.out.println("Không tìm thấy thông tin kệ sách.");
        }
    }
}
