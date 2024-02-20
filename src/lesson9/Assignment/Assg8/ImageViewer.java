package lesson9.Assignment.Assg8;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ImageViewer extends JFrame { // Class definition for the ImageViewer, extending JFrame
    private JLabel imageLabel; // JLabel to display the image
    private List<File> imageFiles; // List to store image files
    private int currentIndex; // Index of the currently displayed image

    public ImageViewer() { // Constructor for the ImageViewer class
        super("Image Viewer"); // Call to the superclass constructor with window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        setSize(800, 600); // Set size of the window
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout()); // Set layout manager for the frame

        imageFiles = new ArrayList<>(); // Initialize the list of image files
        currentIndex = -1; // Initialize the current index to -1

        // Create components
        imageLabel = new JLabel(); // JLabel to display images
        JButton prevButton = new JButton("Previous"); // Button to display previous image
        JButton nextButton = new JButton("Next"); // Button to display next image
        JButton addButton = new JButton("Add Image"); // Button to add image
        JButton deleteButton = new JButton("Delete Image"); // Button to delete image

        // Add event listeners
        prevButton.addActionListener(e -> showPreviousImage()); // Add action listener for previous button
        nextButton.addActionListener(e -> showNextImage()); // Add action listener for next button
        addButton.addActionListener(e -> addImage()); // Add action listener for add button
        deleteButton.addActionListener(e -> deleteImage()); // Add action listener for delete button

        // Add components to the frame
        JPanel buttonPanel = new JPanel(new FlowLayout()); // Panel to hold buttons
        buttonPanel.add(prevButton); // Add previous button
        buttonPanel.add(nextButton); // Add next button
        buttonPanel.add(addButton); // Add add button
        buttonPanel.add(deleteButton); // Add delete button

        add(imageLabel, BorderLayout.CENTER); // Add image label to the center of the frame
        add(buttonPanel, BorderLayout.SOUTH); // Add button panel to the bottom of the frame

        setVisible(true); // Make the frame visible
    }

    private void displayImage(File file) { // Method to display image
        if (file != null && file.exists()) { // Check if the file exists
            ImageIcon icon = new ImageIcon(file.getPath()); // Create ImageIcon from file path
            imageLabel.setIcon(icon); // Set the icon to the label
        } else {
            imageLabel.setIcon(null); // If file doesn't exist, clear the label
        }
    }

    private void showPreviousImage() { // Method to display previous image
        if (currentIndex > 0) { // Check if there is a previous image
            currentIndex--; // Decrement the current index
            displayImage(imageFiles.get(currentIndex)); // Display the previous image
        } else {
            JOptionPane.showMessageDialog(this, "No previous image available."); // Show message if no previous image
        }
    }

    private void showNextImage() { // Method to display next image
        if (currentIndex < imageFiles.size() - 1) { // Check if there is a next image
            currentIndex++; // Increment the current index
            displayImage(imageFiles.get(currentIndex)); // Display the next image
        } else {
            JOptionPane.showMessageDialog(this, "No next image available."); // Show message if no next image
        }
    }

    private void addImage() { // Method to add image
        JFileChooser fileChooser = new JFileChooser(); // Create file chooser
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png")); // Set file filter
        int result = fileChooser.showOpenDialog(this); // Show open dialog
        if (result == JFileChooser.APPROVE_OPTION) { // If user selects a file
            File selectedFile = fileChooser.getSelectedFile(); // Get the selected file
            imageFiles.add(selectedFile); // Add the file to the list
            currentIndex = imageFiles.size() - 1; // Update current index
            displayImage(selectedFile); // Display the added image
        }
    }

    private void deleteImage() { // Method to delete image
        if (currentIndex >= 0 && currentIndex < imageFiles.size()) { // Check if there is an image to delete
            File fileToRemove = imageFiles.remove(currentIndex); // Remove the file from the list
            currentIndex = Math.min(currentIndex, imageFiles.size() - 1); // Update current index
            displayImage(currentIndex >= 0 ? imageFiles.get(currentIndex) : null); // Display the next image if
                                                                                   // available
            JOptionPane.showMessageDialog(this, "Image deleted: " + fileToRemove.getName()); // Show delete confirmation
                                                                                             // message
        } else {
            JOptionPane.showMessageDialog(this, "No image to delete."); // Show message if no image to delete
        }
    }

    public static void main(String[] args) { // Main method
        SwingUtilities.invokeLater(ImageViewer::new); // Create and show the GUI on the Event Dispatch Thread
    }
}
