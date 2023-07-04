public class BelarusBankCard implements AnyCard{
    private int deposit;

    public int getDeposit() {
        return deposit;
    }

    public BelarusBankCard(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public int getMoney() {
        return deposit;
    }
}
