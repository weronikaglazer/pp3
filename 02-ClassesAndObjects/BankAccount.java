public class BankAccount {
    String bank;
    String owner;
    int number;
    double balance;
    boolean isCreditCardValid;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Current account balance after deposit is: " + balance);
    }

    void takeOut(int amount) {
        balance = balance - amount;
        System.out.println("Current account balance after takeout is: " + balance);
    }

    void checkBalance() {
        System.out.println("Current account balance is: " + balance);
    }
}
