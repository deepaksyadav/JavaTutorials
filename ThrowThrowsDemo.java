// A simple BankAccount class
// OverdraftException.java is needed in same scope
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws OverdraftException {
        if (amount > balance) {
            throw new OverdraftException(
                    "Attempt to withdraw Rs" + amount + " with balance of Rs" + balance + "."
            );
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: Rs" + balance);
        }
    }
}

// Main class to test
public class ThrowThrowsDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(50);

        try {
            account.withdraw(100);  // Will throw exception
        } catch (OverdraftException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


