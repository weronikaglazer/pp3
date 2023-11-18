public class BankAccount {
    private String number = "456567872334546576";
    private int balance = 0;
    private String ownerName = "Adam Johnson";
    private String bankName = "Millenium";


    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    int checkBalance() {
        return balance;
    }

    void displayInfo() {
        System.out.println("Account number: " + number);
        System.out.println("Account owner: " + ownerName);
        System.out.println("Bank: " + bankName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.deposit(500);
        acc1.checkBalance();
        acc1.deposit(200);
        acc1.checkBalance();
        acc1.withdraw(300);
        acc1.checkBalance();
        acc1.displayInfo();

    }
}