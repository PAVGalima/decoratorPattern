public class Gsave implements BankAccountDecorator{
    private BankAccount bankAccount;

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 2.5;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + " + GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() + (bankAccount.getBalance() * (getInterestRate() / 100));
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
