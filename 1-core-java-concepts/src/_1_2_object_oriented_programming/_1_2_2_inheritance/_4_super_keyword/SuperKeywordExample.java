package _1_2_object_oriented_programming._1_2_2_inheritance._4_super_keyword;

public class SuperKeywordExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.speak(); // Calls overridden method in Student
    }
}

class Person {
    Person() {
        System.out.println("Person is created");
    }

    void speak() {
        System.out.println("Person speaks");
    }
}

class Student extends Person {
    Student() {
        super(); // Calls constructor of Person
        System.out.println("Student is created");
    }

    @Override
    void speak() {
        super.speak(); // Calls speak method of Person
        System.out.println("Student speaks");
    }
}
