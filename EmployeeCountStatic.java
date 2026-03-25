// ============================================================
// Question 17 - Employee Count using Static Variable
// ============================================================

class EmployeeCount {
    String name;
    int id;
    static int employeeCount = 0;

    EmployeeCount(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }

    static void showEmployeeCount() {
        System.out.println("Total Employees Created : " + employeeCount);
    }
}

public class EmployeeCountStatic {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Question 17 - Employee Count         ");
        System.out.println("========================================");

        EmployeeCount emp1 = new EmployeeCount("Alice", 101);
        emp1.display();
        EmployeeCount.showEmployeeCount();
        System.out.println("-------------------");

        EmployeeCount emp2 = new EmployeeCount("Bob", 102);
        emp2.display();
        EmployeeCount.showEmployeeCount();
        System.out.println("-------------------");

        EmployeeCount emp3 = new EmployeeCount("Charlie", 103);
        emp3.display();
        EmployeeCount.showEmployeeCount();
        System.out.println("-------------------");

        EmployeeCount emp4 = new EmployeeCount("David", 104);
        emp4.display();
        EmployeeCount.showEmployeeCount();
    }
}
