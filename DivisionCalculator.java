import java.util.Scanner;

class DivisionCalculator {
    void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   Question 12 - Division Calculator    ");
        System.out.println("========================================");
        System.out.print("Enter First Number  : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();
        DivisionCalculator dc = new DivisionCalculator();
        dc.divide(num1, num2);

        sc.close();
    }
}
