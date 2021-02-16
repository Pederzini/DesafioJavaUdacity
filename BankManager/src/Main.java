public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CertificateOfDeposit certificateOfDeposit = new CertificateOfDeposit();

        checkingAccount.account = "115522";
        checkingAccount.balance = 1250.0;
        checkingAccount.limit = 1500.0;

        savingsAccount.account = "115533";
        savingsAccount.balance = 8645.9;
        savingsAccount.transfers = 6;

        certificateOfDeposit.account = "115544";
        certificateOfDeposit.balance = 2145.0;
        certificateOfDeposit.expiry = "20/12/2021";

        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
        System.out.println(certificateOfDeposit);
    }
}
