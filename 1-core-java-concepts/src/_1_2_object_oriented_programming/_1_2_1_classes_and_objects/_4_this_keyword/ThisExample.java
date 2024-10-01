package _1_2_object_oriented_programming._1_2_1_classes_and_objects._4_this_keyword;

public class ThisExample {

    // Example 1: Reference to Current Object
    public static class Person {
        private String name;

        // Constructor
        public Person(String name) {
            this.name = name;  // 'this' refers to the instance variable
        }

        public void display() {
            System.out.println("Name: " + this.name); // 'this' is optional here
        }
    }

    // Example 2: Distinguishing Instance Variables
    public static class Employee {
        private String name;
        private int id;

        // Constructor
        public Employee(String name, int id) {
            this.name = name; // 'this.name' refers to the instance variable
            this.id = id;     // 'this.id' refers to the instance variable
        }

        public void displayInfo() {
            System.out.println("Name: " + this.name + ", ID: " + this.id);
        }
    }

    // Example 3: Constructor Chaining
    public static class Rectangle {
        private double length;
        private double width;

        // Default Constructor
        public Rectangle() {
            this(1.0, 1.0); // Calls the parameterized constructor
        }

        // Parameterized Constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double area() {
            return length * width;
        }

        public void display() {
            System.out.println("Area: " + area());
        }
    }

    // Example 4: Passing Current Object
    public static class Calculator {
        private int value;

        public Calculator(int value) {
            this.value = value;
        }

        public void add(Calculator other) {
            this.value += other.value; // Accessing the value of the passed object
        }

        public void display() {
            System.out.println("Value: " + this.value);
        }
    }

    // Main method to demonstrate all examples
    public static void main(String[] args) {
        // Example 1: Person
        Person person = new Person("Alice");
        person.display(); // Outputs: Name: Alice

        // Example 2: Employee
        Employee emp = new Employee("Bob", 101);
        emp.displayInfo(); // Outputs: Name: Bob, ID: 101

        // Example 3: Rectangle
        Rectangle rect1 = new Rectangle(); // Calls default constructor
        rect1.display(); // Outputs: Area: 1.0

        Rectangle rect2 = new Rectangle(5.0, 3.0); // Calls parameterized constructor
        rect2.display(); // Outputs: Area: 15.0

        // Example 4: Calculator
        Calculator calc1 = new Calculator(10);
        Calculator calc2 = new Calculator(20);

        calc1.add(calc2); // Passing current object calc2 to method
        calc1.display(); // Outputs: Value: 30
    }
}
