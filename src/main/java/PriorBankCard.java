public class PriorBankCard implements AnyCard{
    private int account;

    public int getAccount() {
        return account;
    }

    public PriorBankCard(int account) {
        this.account = account;
    }

    @Override
    public int getMoney() {
        return account;
    }
}
