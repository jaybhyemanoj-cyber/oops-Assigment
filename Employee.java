public class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void HaveData(int empno, String ename, float basic, float hra, float da) {
        this.empno = empno;
        this.ename = ename;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.netpay = Calculate();
    }

    void DispData() {
        System.out.println("Employee No   : " + empno);
        System.out.println("Employee Name : " + ename);
        System.out.printf("Basic Salary  : %.2f%n", basic);
        System.out.printf("HRA           : %.2f%n", hra);
        System.out.printf("DA            : %.2f%n", da);
        System.out.printf("Net Pay       : %.2f%n", netpay);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.HaveData(1001, "Alice", 20000, 5000, 3000);
        emp1.DispData();

        System.out.println("-------------------");

        Employee emp2 = new Employee();
        emp2.HaveData(1002, "Bob", 35000, 8000, 5000);
        emp2.DispData();

        System.out.println("-------------------");

        Employee emp3 = new Employee();
        emp3.HaveData(1003, "Charlie", 50000, 12000, 8000);
        emp3.DispData();
    }
}
