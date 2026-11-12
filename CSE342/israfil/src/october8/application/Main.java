package october8.application;

import october8.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount Rahim = new BankAccount("Rahim", 0.0, "acc121");
        Rahim.deposit(10000);
        Rahim.withdraw(3000);
        Rahim.display();

        Rahim.withdraw(10000);
        // This should be rejected because current balance will be 7k after last
        // withdrawal.
    }
}