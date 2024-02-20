package lesson10_v2;

// Import necessary packages
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// Utility class for image operations
public class ImageUtils {

    // Method to load an image from file
    public static BufferedImage loadImage(File file) throws IOException {
        return ImageIO.read(file);
    }

    // Method to save an image to file
    public static void saveImage(BufferedImage image, File file, String format) throws IOException {
        ImageIO.write(image, format, file);
    }

    // Method to crop an image
    public static BufferedImage crop(BufferedImage image, int x, int y, int width, int height) {
        return image.getSubimage(x, y, width, height);
    }

    // Method to rotate an image
    public static BufferedImage rotate(BufferedImage image, double angle) {
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(angle), image.getWidth() / 2, image.getHeight() / 2);
        AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
        return op.filter(image, null);
    }

    // Method to resize an image
    public static BufferedImage resize(BufferedImage image, int width, int height) {
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(scaledImage, 0, 0, null);
        g2d.dispose();
        return resizedImage;
    }

    public static BufferedImage cropImage(BufferedImage currentImage, int x, int y, int width, int height) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cropImage'");
    }

    public static byte[] imageToByteArray(BufferedImage image) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imageToByteArray'");
    }
}