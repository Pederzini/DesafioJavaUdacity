public class CheckingAccount extends BankAccount {
    Double limit;

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}
