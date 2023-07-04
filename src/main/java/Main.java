public class Main {
    public static void main(String[] args) {
        BelarusBankCard card1 = new BelarusBankCard(700);
        BelarusBankTerminal terminal1 = new BelarusBankTerminal();
        terminal1.printDeposit(card1);
        System.out.println("____________");

        PriorBankCard card2 = new PriorBankCard(800);
        PriorBankTerminal terminal2 = new PriorBankTerminal();
        terminal2.printAccount(card2);
        terminal1.printDeposit(card2);
        System.out.println("____________");

        AfrikaBankTerminal terminal3 = new AfrikaBankTerminal();
        terminal3.printBalance(card1);
        terminal3.printBalance(card2);
    }
}
