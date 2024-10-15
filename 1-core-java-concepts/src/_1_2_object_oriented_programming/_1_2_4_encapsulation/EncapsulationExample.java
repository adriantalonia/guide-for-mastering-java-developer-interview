package _1_2_object_oriented_programming._1_2_4_encapsulation;

public class EncapsulationExample {
    // Private variables
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        EncapsulationExample person = new EncapsulationExample();

        // Using setters to set values
        person.setName("Alice");
        person.setAge(30);

        // Using getters to retrieve values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting to set an invalid age
        person.setAge(-5);  // Output: Please enter a valid age.
    }
}

// Class to demonstrate access modifiers
class AccessModifiersDemo {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;
    int defaultVar = 40; // default access

    void display() {
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
        System.out.println("Default: " + defaultVar);
    }
}

// Class demonstrating getters and setters
class Student {
    private String studentName;
    private int studentId;

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Setter for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Setter for studentId with validation
    public void setStudentId(int studentId) {
        if (studentId > 0) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid student ID.");
        }
    }
}

// Another class to demonstrate usage of the Student class
class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setters
        student.setStudentName("Bob");
        student.setStudentId(101);

        // Getting values using getters
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student ID: " + student.getStudentId());

        // Attempting to set an invalid student ID
        student.setStudentId(-1);  // Output: Invalid student ID.
    }
}