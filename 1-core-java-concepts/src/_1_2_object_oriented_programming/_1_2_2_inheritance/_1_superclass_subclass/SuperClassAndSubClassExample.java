package _1_2_object_oriented_programming._1_2_2_inheritance._1_superclass_subclass;

public class SuperClassAndSubClassExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Inherited method
        car.drive(); // Specific to Car
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}