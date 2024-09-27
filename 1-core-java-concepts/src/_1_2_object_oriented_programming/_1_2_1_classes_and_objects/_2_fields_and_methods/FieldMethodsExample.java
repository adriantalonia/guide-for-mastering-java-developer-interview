package _1_2_object_oriented_programming._1_2_1_classes_and_objects._2_fields_and_methods;

class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class FieldMethodsExample {
    public static void main(String[] args) {
        // Instantiating the Book class
        Book myBook = new Book("1984", "George Orwell");
        myBook.displayDetails(); // Outputs: Title: 1984, Author: George Orwell
    }
}
