import java.util.Scanner;

class StudentNameComparison {
    String name1;
    String name2;

    StudentNameComparison(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    void compare() {
        System.out.println("Student Name 1 : " + name1);
        System.out.println("Student Name 2 : " + name2);

        System.out.println();
        System.out.println("Case-Sensitive Comparison :");
        if (name1.equals(name2)) {
            System.out.println("Both names are EQUAL (Case-Sensitive)");
        } else {
            System.out.println("Names are NOT EQUAL (Case-Sensitive)");
        }

        System.out.println();
        System.out.println("Case-Insensitive Comparison :");
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both names are EQUAL (Case-Insensitive)");
        } else {
            System.out.println("Names are NOT EQUAL (Case-Insensitive)");
        }
    }
}

public class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  Question 3 - Student Name Comparison  ");
        System.out.println("========================================");
        System.out.print("Enter Student Name 1 : ");
        String student1 = sc.nextLine();
        System.out.print("Enter Student Name 2 : ");
        String student2 = sc.nextLine();
        StudentNameComparison snc = new StudentNameComparison(student1, student2);
        snc.compare();

        sc.close();
    }
}
