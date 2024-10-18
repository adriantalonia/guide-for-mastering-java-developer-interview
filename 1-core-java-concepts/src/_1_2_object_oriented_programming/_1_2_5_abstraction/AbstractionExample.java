package _1_2_object_oriented_programming._1_2_5_abstraction;

// Abstract class representing a general Shape
abstract class Shape {
    // Abstract method for calculating area
    abstract double area();

    // Abstract method for calculating perimeter
    abstract double perimeter();

    // A concrete method that can be inherited by subclasses
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class representing a Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method for area
    @Override
    double area() {
        return Math.PI * radius * radius; // Area = πr²
    }

    // Implementation of the abstract method for perimeter
    @Override
    double perimeter() {
        return 2 * Math.PI * radius; // Perimeter = 2πr
    }

    // Overriding the display method
    @Override
    void display() {
        System.out.println("This is a Circle.");
        System.out.println("Radius: " + radius);
    }
}

// Concrete class representing a Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method for area
    @Override
    double area() {
        return length * width; // Area = length × width
    }

    // Implementation of the abstract method for perimeter
    @Override
    double perimeter() {
        return 2 * (length + width); // Perimeter = 2(length + width)
    }

    // Overriding the display method
    @Override
    void display() {
        System.out.println("This is a Rectangle.");
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating a Circle object
        Shape circle = new Circle(5);
        circle.display(); // Outputs: This is a Circle.
        System.out.println("Area of Circle: " + circle.area()); // Outputs: Area of Circle: 78.53981633974483
        System.out.println("Perimeter of Circle: " + circle.perimeter()); // Outputs: Perimeter of Circle: 31.41592653589793

        System.out.println();

        // Creating a Rectangle object
        Shape rectangle = new Rectangle(4, 6);
        rectangle.display(); // Outputs: This is a Rectangle.
        System.out.println("Area of Rectangle: " + rectangle.area()); // Outputs: Area of Rectangle: 24.0
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter()); // Outputs: Perimeter of Rectangle: 20.0
    }
}
