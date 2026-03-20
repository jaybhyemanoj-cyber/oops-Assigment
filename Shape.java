abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("This is a Shape.");
        System.out.println("Area : " + calculate_area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculate_area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {

        // Shape s = new Shape(); // Uncommenting this line will cause compilation error:
                                  // Cannot instantiate the abstract class Shape

        Circle c = new Circle(5);
        System.out.println("Circle :");
        System.out.println("Radius : " + c.radius);
        System.out.printf("Area   : %.2f%n", c.calculate_area());
        c.display_info();

        System.out.println("-------------------");

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Rectangle :");
        System.out.println("Length  : " + r.length);
        System.out.println("Breadth : " + r.breadth);
        System.out.printf("Area    : %.2f%n", r.calculate_area());
        r.display_info();
    }
}
