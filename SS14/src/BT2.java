import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {

        Map<String, String> drugs = new HashMap<>();

        drugs.put("T01", "Paracetamol");
        drugs.put("T02", "Ibuprofen");
        drugs.put("T03", "Amoxicillin");
        drugs.put("T04", "Vitamin C");
        drugs.put("T05", "Aspirin");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String code = sc.nextLine();

        if (drugs.containsKey(code)) {
            System.out.println("Tên thuốc: " + drugs.get(code));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }

    }
}