/**
 * Represents a bank with a collection of accounts.
 */
public class Bank {
    private Map<Integer, Account> accounts;

    /**
     * Constructs a bank with an empty collection of accounts.
     */
    public Bank() {
        accounts = new HashMap<>();
    }

    /**
     * Creates a new account with the given account number and initial balance.
     *
     * @param accountNumber the account number
     * @param initialBalance the initial balance
     */
    public void createAccount(int accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
    }

    /**
     * Deposits the specified amount into the account with the given account number.
     *
     * @param accountNumber the account number
     * @param amount the amount to deposit
     */
    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    /**
     * Withdraws the specified amount from the account with the given account number.
     *
     * @param accountNumber the account number
     * @param amount the amount to withdraw
     */
    public void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            try {
                account.withdraw(amount);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Account not found");
        }
    }

    /**
     * Returns the balance of the account with the given account number.
     *
     * @param accountNumber the account number
     * @return the account balance
     */
    public double getBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found");
            return 0;
        }
    }
}