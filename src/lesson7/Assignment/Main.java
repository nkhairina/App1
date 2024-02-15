package lesson7.Assignment;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter the file name: "); // Prompt the user to enter the file name
        String filename = scanner.nextLine(); // Read the file name entered by the user

        // Read and print the file
        ReadFile readFile = new ReadFile(filename);
        readFile.printFile();

        // Count words
        CountWords countWords = new CountWords(filename);
        int count = countWords.countWords();
        System.out.println("Length of words: " + count);

         Write to the file
         WriteFile writeFile = new WriteFile(filename);
         writeFile.write("Write some text \n Write some more text");
         readFile.printFile();

        // Get and display file size using Files
        Filesaiz filesaiz = new Filesaiz(filename); // Create a Filesaiz object with the specified filename
        long fileSize = filesaiz.getFileSize(); // Get the size of the file

        if (fileSize != -1) { // Check if file size retrieval was successful
            System.out.println("File size: " + fileSize + " bytes"); // Print the file size
        }
    }
}
