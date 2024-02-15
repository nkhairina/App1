package lesson7.Assignment;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name to delete: ");
        String filename = scanner.nextLine();

        File file = new File(filename);
        if (file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Error deleting file!");
        }
    }
}
