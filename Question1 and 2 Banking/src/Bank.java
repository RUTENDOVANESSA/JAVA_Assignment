//Rutendo V Mumvuri h240193J    Princess B Kwaniya H240301V
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Bank {
    protected String accountName;
    protected double balance;

   //constructor
    public Bank(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

  public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();


    protected void recordTransaction(String transactionType, double amount, String status) {
        try {PrintWriter writer = new PrintWriter(new FileWriter("Bank.txt", true));
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = dateFormat.format(new Date());
            //  transaction details
            writer.println("Account: " + accountName);
            writer.println("Transaction: " + transactionType);
            writer.println("Amount: $" + amount);
            writer.println("Balance: $" + balance);
            writer.println("Status: " + status);
            writer.println("Timestamp: " + timestamp);
            writer.println("----------------------------------------");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to transaction file: " + e.getMessage());
        }
    }
}