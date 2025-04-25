# 📂 1.5.1 File Handling

<!-- TOC -->
* [📂 1.5.1 File Handling](#-151-file-handling)
  * [📌 Overview](#-overview)
  * [📘 Key Concepts](#-key-concepts)
    * [✅ `File` Class](#-file-class)
    * [🔹 Key Methods of the `File` Class](#-key-methods-of-the-file-class)
  * [📄 Example: File Creation and Properties](#-example-file-creation-and-properties)
  * [📝 Reading from a File](#-reading-from-a-file)
  * [✍️ Writing to a File](#-writing-to-a-file)
  * [🧠 Real-World Scenarios](#-real-world-scenarios)
  * [✅ Best Practices](#-best-practices)
  * [💬 Interview Questions & Answers](#-interview-questions--answers)
    * [❓ What is the `File` class in Java?](#-what-is-the-file-class-in-java)
    * [❓ How do you read and write to a file in Java?](#-how-do-you-read-and-write-to-a-file-in-java)
    * [❓ How can you ensure a file stream is always closed?](#-how-can-you-ensure-a-file-stream-is-always-closed)
    * [❓ What exception should you handle while dealing with file input/output?](#-what-exception-should-you-handle-while-dealing-with-file-inputoutput)
  * [📚 Summary](#-summary)
<!-- TOC -->

## 📌 Overview

Java provides the `java.io.File` class and various file handling APIs to create, delete, read, and write files and
directories. Mastering file operations is essential for working with data storage, logging, configuration, or processing
external resources.

---

## 📘 Key Concepts

### ✅ `File` Class

The `File` class represents a file or directory path in the filesystem.

```java
File file = new File("example.txt");
```

### 🔹 Key Methods of the `File` Class

| Method                                  | Description                                         |
|-----------------------------------------|-----------------------------------------------------|
| `createNewFile()`                       | Creates a new, empty file                           |
| `exists()`                              | Checks if file/directory exists                     |
| `delete()`                              | Deletes a file or directory                         |
| `mkdir()`                               | Creates a single directory                          |
| `mkdirs()`                              | Creates directories including necessary parent dirs |
| `getName()`                             | Returns the name of the file or directory           |
| `length()`                              | Returns the size in bytes                           |
| `canRead()`/`canWrite()`/`canExecute()` | Permission checks                                   |

---

## 📄 Example: File Creation and Properties

```java
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

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
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

---

## 📝 Reading from a File

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
```

---

## ✍️ Writing to a File

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, Java I/O!\nThis is file handling in action.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

---

## 🧠 Real-World Scenarios

| Scenario            | Description                                      |
|---------------------|--------------------------------------------------|
| Logging             | Write logs to a file for audit or debug purposes |
| Config Files        | Read external settings for applications          |
| Report Generation   | Export data or analysis results                  |
| File-based Cache    | Save temporary data locally                      |
| User-uploaded Files | Store and process files in server-side apps      |

---

## ✅ Best Practices

- Always close file streams to avoid memory leaks.
- Use `try-with-resources` for automatic closing.
- Check if the file exists before reading or writing.
- Catch exceptions properly (`IOException`, `FileNotFoundException`).
- Avoid hardcoded paths; use relative paths or config files.
- Use buffering (`BufferedReader/Writer`) for efficiency with large files.

---

## 💬 Interview Questions & Answers

### ❓ What is the `File` class in Java?

**Answer:** It represents an abstract pathname to a file or directory and provides methods to create, delete, and
inspect files or directories.

### ❓ How do you read and write to a file in Java?

**Answer:** Use classes like `FileReader`, `BufferedReader`, `Scanner` for reading, and `FileWriter`, `BufferedWriter`
for writing.

### ❓ How can you ensure a file stream is always closed?

**Answer:** Use the `try-with-resources` statement (available since Java 7), which automatically closes resources.

### ❓ What exception should you handle while dealing with file input/output?

**Answer:** Typically `IOException`, `FileNotFoundException`.

---

## 📚 Summary

File handling in Java is foundational for many types of applications. It enables reading and writing data persistently
and interacting with the operating system's file system through a high-level abstraction.

