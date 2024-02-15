package lesson7.Assignment;

import java.io.*;
import java.util.Scanner;

public class FileEncryption {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Input and output file name prompts
        System.out.print("Enter input file name: ");
        String inputFile = scanner.nextLine();
        System.out.print("Enter output file name: ");
        String outputFile = scanner.nextLine();

        // Prompt for shift amount (positive to shift right, negative to left)
        System.out.print("Enter shift amount (positive to shift right, negative to left): ");
        int shift = scanner.nextInt();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder encryptedLine = new StringBuilder();

                // Encrypt each character in the line
                for (char c : line.toCharArray()) {
                    // Apply XOR operation with shift amount for encryption
                    char encryptedChar = (char) (c ^ shift);
                    encryptedLine.append(encryptedChar);
                }

                // Write the encrypted line to the output file
                writer.write(encryptedLine.toString());
                writer.newLine(); // Add newline character
            }

            System.out.println("File encrypted successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }
    }
}
