import java.io.*;
import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        String s;

        try (BufferedReader br = new BufferedReader (new FileReader("test.txt"))) {
                    while ((s = br.readLine()) != null)
            {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



