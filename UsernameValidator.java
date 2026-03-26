import java.util.Scanner;

class UsernameValidator {
    String username;

    UsernameValidator(String username) {
        this.username = username;
    }

    void validate() {
        String cleaned = username.trim().toLowerCase();
        System.out.println("Original Username : " + username);
        System.out.println("Cleaned Username  : " + cleaned);
    }
}

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("    Question 1 - Username Validator     ");
        System.out.println("========================================");
        System.out.print("Enter Username : ");
        String username = sc.nextLine();
        UsernameValidator uv = new UsernameValidator(username);
        uv.validate();

        sc.close();
    }
}
