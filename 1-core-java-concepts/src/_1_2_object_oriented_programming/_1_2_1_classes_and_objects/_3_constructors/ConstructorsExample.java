package _1_2_object_oriented_programming._1_2_1_classes_and_objects._3_constructors;

// Class Definition
class Car {
    private String make;
    private String model;

    // Default Constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
    }

    // Parameterized Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
    }
}

public class ConstructorsExample {
    public static void main(String[] args) {
        // Using the default constructor
        Car defaultCar = new Car();
        defaultCar.displayDetails(); // Outputs: Car Make: Unknown, Car Model: Unknown

        // Using the parameterized constructor
        Car myCar = new Car("Toyota", "Corolla");
        myCar.displayDetails(); // Outputs: Car Make: Toyota, Car Model: Corolla
    }
}
