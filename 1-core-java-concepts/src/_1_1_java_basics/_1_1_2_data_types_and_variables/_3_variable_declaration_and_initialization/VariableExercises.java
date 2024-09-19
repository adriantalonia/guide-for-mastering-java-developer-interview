package _1_1_java_basics._1_1_2_data_types_and_variables._3_variable_declaration_and_initialization;

public class VariableExercises {
    public static void main(String[] args) {
        /*Exercise 1: Declare and Initialize Variables
        Task: Declare and initialize variables of different types, and print their values.*/
        System.out.println("****************************************");
        // Declare and initialize variables
        int age = 25;
        double salary = 50000.0;
        String name = "Alice";
        boolean isEmployed = true;
        // Print the values
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Name: " + name);
        System.out.println("Employed: " + isEmployed);
        /*Exercise 2: Calculate the Area of a Circle
        Task: Declare variables for the radius and area of a circle. Initialize the radius, calculate the area, and print it.*/
        // Declare and initialize radius
        System.out.println("****************************************");
        double radius = 7.5;
        // Declare a variable for the area
        double area;
        // Calculate the area
        area = Math.PI * radius * radius;
        // Print the area
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
        /*Exercise 3: Swap Two Variables
        Task: Declare and initialize two variables. Swap their values and print the results.*/
        // Declare and initialize variables
        System.out.println("****************************************");
        int a = 5;
        int b = 10;
        // Print initial values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Swap the values
        int temp = a;
        a = b;
        b = temp;
        // Print the swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        /*Exercise 4: Calculate Simple Interest
        Task: Declare variables for principal, rate of interest, and time. Calculate the simple interest and print it.*/
        // Declare and initialize variables
        System.out.println("****************************************");
        double principal = 1000.0;
        double rate = 5.0; // in percentage
        double time = 3.0; // in years
        // Declare a variable for simple interest
        double simpleInterest;
        // Calculate simple interest
        simpleInterest = (principal * rate * time) / 100;
        // Print the simple interest
        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Simple Interest: " + simpleInterest);
        /*Exercise 5: Concatenate Strings
        Task: Declare and initialize string variables. Concatenate them and print the result.*/
        // Declare and initialize string variables
        System.out.println("****************************************");
        String firstName = "John";
        String lastName = "Doe";
        // Concatenate strings
        String fullName = firstName + " " + lastName;
        // Print the full name
        System.out.println("Full Name: " + fullName);
        /*Exercise 6: Increment and Decrement Operations
        Task: Declare and initialize an integer variable. Perform increment and decrement operations and print the results.*/
        // Declare and initialize an integer variable
        System.out.println("****************************************");
        int number = 10;
        // Print the initial value
        System.out.println("Initial value: " + number);
        // Increment the variable
        number++;
        System.out.println("After increment: " + number);
        // Decrement the variable
        number--;
        System.out.println("After decrement: " + number);
    }
}
