# 1.5.2 Streams (Byte and Character Streams)

<!-- TOC -->
* [1.5.2 Streams (Byte and Character Streams)](#152-streams-byte-and-character-streams)
  * [🔸 Byte Streams](#-byte-streams)
    * [🔹 Key Classes:](#-key-classes)
    * [🔹 Common Subclasses:](#-common-subclasses)
    * [🔹 Example:](#-example)
  * [🔸 Character Streams](#-character-streams)
    * [🔹 Key Classes:](#-key-classes-1)
    * [🔹 Common Subclasses:](#-common-subclasses-1)
    * [🔹 Example:](#-example-1)
  * [🔸 Buffered Streams](#-buffered-streams)
    * [🔹 Example with BufferedReader:](#-example-with-bufferedreader)
  * [✅ Best Practices](#-best-practices)
  * [💡 Real-world Scenarios](#-real-world-scenarios)
  * [🎯 Interview Questions](#-interview-questions)
    * [Q1: What is the difference between `InputStream` and `Reader`?](#q1-what-is-the-difference-between-inputstream-and-reader)
    * [Q2: Why should you use buffered streams?](#q2-why-should-you-use-buffered-streams)
    * [Q3: What is the advantage of using try-with-resources?](#q3-what-is-the-advantage-of-using-try-with-resources)
    * [Q4: How do you read a file line-by-line in Java?](#q4-how-do-you-read-a-file-line-by-line-in-java)
  * [📎 References](#-references)
<!-- TOC -->

Java provides powerful I/O (Input/Output) APIs in the `java.io` and `java.nio` packages. A central concept is the *
*stream**, which represents a flow of data. There are two main types of streams:

- **Byte Streams**: Used to handle binary data (images, audio, etc.)
- **Character Streams**: Used to handle character/text data

---

## 🔸 Byte Streams

Byte streams are based on 8-bit bytes and are used for processing raw binary data.

### 🔹 Key Classes:

- `InputStream`: Abstract class for reading byte streams
- `OutputStream`: Abstract class for writing byte streams

### 🔹 Common Subclasses:

- `FileInputStream`, `FileOutputStream`
- `BufferedInputStream`, `BufferedOutputStream`
- `ByteArrayInputStream`, `ByteArrayOutputStream`

### 🔹 Example:

```java
import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) {
        String data = "Hello, Byte Streams!";

        // Writing bytes to a file
        try (OutputStream out = new FileOutputStream("byte_output.txt")) {
            out.write(data.getBytes());
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading bytes from a file
        try (InputStream in = new FileInputStream("byte_output.txt")) {
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## 🔸 Character Streams

Character streams use 16-bit Unicode and are used for handling character/text data.

### 🔹 Key Classes:

- `Reader`: Abstract class for reading character streams
- `Writer`: Abstract class for writing character streams

### 🔹 Common Subclasses:

- `FileReader`, `FileWriter`
- `BufferedReader`, `BufferedWriter`
- `CharArrayReader`, `CharArrayWriter`

### 🔹 Example:

```java
import java.io.*;

public class CharacterStreamExample {
    public static void main(String[] args) {
        String text = "Hello, Character Streams!";

        // Writing characters to a file
        try (Writer writer = new FileWriter("char_output.txt")) {
            writer.write(text);
            System.out.println("Characters written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading characters from a file
        try (Reader reader = new FileReader("char_output.txt")) {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## 🔸 Buffered Streams

Buffered streams wrap around regular streams to improve efficiency by reducing disk access frequency.

### 🔹 Example with BufferedReader:

```java
import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("char_output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## ✅ Best Practices

- Always close streams (use try-with-resources)
- Use buffered streams for better performance
- Handle exceptions gracefully
- Avoid hardcoding paths
- Prefer `Files` class (from `java.nio.file`) for modern use cases

---

## 💡 Real-world Scenarios

- Reading/writing config files
- Processing logs
- Handling binary image/audio files
- Streaming large files over the network

---

## 🎯 Interview Questions

### Q1: What is the difference between `InputStream` and `Reader`?

**A:** `InputStream` reads raw bytes, whereas `Reader` reads characters. Use `InputStream` for binary data and `Reader`
for text.

### Q2: Why should you use buffered streams?

**A:** Buffered streams reduce I/O operations by reading/writing larger chunks of data at once, improving performance.

### Q3: What is the advantage of using try-with-resources?

**A:** It ensures streams are closed automatically, avoiding resource leaks and improving code readability.

### Q4: How do you read a file line-by-line in Java?

**A:** Using `BufferedReader.readLine()` inside a loop is a common way to read files line-by-line.

---

## 📎 References

- [Java I/O Documentation](https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html)
- [NIO File API](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html)

---

> Next: [1.5.3 Serialization and Deserialization](_1_5_3_serialization_and_deserialization/README.md) 🔗


