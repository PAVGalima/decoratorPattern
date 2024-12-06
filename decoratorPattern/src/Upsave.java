public class Upsave implements BankAccountDecorator{
    private BankAccount bankAccount;

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 4.0;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + " + With Insurance";
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
