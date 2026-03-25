// ============================================================
// Question 20 - Employee with this Keyword
// ============================================================

class EmployeeThis {
    String name;
    double salary;

    EmployeeThis(String name, double salary) {
        this.name   = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name   : " + name);
        System.out.printf("Employee Salary : Rs. %.2f%n", salary);
    }
}

public class EmployeeThisDemo {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Question 20 - Employee this Keyword   ");
        System.out.println("========================================");

        EmployeeThis e1 = new EmployeeThis("Alice",   75000);
        e1.display();
        System.out.println("-------------------");

        EmployeeThis e2 = new EmployeeThis("Bob",     90000);
        e2.display();
        System.out.println("-------------------");

        EmployeeThis e3 = new EmployeeThis("Charlie", 60000);
        e3.display();
    }
}
