public class CIMB {
    public static void main(String[] args) {

        // Creating a Savings Account
        BankAccount savingsAccount = new SavingsAccount(
                "32118",
                "Patrick Ace Galima",
                3500);

        //Savings Account details
        System.out.println("Savings Account Details:");
        System.out.println(savingsAccount.showInfo());
        System.out.println("Account Type: " + savingsAccount.showAccountType());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");
        System.out.println("Benefits: " + savingsAccount.showBenefits());
        System.out.println("Balance with Interest: " + savingsAccount.computeBalanceWithInterest());
        System.out.println();

        //Savings Account with GSave
        Gsave gSave = new Gsave();
        gSave.setBankAccount(savingsAccount);

        System.out.println("GSave Account Details:");
        System.out.println(gSave.showInfo());
        System.out.println("Account Type: " + gSave.showAccountType());
        System.out.println("Interest Rate: " + gSave.getInterestRate() + "%");
        System.out.println("Benefits: " + gSave.showBenefits());
        System.out.println("Balance with Interest: " + gSave.computeBalanceWithInterest());
        System.out.println();

        // Savings Account with UpSave
        Upsave upSave = new Upsave();
        upSave.setBankAccount(savingsAccount);

        System.out.println("UpSave Account Details:");
        System.out.println(upSave.showInfo());
        System.out.println("Account Type: " + upSave.showAccountType());
        System.out.println("Interest Rate: " + upSave.getInterestRate() + "%");
        System.out.println("Benefits: " + upSave.showBenefits());
        System.out.println("Balance with Interest: " + upSave.computeBalanceWithInterest());
    }
}