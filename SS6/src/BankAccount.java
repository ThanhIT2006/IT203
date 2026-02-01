public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount() {
        this.accountNumber = "0000000000";
        this.ownerName = "Unknown";
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.isEmpty()) {
            this.accountNumber = accountNumber;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.isEmpty()) {
            this.ownerName = ownerName;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Nap tien thanh cong: +" + money);
        } else {
            System.out.println("So tien nap khong hop le!");
        }
    }

    public void withdraw(double money) {
        if (money > 0) {
            if (balance - money >= 0) {
                balance -= money;
                System.out.println("Rut tien thanh cong: -" + money);
            } else {
                System.out.println("So du khong du de rut!");
            }
        } else {
            System.out.println("So tien rut khong hop le!");
        }
    }

    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("So TK: " + accountNumber);
        System.out.println("Name: " + ownerName);
        System.out.printf("Balance: %,.0f VND\n", balance);
        System.out.println("-----------------------------------");
    }
}
