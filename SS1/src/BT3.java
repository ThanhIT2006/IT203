public class BT3 {
    public static void main(String[] args) {
        String book1 = "Java Basic";     // Stack: book1 -> Heap: "Java Basic"
        String book2 = "Python Intro";   // Stack: book2 -> Heap: "Python Intro"

        System.out.println("Trước khi hoán đổi:");
        System.out.println("Book1 = " + book1); // In ra "Java Basic"
        System.out.println("Book2 = " + book2); // In ra "Python Intro"

        // Tạo biến temp trên Stack, tham chiếu đến cùng đối tượng với book1
        String temp = book1;             // Stack: temp -> Heap: "Java Basic"

        // Thay đổi tham chiếu của book1: giờ trỏ đến đối tượng mà book2 đang trỏ
        book1 = book2;                   // Stack: book1 -> Heap: "Python Intro"

        // Thay đổi tham chiếu của book2: giờ trỏ đến đối tượng mà temp đang trỏ
        book2 = temp;                    // Stack: book2 -> Heap: "Java Basic"

        System.out.println("\nSau khi hoán đổi:");
        System.out.println("Book1 = " + book1); // In ra "Python Intro"
        System.out.println("Book2 = " + book2); // In ra "Java Basic"
    }
}