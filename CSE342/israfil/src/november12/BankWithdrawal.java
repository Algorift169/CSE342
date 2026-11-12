package november12;
/* Create a custom exception named InsufficientBalanceException. A bank account initially
contains Tk. 10,000. Write a method withdraw() that throws an exception if the
withdrawal amount exceeds the available balance. Test withdrawals of Tk. 3,000 and Tk.
8,000.
 */
public class BankWithdrawal {

    private double balance = 10000.00;

    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available balance: Tk. " + balance);
        }
        this.balance -= amount;
        System.out.println("Withdrawal successful: Tk. " + amount);
        System.out.println("Remaining balance: Tk. " + balance);
    }
    public static void main(String[] args) {
        BankWithdrawal account = new BankWithdrawal();

        try {
            account.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}