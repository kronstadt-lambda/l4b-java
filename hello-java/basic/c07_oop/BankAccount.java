package basic.c07_oop;

public class BankAccount {

    // Attributes
    protected double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }

    public void getBalance() {
        System.out.println("Balance: " + this.balance);
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
