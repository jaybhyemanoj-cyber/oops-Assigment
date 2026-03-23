// ============================================================
// Question 14 - Multilevel Inheritance
// ============================================================

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void role() {
        System.out.println(name + " is a Person.");
    }
}

class Emp extends Person {
    int empId;

    Emp(String name, int empId) {
        super(name);
        this.empId = empId;
    }

    void role() {
        System.out.println(name + " is an Employee with ID : " + empId);
    }
}

class Mgr extends Emp {
    String department;

    Mgr(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    void role() {
        System.out.println(name + " is a Manager of " + department + " Department with ID : " + empId);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Question 14 - Multilevel Inheritance  ");
        System.out.println("========================================");

        Person person = new Person("David");
        Person emp    = new Emp("Eve", 301);
        Person mgr    = new Mgr("Frank", 302, "IT");

        person.role();
        emp.role();
        mgr.role();
    }
}
