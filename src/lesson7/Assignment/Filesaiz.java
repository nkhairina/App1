package lesson7.Assignment;

import java.io.File;

// Extending ReadFileHandler to utilize its functionality
public class Filesaiz extends ReadFileHandler {

    // Constructor to initialize with filename
    public Filesaiz(String filename) {
        super(filename); // Calling superclass constructor
    }

    // Method to get the size of the file
    public long getFileSize() {
        File file = new File(super.getFilename()); // Creating a File object with the given filename
        if (file.exists()) { // Checking if the file exists
            return file.length(); // Returning the length of the file
        } else {
            System.out.println("Error: File not found."); // Printing error message if file not found
            return -1; // Indicate error by returning -1
        }
    }
}

// Inherits from ReadFileHandler to access getFilename().
// Constructor takes the filename and calls super(filename).
// getFileSize() uses super.getFilename() to get the filename.
