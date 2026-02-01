public class BT5 {
    public static void main(String[] args) {
        Book b1 = new Book("B01", "Lap trinh Java", 120000);
        b1.display();
    }
}

class Book {

    private String bookId;
    private String bookName;
    private double price;

    public Book(String bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public void display() {
        System.out.println("----- Thong tin sach -----");
        System.out.println("Ma sach: " + bookId);
        System.out.println("Ten sach: " + bookName);
        System.out.println("Gia: " + price);
        System.out.println("--------------------------");
    }
}
