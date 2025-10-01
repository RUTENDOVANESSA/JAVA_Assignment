//Rutendo V Mumvuri h240193J    Princess B Kwaniya H240301V

// 1.  custom exception
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        // 2. Throw and catch the exception

        System.out.println(" CUSTOM EXCEPTION");

        try {
            double amount = -100.0;

            if (amount < 0) {
                // 3. Throw custom exception
                throw new NegativeAmountException(
                        "Amount cannot be negative! Provided: " + amount
                );
            }

            System.out.println("Processing amount: $" + amount);

        } catch (NegativeAmountException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
            System.out.println("Please provide a positive amount.");
        }

        System.out.println("Program continues normally after exception handling.");
    }
}