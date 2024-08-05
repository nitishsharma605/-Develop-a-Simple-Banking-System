
public class Account {
    private int accountNumber;
    private double balance;

    
    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount the amount to withdraw
     * @throws InsufficientFundsException if the account balance is insufficient
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds in account");
        }
        balance -= amount;
    }

    /**
     * Returns the current account balance.
     *
     * @return the account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the account number.
     *
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }
}