package lesson10_v2;

import javax.swing.*;
import java.awt.*;

public class ImageViewerFrame extends JFrame {
    private ImagePanel imagePanel;

    public ImageViewerFrame() {
        super("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        imagePanel = new ImagePanel();
        add(imagePanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");
        JButton addButton = new JButton("Add Image");
        JButton deleteButton = new JButton("Delete Image");
        JButton cropButton = new JButton("Crop");
        JButton rotateButton = new JButton("Rotate");
        JButton resizeButton = new JButton("Resize");

        prevButton.addActionListener(e -> imagePanel.showPreviousImage());
        nextButton.addActionListener(e -> imagePanel.showNextImage());
        addButton.addActionListener(e -> imagePanel.addImage());
        deleteButton.addActionListener(e -> imagePanel.deleteImage());
        // cropButton.addActionListener(e -> imagePanel.cropImage());
        // rotateButton.addActionListener(e -> imagePanel.rotateImage());
        // resizeButton.addActionListener(e -> imagePanel.resizeImage());

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(cropButton);
        buttonPanel.add(rotateButton);
        buttonPanel.add(resizeButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
