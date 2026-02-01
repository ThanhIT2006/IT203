public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("0987654321", "Nguyen Ngoc Thanh", 100000000);
        BankAccount acc2 = new BankAccount("0123456789", "Hoang Trung Dung", 50000000);

        System.out.println("Thông tin tài khoản của Thanh");
        acc1.display();
        System.out.println("Thông tin tài khoản của Dung");
        acc2.display();

        acc1.deposit(20000000);
        acc2.withdraw(70000000);

        System.out.println("Thông tin của Thanh sau");
        acc1.display();
        System.out.println("Thông tin của Dung sau");
        acc2.display();
    }
}
