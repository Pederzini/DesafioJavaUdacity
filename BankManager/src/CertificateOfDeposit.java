public class CertificateOfDeposit extends BankAccount {
    String expiry;

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "CertificateOfDeposit{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                ", expiry='" + expiry + '\'' +
                '}';
    }
}
