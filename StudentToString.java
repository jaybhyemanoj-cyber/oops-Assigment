class Student {
    int    id;
    String name;

    Student(int id, String name) {
        this.id   = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [ ID : " + id + ", Name : " + name + " ]";
    }
}

public class StudentToString {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("      Question 9 - Student toString()   ");
        System.out.println("========================================");
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(103, "Charlie");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println();
        System.out.println("Using println directly (auto toString):");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
