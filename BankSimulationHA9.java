import java.util.*;
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}
class BankAccount {
    private String holderName;
    private double balance;

    BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed: Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful! Remaining Balance: " + balance);
    }

    void display() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankSimulationHA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(name, balance);

    
            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            System.out.println("\n--- Transaction Details ---");
            account.display();
            account.withdraw(amount);
        }
        catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers only.");
        }
    }
}
