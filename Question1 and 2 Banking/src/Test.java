//Rutendo V Mumvuri h240193J    Princess B Kwaniya H240301V
public class Test {
    public static void main(String[] args) {
        System.out.println("BANKING SYSTEM STARTING ");

                System.out.println("Creating account for Rutendo V Mumvuri & Princess B Kwaniya with $1000...");
        Account myAccount = new Account("Rutendo V Mumvuri & Princess B Kwaniya", 1000.0);

        System.out.println("\nAccount Holder: " + myAccount.getAccountName());
        System.out.println(" Initial Balance: $" + myAccount.getBalance());

        System.out.println("DEPOSITS:");
        System.out.println("=".repeat(20));

        myAccount.deposit(500.0);   // Valid deposit
        myAccount.deposit(-100.0);  //  Invalid deposit (negative)
        myAccount.deposit(0);       //  Invalid deposit (zero)
        myAccount.deposit(250.0);   // Valid deposit

        // Step 3: Test withdrawals
        System.out.println("\n" + "=".repeat(40));
        System.out.println(" WITHDRAWALS:");
        System.out.println("=".repeat(40));

        myAccount.withdraw(300.0);   //  Valid withdrawal
        myAccount.withdraw(2000.0);  //  Invalid (too much)
        myAccount.withdraw(-50.0);   //  Invalid (negative)
        myAccount.withdraw(800.0);   //  Valid withdrawal

       System.out.println("\n" + "=".repeat(40));
        System.out.println("FINAL SUMMARY:");
        System.out.println("=".repeat(40));
        System.out.println("Final Balance: $" + myAccount.getBalance());

        System.out.println("\n All transactions have been recorded in Bank.txt");
        System.out.println(" the End");
    }
}