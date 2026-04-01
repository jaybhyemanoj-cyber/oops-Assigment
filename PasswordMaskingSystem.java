import java.util.Scanner;

class PasswordMaskingSystem {
    String password;

    PasswordMaskingSystem(String password) {
        this.password = password;
    }

    void maskPassword() {
        int    length     = password.length();
        String masked;

        if (length <= 2) {
            masked = password;
        } else {
            String lastTwo  = password.substring(length - 2);
            String stars    = "*".repeat(length - 2);
            masked          = stars + lastTwo;
        }

        System.out.println("Original Password : " + password);
        System.out.println("Masked Password   : " + masked);
    }
}

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  Question 10 - Password Masking System ");
        System.out.println("========================================");
        System.out.print("Enter Password : ");
        String password = sc.nextLine();
        PasswordMaskingSystem pms = new PasswordMaskingSystem(password);
        pms.maskPassword();

        sc.close();
    }
}
