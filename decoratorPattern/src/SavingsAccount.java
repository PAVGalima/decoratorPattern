public class SavingsAccount implements BankAccount{

    private final String accountNumber;
    private final String accountName;
    private final double balance;

    public SavingsAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 1.0;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance + (balance * (getInterestRate() / 100));
    }

    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: " + balance;
    }
}
