import java.io.*;
import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        String s, str;
        int counter = 0;
        int counter1 = 0;

        try (BufferedReader br = new BufferedReader (new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Количество строк в файле: " + counter);

        try (FileWriter fw = new FileWriter("test.txt"))
        {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            do {
                //if (counter1 == counter) break;
                System.out.println("Введите текст: ");
                str = br.readLine();
                counter1++;

                str = str + "\r\n";
                fw.write(str);
            } while (counter1 < counter);
            System.out.println("Ваши данные перезаписаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}