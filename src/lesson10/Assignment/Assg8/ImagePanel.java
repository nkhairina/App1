package lesson10.Assignment.Assg8;

// Import necessary packages

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Class representing an image panel for displaying and editing images
public class ImagePanel extends JPanel implements ImageEditor {

    // JLabel to display the image
    private JLabel imageLabel;
    // List to store image files
    private List<File> imageFiles;
    // Index of the current image being displayed
    private int currentIndex;
    // Variable to track current rotation angle
    private double currentRotation = 0;

    // Constructor to initialize the image panel
    public ImagePanel() {
        // Set layout to BorderLayout
        setLayout(new BorderLayout());
        // Initialize JLabel for displaying the image
        imageLabel = new JLabel();
        // Add JLabel to the center of the panel
        add(imageLabel, BorderLayout.CENTER);

        // Initialize the list to store image files
        imageFiles = new ArrayList<>();
        // Set initial current index to -1 (no image selected)
        currentIndex = -1;
    }

    // Method to display an image on the panel
    @Override
    public void displayImage(BufferedImage resizedImage) {
        // Ensure UI operations run on the event dispatch thread
        SwingUtilities.invokeLater(() -> {
            try {
                // Set the icon of the JLabel to display the resized image
                if (resizedImage != null) {
                    // Get the size of the parent container (the panel)
                    Dimension parentSize = getSize();

                    // Create a scaled version of the image
                    ImageIcon imageIcon = new ImageIcon(
                            resizedImage.getScaledInstance(parentSize.width, parentSize.height, Image.SCALE_SMOOTH));

                    // Set the icon of the JLabel to the scaled image
                    imageLabel.setIcon(imageIcon);

                    // Center the image in the panel
                    int x = (parentSize.width - imageIcon.getIconWidth()) / 2;
                    int y = (parentSize.height - imageIcon.getIconHeight()) / 2;
                    imageLabel.setBounds(x, y, imageIcon.getIconWidth(), imageIcon.getIconHeight());
                } else {
                    imageLabel.setIcon(null);
                }
            } catch (Exception e) {
                // Show error message if there's an exception while loading the image
                JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage());
            }
        });
    }

    // Method to show the previous image
    @Override
    public void showPreviousImage() {
        if (currentIndex > 0) {
            currentIndex--;
            try {
                displayImage(loadImage(imageFiles.get(currentIndex)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No previous image available.");
        }
    }

    // Method to show the next image
    @Override
    public void showNextImage() {
        if (currentIndex < imageFiles.size() - 1) {
            currentIndex++;
            try {
                displayImage(loadImage(imageFiles.get(currentIndex)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No next image available.");
        }
    }

    // Method to add an image to the panel
    @Override
    public void addImage() {
        // Open file chooser dialog to select an image file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imageFiles.add(selectedFile);
            currentIndex = imageFiles.size() - 1;
            try {
                displayImage(loadImage(selectedFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to delete the current image from the panel
    @Override
    public void deleteImage() {
        if (currentIndex >= 0 && currentIndex < imageFiles.size()) {
            File fileToRemove = imageFiles.remove(currentIndex);
            currentIndex = Math.min(currentIndex, imageFiles.size() - 1);
            try {
                displayImage(currentIndex >= 0 ? loadImage(imageFiles.get(currentIndex)) : null);
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Image deleted: " + fileToRemove.getName());
        } else {
            JOptionPane.showMessageDialog(this, "No image to delete.");
        }
    }

    // Method to crop an image
    @Override
    public BufferedImage crop(BufferedImage image, int x, int y, int width, int height) {
        return image.getSubimage(x, y, width, height);
    }

    // Method to rotate an image
    @Override
    public BufferedImage rotate(BufferedImage image, double angle) {
        // Rotate the image by 90 degrees using ImageUtils
        BufferedImage rotatedImage = ImageUtils.rotate(image, angle);
        return rotatedImage;
    }

    // Method to resize an image
    @Override
    public BufferedImage resize(BufferedImage image, int width, int height) {
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(scaledImage, 0, 0, null);
        g2d.dispose();
        return resizedImage;
    }

    // Method to crop the current image
    public void cropImage() {
        BufferedImage currentImage = getCurrentImage();
        if (currentImage != null) {
            // Prompt user for cropping coordinates and dimensions
            // (replace with your desired UI implementation)
            int x = 0;
            int y = 0;
            int width = 200;
            int height = 150;

            // Perform cropping
            BufferedImage croppedImage = crop(currentImage, x, y, width, height);

            // Display the cropped image
            displayImage(croppedImage);
        }
    }

    // Method to rotate the current image
    public void rotateImage() {
        if (currentIndex >= 0 && currentIndex < imageFiles.size()) {
            try {
                // Load the current image
                BufferedImage image = ImageUtils.loadImage(imageFiles.get(currentIndex));

                // Update rotation angle (0, 90, 180, 270)
                currentRotation = (currentRotation + 90) % 360;

                // Rotate the image using the updated angle
                BufferedImage rotatedImage = rotate(image, currentRotation);

                // Display the rotated image
                displayImage(rotatedImage);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No image to rotate.");
        }
    }

    public void resizeImage() {
        BufferedImage currentImage = getCurrentImage();
        if (currentImage != null) {
            // Show a dialog to get user input for width and height
            String widthStr = JOptionPane.showInputDialog(this, "Enter desired width:");
            if (widthStr == null) {
                return; // User canceled the dialog
            }
            int newWidth;
            try {
                newWidth = Integer.parseInt(widthStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid width: " + widthStr);
                return;
            }

            String heightStr = JOptionPane.showInputDialog(this, "Enter desired height:");
            if (heightStr == null) {
                return; // User canceled the dialog
            }
            int newHeight;
            try {
                newHeight = Integer.parseInt(heightStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid height: " + heightStr);
                return;
            }

            // Perform resizing
            BufferedImage resizedImage = resize(currentImage, newWidth, newHeight);

            // Display the resized image
            displayImage(resizedImage);
        }
    }

    // Method to get the current image
    private BufferedImage getCurrentImage() {
        if (currentIndex >= 0 && currentIndex < imageFiles.size()) {
            try {
                return loadImage(imageFiles.get(currentIndex));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error loading current image: " + e.getMessage());
            }
        }
        return null;
    }

    // Method to load an image from file
    private BufferedImage loadImage(File file) throws IOException {
        return ImageIO.read(file);
    }
}
