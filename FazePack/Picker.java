package FazePack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Picker {
    String filePath = "/workspaces/Code.org-Unit-2-Lesson-13a/FazePack/Members.md";

    public void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
