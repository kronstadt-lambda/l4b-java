package basic.c07_oop;

public class SavingsAccount extends BankAccount{
    // Attributes
    private double interestRate;

    // Constructor
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    // Methods
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }


}
