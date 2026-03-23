// ============================================================
// Question 13 - Employee Performance Evaluation
// ============================================================

abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract double calculateBonus();

    void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.printf("Salary        : Rs. %.2f%n", salary);
        System.out.printf("Bonus         : Rs. %.2f%n", calculateBonus());
    }
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateBonus() {
        return 0.20 * salary;
    }
}

class Developer extends Employee {
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id, salary);
        this.projectIncentive = projectIncentive;
    }

    double calculateBonus() {
        return (0.10 * salary) + projectIncentive;
    }
}

public class EmployeePerformance {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Question 13 - Employee Performance    ");
        System.out.println("========================================");

        Employee e1 = new Manager("Bob", 201, 80000);
        Employee e2 = new Developer("Charlie", 202, 60000, 5000);

        e1.display();
        System.out.println("-------------------");
        e2.display();
    }
}
