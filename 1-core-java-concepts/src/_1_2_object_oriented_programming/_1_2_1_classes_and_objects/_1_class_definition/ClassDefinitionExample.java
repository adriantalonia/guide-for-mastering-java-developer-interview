package _1_2_object_oriented_programming._1_2_1_classes_and_objects._1_class_definition;

// Class Definition
class Animal {
    private String species;

    // Constructor
    public Animal(String species) {
        this.species = species;
    }

    // Method to display species
    public void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

public class ClassDefinitionExample {
    public static void main(String[] args) {
        // Instantiating the Animal class
        Animal myAnimal = new Animal("Lion");
        myAnimal.displaySpecies(); // Outputs: Species: Lion
    }
}
