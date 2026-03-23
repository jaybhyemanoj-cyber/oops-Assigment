// ============================================================
// Question 12 - Payment Processing System
// ============================================================

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    String cardHolder;
    String cardNumber;

    CreditCardPayment(String cardHolder, String cardNumber) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    void pay(double amount) {
        System.out.println("Credit Card Payment Initiated");
        System.out.println("Card Holder : " + cardHolder);
        System.out.println("Card Number : " + cardNumber);
        System.out.printf("Amount Paid : Rs. %.2f%n", amount);
        System.out.println("Payment Successful via Credit Card!");
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    void pay(double amount) {
        System.out.println("UPI Payment Initiated");
        System.out.println("UPI ID      : " + upiId);
        System.out.printf("Amount Paid : Rs. %.2f%n", amount);
        System.out.println("Payment Successful via UPI!");
    }
}

class NetBankingPayment extends Payment {
    String bankName;
    String accountNumber;

    NetBankingPayment(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    void pay(double amount) {
        System.out.println("Net Banking Payment Initiated");
        System.out.println("Bank Name   : " + bankName);
        System.out.println("Account No  : " + accountNumber);
        System.out.printf("Amount Paid : Rs. %.2f%n", amount);
        System.out.println("Payment Successful via Net Banking!");
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Question 12 - Payment Processing     ");
        System.out.println("========================================");

        Payment p1 = new CreditCardPayment("Alice", "1234-5678-9012-3456");
        Payment p2 = new UPIPayment("alice@upi");
        Payment p3 = new NetBankingPayment("SBI", "9876543210");

        p1.pay(5000.00);
        System.out.println("-------------------");
        p2.pay(1500.00);
        System.out.println("-------------------");
        p3.pay(10000.00);
    }
}
