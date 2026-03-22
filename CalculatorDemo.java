class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println("===== Calculator - Method Overloading =====");

        Calculator calc = new Calculator();
        System.out.println("add(10, 20)        : " + calc.add(10, 20));
        System.out.println("add(10, 20, 30)     : " + calc.add(10, 20, 30));
        System.out.println("add(10.5, 20.5)     : " + calc.add(10.5, 20.5));
    }
}
