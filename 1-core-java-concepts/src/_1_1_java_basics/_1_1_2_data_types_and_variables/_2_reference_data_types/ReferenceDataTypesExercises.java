package _1_1_java_basics._1_1_2_data_types_and_variables._2_reference_data_types;

public class ReferenceDataTypesExercises {

    public static void main(String[] args) {
        // Array Exercise: Sum of all elements
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Array Exercise: Sum of all elements = " + sum);

        // Class and Object Exercise: Display car details
        CarExercise myCar = new CarExercise("Red", "Tesla Model S");
        System.out.println("\nClass and Object Exercise:");
        myCar.displayInfo();

        // Interface Exercise: Animal sounds
        AnimalExercise myDog = new DogExercise();
        AnimalExercise myCat = new Cat();
        System.out.println("\nInterface Exercise:");
        myDog.sound();
        myCat.sound();

        // String Exercise: Reverse a string
        String original = "Hello, World!";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("\nString Exercise: Reversed string = " + reversed);

        // Object Exercise: Check equality of two cars
        CarExercise anotherCar = new CarExercise("Blue", "BMW i8");
        CarExercise thirdCar = new CarExercise("Red", "Tesla Model S");
        System.out.println("\nObject Exercise:");
        System.out.println("First car equals second car: " + myCar.equals(anotherCar));
        System.out.println("First car equals third car: " + myCar.equals(thirdCar));
    }
}

// Class Example with a method to display information
class CarExercise {
    String color;
    String model;

    CarExercise(String color, String model) {
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
interface AnimalExercise {
    void sound();
}

// Implementing Interface Example: Dog
class DogExercise implements AnimalExercise {
    public void sound() {
        System.out.println("Dog says: Woof");
    }
}

// Implementing Interface Example: Cat
class Cat implements AnimalExercise {
    public void sound() {
        System.out.println("Cat says: Meow");
    }
}