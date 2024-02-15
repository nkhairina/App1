package lesson7.Assignment;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        // Get source and target file names from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String sourceFile = scanner.nextLine();
        System.out.print("Enter target file name: ");
        String targetFile = scanner.nextLine();

        try (FileInputStream in = new FileInputStream(sourceFile);
                FileOutputStream out = new FileOutputStream(targetFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
