package banktest;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0 || Double.isNaN(amount)) {
            throw new IllegalArgumentException("Deposit amount must be a number greater than 0");
        }
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= 0 || Double.isNaN(amount)) {
            throw new IllegalArgumentException("Withdraw amount must be a number greater than 0");
        }
        if (amount > balance) {
            return 0.0;
        }
        this.balance -= amount;
        return amount;
    }
}
