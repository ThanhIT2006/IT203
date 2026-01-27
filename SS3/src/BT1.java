import java.util.Scanner;

public class BT1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] bookList = addBookToLibraries(n);
        System.out.println("--- KẾT QUẢ ---");
        displayLibraries(bookList);
    }

    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Sách thứ " + (i + 1) + ": ");
            books[i] = Integer.parseInt(sc.nextLine());
        }
        return books;
    }

    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}