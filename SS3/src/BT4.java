
public class BT4 {

    public static void main(String[] args) {
        int[] isbnList = {105, 102, 109, 101, 103};

        System.out.println("Trước khi sắp xếp:");
        displayBooks(isbnList);

        sortBooks(isbnList);

        System.out.println("Sau khi sắp xếp:");
        displayBooks(isbnList);
    }

    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Đổi chỗ
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}