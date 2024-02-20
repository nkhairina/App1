package lesson10_v2;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class ImageService {
    // Database connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Yusfazila123";

    // Method to insert an image into the database
    public void insertImage(File file) {
        String INSERT_SQL = "INSERT INTO images (name, data) VALUES (?, ?)"; // SQL query to insert image data into the
                                                                             // database
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); // Establish a
                                                                                                      // database
                                                                                                      // connection
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) { // Prepare the SQL
                                                                                                 // statement
            preparedStatement.setString(1, file.getName()); // Set the filename as a parameter
            try (InputStream inputStream = new FileInputStream(file)) { // Open an input stream to read the image file
                preparedStatement.setBinaryStream(2, inputStream); // Set the input stream as a parameter for the SQL
                                                                   // statement
                preparedStatement.executeUpdate(); // Execute the SQL statement to insert the image data into the
                                                   // database
            }
        } catch (SQLException | IOException e) { // Catch SQL and IO exceptions
            e.printStackTrace(); // Print the stack trace if an exception occurs
        }
    }

    // Method to retrieve all images from the database
    public List<BufferedImage> getAllImages() {
        List<BufferedImage> images = new ArrayList<>(); // Initialize a list to store images
        String SELECT_SQL = "SELECT data FROM images"; // SQL query to select image data from the database
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); // Establish a
                                                                                                      // database
                                                                                                      // connection
                Statement statement = connection.createStatement(); // Create a statement for executing SQL queries
                ResultSet resultSet = statement.executeQuery(SELECT_SQL)) { // Execute the SQL query to retrieve image
                                                                            // data
            while (resultSet.next()) { // Iterate through the result set
                byte[] imageData = resultSet.getBytes("data"); // Get the image data from the result set
                if (imageData != null) { // Check if image data is not null
                    try (InputStream inputStream = new ByteArrayInputStream(imageData)) { // Create an input stream from
                                                                                          // the image data
                        BufferedImage image = ImageIO.read(inputStream); // Read the image from the input stream
                        images.add(image); // Add the image to the list of images
                    }
                }
            }
        } catch (SQLException | IOException e) { // Catch SQL and IO exceptions
            e.printStackTrace(); // Print the stack trace if an exception occurs
        }
        return images; // Return the list of images
    }

    // Method to retrieve an image from the database by its ID
    public BufferedImage getImage(int id) {
        String SELECT_SQL = "SELECT data FROM images WHERE id = ?"; // SQL query to select image data by ID
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); // Establish a
                                                                                                      // database
                                                                                                      // connection
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SQL)) { // Prepare the SQL
                                                                                                 // statement
            preparedStatement.setInt(1, id); // Set the ID as a parameter
            try (ResultSet resultSet = preparedStatement.executeQuery()) { // Execute the SQL query to retrieve image
                                                                           // data
                if (resultSet.next()) { // Check if the result set contains data
                    byte[] imageData = resultSet.getBytes("data"); // Get the image data from the result set
                    if (imageData != null) { // Check if image data is not null
                        try (InputStream inputStream = new ByteArrayInputStream(imageData)) { // Create an input stream
                                                                                              // from the image data
                            return ImageIO.read(inputStream); // Read the image from the input stream
                        }
                    }
                }
            }
        } catch (SQLException | IOException e) { // Catch SQL and IO exceptions
            e.printStackTrace(); // Print the stack trace if an exception occurs
        }
        return null; // Return null if the image cannot be retrieved
    }

    // Method to get the ID of the last inserted image
    public int getCurrentImageId() {
        String SELECT_SQL = "SELECT LAST_INSERT_ID()"; // SQL query to retrieve the ID of the last inserted image
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); // Establish a
                                                                                                      // database
                                                                                                      // connection
                Statement statement = connection.createStatement(); // Create a statement for executing SQL queries
                ResultSet resultSet = statement.executeQuery(SELECT_SQL)) { // Execute the SQL query
            if (resultSet.next()) { // Check if the result set contains data
                return resultSet.getInt(1); // Return the ID of the last inserted image
            }
        } catch (SQLException e) { // Catch SQL exceptions
            e.printStackTrace(); // Print the stack trace if an exception occurs
        }
        return -1; // Return -1 if the ID cannot be retrieved
    }

    // Method to delete an image from the database by its ID
    public void deleteImage(int id) {
        String DELETE_SQL = "DELETE FROM images WHERE id = ?"; // SQL query to delete an image by ID
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); // Establish a
                                                                                                      // database
                                                                                                      // connection
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SQL)) { // Prepare the SQL
                                                                                                 // statement
            preparedStatement.setInt(1, id); // Set the ID as a parameter
            preparedStatement.executeUpdate(); // Execute the SQL statement to delete the image
        } catch (SQLException e) { // Catch SQL exceptions
            e.printStackTrace(); // Print the stack trace if an exception occurs
        }
    }
}