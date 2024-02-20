package lesson10_v2;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ImagePanel extends JPanel implements ImageEditor { // Class definition for ImagePanel implementing
                                                                // ImageEditor interface

    private JLabel imageLabel; // JLabel to display images
    private ImageService imageService; // Service to interact with images in the database
    private List<Integer> imageIds; // List to store IDs of images in the database
    private int currentIndex; // Index of the currently displayed image
    private double currentRotation = 0; // Current rotation angle of the image

    public ImagePanel() { // Constructor for ImagePanel
        setLayout(new BorderLayout()); // Set BorderLayout as the layout manager
        imageLabel = new JLabel(); // Initialize JLabel for displaying images
        add(imageLabel, BorderLayout.CENTER); // Add imageLabel to the center of the panel
        imageService = new ImageService(); // Initialize ImageService to interact with images
        imageIds = new ArrayList<>(); // Initialize list to store image IDs
        currentIndex = -1; // Initialize current index to -1 indicating no image is currently displayed
    }

    @Override
    public void displayImage(BufferedImage resizedImage) { // Method to display a resized image
        SwingUtilities.invokeLater(() -> { // Execute on the Event Dispatch Thread
            try {
                if (resizedImage != null) { // Check if resized image is not null
                    Dimension parentSize = getSize(); // Get the size of the parent container
                    ImageIcon imageIcon = new ImageIcon( // Create an ImageIcon from the resized image
                            resizedImage.getScaledInstance(parentSize.width, parentSize.height, Image.SCALE_SMOOTH));
                    imageLabel.setIcon(imageIcon); // Set the ImageIcon as the icon of the imageLabel
                    int x = (parentSize.width - imageIcon.getIconWidth()) / 2; // Calculate x-coordinate for centering
                    int y = (parentSize.height - imageIcon.getIconHeight()) / 2; // Calculate y-coordinate for centering
                    imageLabel.setBounds(x, y, imageIcon.getIconWidth(), imageIcon.getIconHeight()); // Set bounds for
                                                                                                     // imageLabel
                } else {
                    imageLabel.setIcon(null); // If resized image is null, clear the icon of the imageLabel
                }
            } catch (Exception e) { // Catch any exceptions that occur
                JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage()); // Display error message
            }
        });
    }

    @Override
    public void showPreviousImage() { // Method to display the previous image
        if (currentIndex > 0) { // Check if there is a previous image
            currentIndex--; // Decrement currentIndex
            try {
                displayCurrentImage(); // Display the current image
            } catch (SQLException e) { // Catch SQL exceptions
                e.printStackTrace(); // Print stack trace
            }
        } else {
            JOptionPane.showMessageDialog(this, "No previous image available."); // Display message if no previous image
        }
    }

    @Override
    public void showNextImage() { // Method to display the next image
        if (currentIndex < imageIds.size() - 1) { // Check if there is a next image
            currentIndex++; // Increment currentIndex
            try {
                displayCurrentImage(); // Display the current image
            } catch (SQLException e) { // Catch SQL exceptions
                e.printStackTrace(); // Print stack trace
            }
        } else {
            JOptionPane.showMessageDialog(this, "No next image available."); // Display message if no next image
        }
    }

    @Override
    public void addImage() { // Method to add an image
        JFileChooser fileChooser = new JFileChooser(); // Create a file chooser dialog
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png")); // Set file filter
                                                                                                     // for image files
        int result = fileChooser.showOpenDialog(this); // Show the file chooser dialog
        if (result == JFileChooser.APPROVE_OPTION) { // If a file is selected
            File selectedFile = fileChooser.getSelectedFile(); // Get the selected file
            imageService.insertImage(selectedFile); // Insert the selected image into the database
            try {
                displayAllImages(); // Display all images after adding the new image
            } catch (SQLException e) { // Catch SQL exceptions
                e.printStackTrace(); // Print stack trace
                JOptionPane.showMessageDialog(this, "Error adding image: " + e.getMessage()); // Display error message
            }
        }
    }

    @Override
    public void deleteImage() { // Method to delete the currently displayed image
        if (currentIndex >= 0 && currentIndex < imageIds.size()) { // Check if currentIndex is valid
            try {
                imageService.deleteImage(imageIds.get(currentIndex)); // Delete the image with the current ID
                displayAllImages(); // Refresh images after deletion
            } catch (SQLException e) { // Catch SQL exceptions
                e.printStackTrace(); // Print stack trace
                JOptionPane.showMessageDialog(this, "Error deleting image: " + e.getMessage()); // Display error message
            }
        } else {
            JOptionPane.showMessageDialog(this, "No image to delete."); // Display message if no image to delete
        }
    }

    @Override
    public BufferedImage crop(BufferedImage image, int x, int y, int width, int height) { // Method to crop an image
        return image.getSubimage(x, y, width, height); // Return the cropped subimage
    }

    @Override
    public BufferedImage rotate(BufferedImage image, double angle) { // Method to rotate an image
        // Rotate the image by the specified angle
        BufferedImage rotatedImage = ImageUtils.rotate(image, angle); // Rotate the image using ImageUtils class
        return rotatedImage; // Return the rotated image
    }

    @Override
    public BufferedImage resize(BufferedImage image, int width, int height) { // Method to resize an image
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH); // Scale the image
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); // Create a new
                                                                                                    // BufferedImage
        Graphics2D g2d = resizedImage.createGraphics(); // Get graphics context
        g2d.drawImage(scaledImage, 0, 0, null); // Draw the scaled image
        g2d.dispose(); // Release resources
        return resizedImage; // Return the resized image
    }

    private BufferedImage getCurrentImage() throws SQLException { // Method to get the currently displayed image
        return imageService.getImage(imageIds.get(currentIndex)); // Return the image corresponding to the current index
    }

    private void displayAllImages() throws SQLException { // Method to display all images
        imageIds.clear(); // Clear the list of image IDs
        List<BufferedImage> images = imageService.getAllImages(); // Get all images from the database
        for (BufferedImage image : images) { // Iterate through the images
            imageIds.add(imageService.getCurrentImageId()); // Add the current image ID to the list
        }
        currentIndex = 0; // Set currentIndex to 0
        if (!images.isEmpty()) { // If there are images
            displayImage(images.get(currentIndex)); // Display the first image
        } else {
            displayImage(null); // Display no image if there are no images
        }
    }

    private void displayCurrentImage() throws SQLException { // Method to display the current image
        BufferedImage image = imageService.getImage(imageIds.get(currentIndex)); // Get the current image
        displayImage(image); // Display the image
    }
}
