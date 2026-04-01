import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATMWithdrawal {
    double balance;

    ATMWithdrawal(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("    Question 11 - ATM Withdrawal        ");
        System.out.println("========================================");
        System.out.print("Enter Account Balance    : ");
        double balance = sc.nextDouble();
        System.out.print("Enter Withdrawal Amount  : ");
        double amount  = sc.nextDouble();
        ATMWithdrawal atm = new ATMWithdrawal(balance);
        try {
            atm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
