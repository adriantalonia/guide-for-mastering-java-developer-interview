package _1_5_Java_I_O._1_5_1_file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExamples {

    private static final String FILE_NAME = "example.txt";

    public static void main(String[] args) {
        createFile();
        writeFile("Hello, Java I/O!\nThis is file handling in action.");
        readFile();
    }

    // Create file if it doesn't exist
    public static void createFile() {
        File file = new File(FILE_NAME);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Size (bytes): " + file.length());
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Write content to file using try-with-resources
    public static void writeFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Read content from file using Scanner
    public static void readFile() {
        File file = new File(FILE_NAME);
        try (Scanner reader = new Scanner(file)) {
            System.out.println("\nContents of the file:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
