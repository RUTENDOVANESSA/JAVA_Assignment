//Rutendo V Mumvuri h240193J    Princess B Kwaniya H240301V
class Account extends Bank {

    // call parent constructor
    public Account(String accountName, double initialBalance) {
        super(accountName, initialBalance); // Call Bank constructor
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("\nAttempting to withdraw: $" + amount);

        // Is amount valid?
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0");
            recordTransaction("WITHDRAWAL", amount, "FAILED - Invalid amount");
            return;
        }
        //  Is there enough balance?
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance");
            System.out.println("   Current balance: $" + balance);
            recordTransaction("WITHDRAWAL", amount, "FAILED - Insufficient funds");
        } else {
            // Success
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
            System.out.println("   New balance: $" + balance);
            recordTransaction("WITHDRAWAL", amount, "SUCCESS");
        }
    }
    @Override
    public void deposit(double amount) {
        System.out.println("\nAttempting to deposit: $" + amount);

        // Is amount valid?
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
            System.out.println("   New balance: $" + balance);
            recordTransaction("DEPOSIT", amount, "SUCCESS");
        } else {
            System.out.println("Deposit amount must be greater than 0");
            recordTransaction("DEPOSIT", amount, "FAILED - Invalid amount");
        }
    }
       @Override
    public double getBalance() {
        System.out.println("Current balance: $" + balance);
        recordTransaction("BALANCE CHECK", 0, "SUCCESS");
        return balance;
    }

        public String getAccountName() {
        return accountName;
    }
}