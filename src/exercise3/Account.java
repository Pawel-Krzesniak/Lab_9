package exercise3;

public class Account {
    private String accountHolder;
    private int balance;
    private String accountNumber;

    public Account(String accountHolder, int balance, String accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void transfer(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Nie masz wystarczających środków na koncie!");
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

