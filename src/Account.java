import static java.lang.System.out;

public class Account {
    String name;
    String address;
    double balance;

    public void display() {
        out.print(name);
        out.print(" (");
        out.print(") has on account $ ");
        out.print(balance);
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}