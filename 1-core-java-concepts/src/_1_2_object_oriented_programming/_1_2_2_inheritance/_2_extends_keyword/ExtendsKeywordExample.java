package _1_2_object_oriented_programming._1_2_2_inheritance._2_extends_keyword;

public class ExtendsKeywordExample {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();   // Inherited method
        sparrow.chirp(); // Specific to Sparrow
    }
}

class Bird {
    void fly() {
        System.out.println("Bird flies");
    }
}

class Sparrow extends Bird { // Using extends to inherit
    void chirp() {
        System.out.println("Sparrow chirps");
    }
}