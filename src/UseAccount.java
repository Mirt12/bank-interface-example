import static java.lang.System.out;

class UseAccount {
    public static void main(String args[]) {
        Account myAccount = new Account();
        Account yourAccount = new Account();
        myAccount.name = "Barry";
        myAccount.address = "222 Inner Lane";
        myAccount.balance = 24.02;
        yourAccount.name = "Jeyn";
        yourAccount.address = "121 Outer Street";
        yourAccount.balance = 55.63;
        myAccount.display();
        out.print(" plus $");
        out.print(myAccount.getInterest(5.00));
        out.println(" income ");
        yourAccount.display();
        double yourInterestRate = 7.00;
        out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.println(" income ");
        //code for family members refactoring:
        myAccount.familyMembers = 4;
        yourAccount.familyMembers = 5;
        out.println(myAccount.familyMembers);
        out.println(yourAccount.familyMembers);

    }
}