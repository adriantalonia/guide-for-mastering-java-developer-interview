package _1_5_Java_I_O._1_5_3_serialization_and_deserialization;

import java.io.*;

/**
 * Demonstrates Serialization and Deserialization in Java with best practices.
 */
public class SerializationExamples {

    public static void main(String[] args) {
        String filePath = "user.ser";

        // Create a User object
        User user = new User("Alice", 30, "secretPassword");

        // Serialize the User object to a file
        serializeUser(user, filePath);

        // Deserialize the User object from the file
        User deserializedUser = deserializeUser(filePath);

        if (deserializedUser != null) {
            System.out.println("Deserialized User:");
            System.out.println("Name: " + deserializedUser.getName());
            System.out.println("Age: " + deserializedUser.getAge());
            System.out.println("Password: " + deserializedUser.getPassword()); // should be null (transient)
        }
    }

    /**
     * Serializes a User object to the specified file.
     */
    public static void serializeUser(User user, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(user);
            System.out.println("User serialized successfully to: " + filePath);
        } catch (IOException e) {
            System.err.println("Serialization failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Deserializes a User object from the specified file.
     */
    public static User deserializeUser(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (User) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}

/**
 * Serializable class with best practices.
 */
class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient String password; // Not serialized

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}

