package lesson7.Assignment;

import java.io.*;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        // Get file name from user or use a specific file
        String filename = "your_file.txt"; // Replace with desired file name

        try (FileWriter writer = new FileWriter(filename, true)) { // Open in append mode
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text to append: ");
            String text = scanner.nextLine();
            writer.write(text);
            System.out.println("Text appended to file successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
