package _1_2_object_oriented_programming._1_2_6_interfaces_and_abstrac_classes;

public class InterfacesAndAbstractClassesExample {
    public static void main(String[] args) {
        // Demonstrating the Animal interface
        Animal dog = new Dog();
        dog.sound(); // Outputs: Dog barks.
        dog.sleep(); // Outputs: This animal sleeps.

        Animal cat = new Cat();
        cat.sound(); // Outputs: Cat meows.
        cat.sleep(); // Outputs: This animal sleeps.

        System.out.println(); // New line for better readability

        // Demonstrating the Shape abstract class with Circle and Rectangle
        Shape circle = new Circle(5);
        circle.display(); // Outputs: This is a Circle.
        System.out.println("Area of Circle: " + circle.area()); // Outputs: Area of Circle: 78.53981633974483
        System.out.println("Perimeter of Circle: " + circle.perimeter()); // Outputs: Perimeter of Circle: 31.41592653589793

        System.out.println(); // New line for better readability

        Shape rectangle = new Rectangle(4, 6);
        rectangle.display(); // Outputs: This is a Rectangle.
        System.out.println("Area of Rectangle: " + rectangle.area()); // Outputs: Area of Rectangle: 24.0
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter()); // Outputs: Perimeter of Rectangle: 20.0
    }
}

// Defining an interface
interface Animal {
    void sound(); // Abstract method

    default void sleep() { // Default method
        System.out.println("This animal sleeps.");
    }
}

// Implementing the Animal interface in a Dog class
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Implementing the Animal interface in a Cat class
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

// Abstract class Shape
abstract class Shape {
    abstract double area(); // Abstract method

    abstract double perimeter(); // Abstract method

    void display() { // Concrete method
        System.out.println("This is a shape.");
    }
}

// Circle class extending the Shape abstract class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius; // Area = πr²
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius; // Perimeter = 2πr
    }

    @Override
    void display() {
        System.out.println("This is a Circle.");
        System.out.println("Radius: " + radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width; // Area = length × width
    }

    @Override
    double perimeter() {
        return 2 * (length + width); // Perimeter = 2(length + width)
    }

    @Override
    void display() {
        System.out.println("This is a Rectangle.");
        System.out.println("Length: " + length + ", Width: " + width);
    }
}
