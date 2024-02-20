package lesson7.Assignment;

package lesson.lesson7.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    private String fileName;

    public WriteFile(String fileName) throws IOException{
        this.fileName = fileName;
    }

    public void write(String text) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.close();
        System.out.println("The file were overwrite.");
    }
}
