package October15;

/*
2. Create an interface Account containing an abstract method withdraw(double
amount). Create another interface Savings that extends Account and declares a
method calculateInterest(). Create a third interface PremiumSavings that extends
Savings and declares a method displayBalance(). Finally, create a class
PremiumAccount that implements PremiumSavings and contains private
variables accountNumber, accountHolder, and balance. Implement all inherited
methods so that the account earns 5% annual interest and withdrawals must
maintain a minimum balance of Tk. 5,000. In the main() method, create two
PremiumAccount objects using interface references, perform withdrawals,
calculate interest, and display their final balances. 

*/

interface Account {
    void withdraw(double amount);
}

interface Savings extends Account {
    void calculateInterest();
}

interface PremiumSavings extends Savings {
    void displayBalance();
}

class PremiumAccount implements PremiumSavings {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    private PremiumAccount() {
        this.accountNumber = " ";
        this.accountHolder = " ";
        double balance = 0.0;
    }

    public PremiumAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount for " + accountHolder);
        } else if (balance - amount < 5000) {
            System.out.println(
                    "Withdrawal denied for " + accountHolder + ": minimum balance of Tk. 5000 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful for " + accountHolder + ": Tk. " + amount);
        }

        System.out.println("________________________________________________________________________________________");
    }

    @Override
    public void calculateInterest() {
        balance += balance * 0.05;
        System.out.println("Annual interest added for " + accountHolder + ".");
    }

    @Override
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Final Balance: Tk. %.2f%n", balance);
        System.out.println(
                "_____________________________________________________________________________________________");
    }
}

class PremiumAccountDemo {
    public static void main(String[] args) {
        PremiumSavings account1 = new PremiumAccount("A1001", "Israfil", 20000);
        PremiumSavings account2 = new PremiumAccount("A1002", "Sadik", 12000);

        account1.withdraw(5000);
        account2.withdraw(8000);

        account1.calculateInterest();
        account2.calculateInterest();

        account1.displayBalance();
        account2.displayBalance();
    }
}
