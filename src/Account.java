import static java.lang.System.out;

public class Account {
    String name;
    String address;
    double balance;
    int familyMembers;

    public void display() {
        out.print(name);
        out.print(" (");
        out.print(") has on account $ ");
        out.print(balance);
        out.print(familyMembers);
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }


}