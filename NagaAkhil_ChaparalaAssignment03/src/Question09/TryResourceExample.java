package Question09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceExample {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Failed to read file: " + e.getMessage());
        }
    }
}

