import java.util.Scanner;

class MessageFormatter {
    String firstName;
    String lastName;

    MessageFormatter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    void displayFullName() {
        String fullName = firstName + " " + lastName;
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Full Name  : " + fullName);
    }
}

public class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("    Question 4 - Message Formatter      ");
        System.out.println("========================================");
        System.out.print("Enter First Name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name  : ");
        String lastName  = sc.nextLine();
        MessageFormatter mf = new MessageFormatter(firstName, lastName);
        mf.displayFullName();

        sc.close();
    }
}
