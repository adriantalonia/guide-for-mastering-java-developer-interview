package _1_5_Java_I_O._1_5_2_streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamsExamples {

    private static final String BYTE_FILE = "byte_output.txt";
    private static final String CHAR_FILE = "char_output.txt";

    public static void main(String[] args) {
        writeBytes();
        readBytes();

        writeCharacters();
        readCharacters();

        readWithBufferedReader();
    }

    // Example 1: Writing bytes to a file using OutputStream (Byte Stream)
    public static void writeBytes() {
        String data = "Hello, Byte Streams!";
        try (OutputStream out = new FileOutputStream(BYTE_FILE)) {
            out.write(data.getBytes());
            System.out.println("[Byte Write] Data written successfully.");
        } catch (IOException e) {
            System.err.println("[Byte Write] Error: " + e.getMessage());
        }
    }

    // Example 2: Reading bytes from a file using InputStream (Byte Stream)
    public static void readBytes() {
        System.out.println("[Byte Read] Reading from file:");
        try (InputStream in = new FileInputStream(BYTE_FILE)) {
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                System.out.print((char) byteRead);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("[Byte Read] Error: " + e.getMessage());
        }
    }

    // Example 3: Writing characters to a file using Writer (Character Stream)
    public static void writeCharacters() {
        String text = "Hello, Character Streams!";
        try (Writer writer = new FileWriter(CHAR_FILE)) {
            writer.write(text);
            System.out.println("[Char Write] Characters written successfully.");
        } catch (IOException e) {
            System.err.println("[Char Write] Error: " + e.getMessage());
        }
    }

    // Example 4: Reading characters from a file using Reader (Character Stream)
    public static void readCharacters() {
        System.out.println("[Char Read] Reading from file:");
        try (Reader reader = new FileReader(CHAR_FILE)) {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("[Char Read] Error: " + e.getMessage());
        }
    }

    // Example 5: Using BufferedReader to read text file line-by-line
    public static void readWithBufferedReader() {
        System.out.println("[BufferedReader] Reading with BufferedReader:");
        try (BufferedReader br = new BufferedReader(new FileReader(CHAR_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("[BufferedReader] Error: " + e.getMessage());
        }
    }
}

