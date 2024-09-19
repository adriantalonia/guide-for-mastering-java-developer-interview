package _1_1_java_basics._1_1_2_data_types_and_variables._2_reference_data_types;

public class ReferenceDataTypesExamples {

    public static void main(String[] args) {
        // Array Example
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Example:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Class and Object Example
        CarExercise myCar = new CarExercise("Red", "Tesla Model S");
        System.out.println("\nClass and Object Example:");
        myCar.displayInfo();

        // Interface Example
        AnimalExercise myDog = new DogExercise();
        System.out.println("\nInterface Example:");
        myDog.sound();

        // String Example
        String greeting = "Hello, World!";
        System.out.println("\nString Example:");
        System.out.println("Length: " + greeting.length());
        System.out.println("Character at index 1: " + greeting.charAt(1));
        System.out.println("Substring from index 7: " + greeting.substring(7));

        // Object Example with toString and equals
        CarExercise anotherCar = new CarExercise("Blue", "BMW i8");
        System.out.println("\nObject Example:");
        System.out.println("Car details: " + anotherCar.toString());
        System.out.println("Cars are equal: " + myCar.equals(anotherCar));
    }
}

// Class Example
class Car {
    String color;
    String model;

    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }

    @Override
    public String toString() {
        return "Car Model: " + model + ", Color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CarExercise car = (CarExercise) obj;
        return color.equals(car.color) && model.equals(car.model);
    }
}

// Interface Example
interface Animal {
    void sound();
}

// Implementing Interface Example
class Dog implements AnimalExercise {
    public void sound() {
        System.out.println("Woof");
    }
}
