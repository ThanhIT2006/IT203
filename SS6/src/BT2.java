public class BT2 {
    public static void main(String[] args) {
        Account acc = new Account("thanh123", "123456", "thanh@gmail.com");
        System.out.println("======= Thong tin truoc khi doi mat khau");
        acc.displayInfo();
        acc.changePassword("abcdef");
        System.out.println("======= Thong tin sau khi doi mat khau");
        acc.displayInfo();
    }
}

class Account {

    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        if (newPassword != null && !newPassword.isEmpty()) {
            this.password = newPassword;
            System.out.println("Doi mat khau thanh cong!");
        } else {
            System.out.println("Mat khau moi khong hop le!");
        }
    }

    public void displayInfo() {
        System.out.println("----- Thong tin tai khoan -----");
        System.out.println("Username: " + username);
        System.out.println("Password: ******");
        System.out.println("Email: " + email);
        System.out.println("------------------------------");
    }
}
