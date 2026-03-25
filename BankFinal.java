// ============================================================
// Question 18 - Bank with Final Interest Rate
// ============================================================

class Bank {
    String customerName;
    final double interestRate = 6.75;

    Bank(String customerName) {
        this.customerName = customerName;
    }

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }

    void display(double amount) {
        System.out.println("Customer Name  : " + customerName);
        System.out.printf("Amount         : Rs. %.2f%n", amount);
        System.out.printf("Interest Rate  : %.2f%%%n", interestRate);
        System.out.printf("Interest       : Rs. %.2f%n", calculateInterest(amount));
    }
}

public class BankFinal {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Question 18 - Bank Interest Rate     ");
        System.out.println("========================================");

        Bank customer1 = new Bank("Alice");
        customer1.display(50000);
        System.out.println("-------------------");

        Bank customer2 = new Bank("Bob");
        customer2.display(100000);
        System.out.println("-------------------");

        Bank customer3 = new Bank("Charlie");
        customer3.display(200000);
    }
}
