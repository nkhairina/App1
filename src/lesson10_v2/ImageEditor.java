package lesson10_v2;

import java.awt.image.BufferedImage;

// Interface for image editing operations
public interface ImageEditor {

    // Method to display an image
    void displayImage(BufferedImage resizedImage);

    // Method to crop an image
    BufferedImage crop(BufferedImage image, int x, int y, int width, int height);

    // Method to rotate an image
    BufferedImage rotate(BufferedImage image, double angle);

    // Method to resize an image
    BufferedImage resize(BufferedImage image, int width, int height);

    // Method to show the previous image
    void showPreviousImage();

    // Method to show the next image
    void showNextImage();

    // Method to add an image
    void addImage();

    // Method to delete an image
    void deleteImage();
}
