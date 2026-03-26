import java.util.Scanner;

class EmailChecker {
    String email;

    EmailChecker(String email) {
        this.email = email;
    }

    void check() {
        System.out.println("Email Entered : " + email);
        if (email.endsWith("@gmail.com")) {
            System.out.println("Result        : Valid Gmail Address");
        } else {
            System.out.println("Result        : Invalid Email");
        }
    }
}

public class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     Question 2 - Email Checker         ");
        System.out.println("========================================");
        System.out.print("Enter Email Address : ");
        String email = sc.nextLine();
        EmailChecker ec = new EmailChecker(email);
        ec.check();

        sc.close();
    }
}
