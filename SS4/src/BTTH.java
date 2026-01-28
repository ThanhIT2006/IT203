import java.util.Scanner;
import java.util.regex.Pattern;

public class BTTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id, isbn, year, name, author;

        do {
            System.out.print("Nhập mã sách (LIB-xxxx-S): ");
            id = sc.nextLine();
        } while (!Pattern.matches("^LIB-\\d{4}-S$", id));

        do {
            System.out.print("Nhập ISBN (10 chữ số): ");
            isbn = sc.nextLine();
        } while (!Pattern.matches("^\\d{10}$", isbn));

        do {
            System.out.print("Nhập năm xuất bản: ");
            year = sc.nextLine();
        } while (!Pattern.matches("^\\d{4}$", year) || Integer.parseInt(year) > 2026);

        System.out.print("Nhập tên sách: ");
        name = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        author = sc.nextLine();

        name = name.trim();
        String[] words = name.split("\\s+");
        StringBuilder sbName = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i].toLowerCase();
            sbName.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1));
            if (i < words.length - 1) sbName.append(" ");
        }

        name = sbName.toString();

        StringBuilder info = new StringBuilder();
        info.append(id).append(" - ")
                .append(name).append(" - ")
                .append(author).append(" (")
                .append(year).append(")");

        System.out.println("\n=== THÔNG TIN SÁCH ===");
        System.out.println(info.toString());
    }
}
