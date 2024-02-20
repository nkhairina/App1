package lesson10.Assignment.Assg8;

// Import necessary packages
import javax.swing.*;

// Main class ImageViewer
public class ImageViewer {
    // Main method
    public static void main(String[] args) {
        // Invoke the event dispatch thread using SwingUtilities.invokeLater()
        SwingUtilities.invokeLater(() -> {
            // Create an instance of ImageViewerFrame
            ImageViewerFrame frame = new ImageViewerFrame();
            // Set the frame to be visible
            frame.setVisible(true);
        });
    }
}
