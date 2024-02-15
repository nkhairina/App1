package lesson7.Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        String filename = "my_file.txt"; // Replace with desired file name

        try (Scanner scanner = new Scanner(System.in);
                BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            System.out.print("Enter word to search: ");
            String word = scanner.nextLine();

            boolean found = false;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Word found in the file!");
            } else {
                System.out.println("Word not found in the file!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
