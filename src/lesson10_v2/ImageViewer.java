package lesson10_v2;

import java.sql.SQLException;

// Import necessary packages
import javax.swing.*;

// Main class ImageViewer
public class ImageViewer {
    // Main method
    public static void main(String[] args) throws SQLException {
        // Invoke the event dispatch thread using SwingUtilities.invokeLater()
        SwingUtilities.invokeLater(() -> {
            // Create an instance of ImageViewerFrame
            ImageViewerFrame frame = new ImageViewerFrame();
            // Set the frame to be visible
            frame.setVisible(true);
        });
    }
}
