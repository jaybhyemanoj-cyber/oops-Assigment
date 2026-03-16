public class Person {
    private String name;
    private int age;
    
    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Main method to create and test Person objects
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        
        // Print their details
        System.out.println("Person 1 details:");
        person1.displayDetails();
        
        System.out.println("Person 2 details:");
        person2.displayDetails();
        
        // Alternatively, print using getters
        System.out.println("\nUsing getters:");
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
