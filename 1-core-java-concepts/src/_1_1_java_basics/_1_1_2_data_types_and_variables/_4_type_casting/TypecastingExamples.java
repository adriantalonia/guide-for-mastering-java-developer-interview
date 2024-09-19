package _1_1_java_basics._1_1_2_data_types_and_variables._4_type_casting;

public class TypecastingExamples {
    public static void main(String[] args) {
        // Implicit Casting Examples
        implicitCastingExamples();
        // Explicit Casting Examples
        explicitCastingExamples();
        // Upcasting Example
        upcastingExample();
        // Downcasting Example
        downcastingExample();
    }

    // Method for Implicit Casting Examples
    public static void implicitCastingExamples() {
        System.out.println("Implicit Casting Examples:");
        byte byteValue = 10;
        short shortValue = byteValue; // byte to short
        int intValue = shortValue;    // short to int
        long longValue = intValue;    // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println();
    }

    // Method for Explicit Casting Examples
    public static void explicitCastingExamples() {
        System.out.println("Explicit Casting Examples:");
        double doubleValue = 9.78;
        float floatValue = (float) doubleValue;  // double to float
        long longValue = (long) floatValue;      // float to long
        int intValue = (int) longValue;          // long to int
        short shortValue = (short) intValue;     // int to short
        byte byteValue = (byte) shortValue;      // short to byte
        System.out.println("Double value: " + doubleValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Byte value: " + byteValue);
        System.out.println();
    }

    // Method for Upcasting Example
    public static void upcastingExample() {
        System.out.println("Upcasting Example:");
        Animal animal = new Dog(); // Upcasting
        animal.makeSound(); // Calls the overridden method in Dog class
        System.out.println();
    }

    // Method for Downcasting Example
    public static void downcastingExample() {
        System.out.println("Downcasting Example:");
        Animal animal = new Cat();
        animal.eat(); // Calls the method in Animal class
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; // Safe downcasting
            cat.meow(); // Calls the method in Cat class
        }
        System.out.println();
    }
}

// Base class Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

// Derived class Dog
class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void fetch() {
        System.out.println("The dog fetches a ball");
    }
}

// Derived class Cat
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat is meowing.");
    }
}
