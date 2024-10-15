package _1_2_object_oriented_programming._1_2_3_polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        // Example of Method Overloading
        System.out.println(Helper.Multiply(2, 4)); // 8
        System.out.println(Helper.Multiply(5.5, 6.3)); // 34.65

        // Example of Runtime Polymorphism
        Parent a;
        a = new Subclass1();
        a.Print(); // subclass1
        a = new Subclass2();
        a.Print(); // subclass2

        // Example of Method Overloading with Different Parameters
        Example example = new Example();
        int square = example.calculate(5); // Calls calculate(int a)
        double cube = example.calculate(2.5); // Calls calculate(double a)
        String repeated = example.calculate("Hello"); // Calls calculate(String str)

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Repeated: " + repeated);

        // Example of Upcasting and Downcasting
        Animal myDog = new Dog(); // Upcasting
        myDog.sound(); // Outputs: Dog barks

        Dog dog = (Dog) myDog; // Downcasting
        dog.sound(); // Outputs: Dog barks
    }
}

class Helper {
    // Method overloading (Compile-Time Polymorphism)
    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }
}

class Parent {
    void Print() {
        System.out.println("parent class");
    }
}

class Subclass1 extends Parent {
    @Override
    void Print() {
        System.out.println("subclass1");
    }
}

class Subclass2 extends Parent {
    @Override
    void Print() {
        System.out.println("subclass2");
    }
}

class Example {
    int calculate(int a) {
        return a * a; // Returns square of a
    }

    double calculate(double a) {
        return a * a * a; // Returns cube of a
    }

    String calculate(String str) {
        return str + str; // Returns string concatenated with itself
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
