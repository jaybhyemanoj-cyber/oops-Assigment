// ============================================================
// Question 17 - Employee Count using Static Variable
// ============================================================

class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String name, int id) {
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

public class EmployeeCount {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Question 17 - Employee Count         ");
        System.out.println("========================================");

        Employee emp1 = new Employee("Alice", 101);
        emp1.display();
        Employee.showEmployeeCount();
        System.out.println("-------------------");

        Employee emp2 = new Employee("Bob", 102);
        emp2.display();
        Employee.showEmployeeCount();
        System.out.println("-------------------");

        Employee emp3 = new Employee("Charlie", 103);
        emp3.display();
        Employee.showEmployeeCount();
        System.out.println("-------------------");

        Employee emp4 = new Employee("David", 104);
        emp4.display();
        Employee.showEmployeeCount();
    }
}
