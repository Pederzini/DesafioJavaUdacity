public class SavingsAccount extends BankAccount {
    Integer transfers;

    public Integer getTransfers() {
        return transfers;
    }

    public void setTransfers(Integer transfers) {
        this.transfers = transfers;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                ", transfers=" + transfers +
                '}';
    }
}
