package october8.bank;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public String accountHolder;

    private BankAccount() {
        this.accountNumber = " ";
        this.balance = 0.0;
        this.accountHolder = " ";
    }

    public BankAccount(String accountNumber, double balance, String accountHoldder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHoldder;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String acc) {
        this.accountNumber = acc;
    }

    public double getbalance() {
        return this.balance;
    }

    public void setbalance(double acc) {
        this.balance += acc;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount cant be less than 0!");
            return;
        } else {
            // double tmp = this.balance + amount;
            this.setbalance(amount);
            System.out.println("Deposit of " + amount + "Completed Successfully!");
        }
    }

    public void withdraw(int amount) {
        if (amount <= this.balance) {
            System.out.println("Withdrawal Rejected!");
        } else {
            // double tmp = this.balance - amount;
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + "Completed Successfully!");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account NUmber: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }
}
